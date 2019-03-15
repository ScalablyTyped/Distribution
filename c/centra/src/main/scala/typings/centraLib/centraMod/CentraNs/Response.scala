package typings
package centraLib.centraMod.CentraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var body: nodeLib.Buffer
  var coreRes: nodeLib.httpMod.IncomingMessage
  var headers: nodeLib.httpMod.IncomingHttpHeaders
  var statusCode: js.UndefOr[scala.Double]
  def json(): js.Promise[_]
  def text(): js.Promise[java.lang.String]
}

object Response {
  @scala.inline
  def apply(
    body: nodeLib.Buffer,
    coreRes: nodeLib.httpMod.IncomingMessage,
    headers: nodeLib.httpMod.IncomingHttpHeaders,
    json: () => js.Promise[_],
    text: () => js.Promise[java.lang.String],
    statusCode: scala.Int | scala.Double = null
  ): Response = {
    val __obj = js.Dynamic.literal(body = body, coreRes = coreRes, headers = headers, json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

