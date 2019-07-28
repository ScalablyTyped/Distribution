package typings.centra.centraMod

import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var body: Buffer
  var coreRes: IncomingMessage
  var headers: IncomingHttpHeaders
  var statusCode: js.UndefOr[Double] = js.undefined
  def json(): js.Promise[_]
  def text(): js.Promise[String]
}

object Response {
  @scala.inline
  def apply(
    body: Buffer,
    coreRes: IncomingMessage,
    headers: IncomingHttpHeaders,
    json: () => js.Promise[_],
    text: () => js.Promise[String],
    statusCode: Int | Double = null
  ): Response = {
    val __obj = js.Dynamic.literal(body = body, coreRes = coreRes, headers = headers, json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

