package typings.centra.mod

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
    statusCode: js.UndefOr[Double] = js.undefined
  ): Response = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], coreRes = coreRes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

