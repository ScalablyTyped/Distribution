package typings.centra.mod

import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var body: Buffer = js.native
  var coreRes: IncomingMessage = js.native
  var headers: IncomingHttpHeaders = js.native
  var statusCode: js.UndefOr[Double] = js.native
  def json(): js.Promise[_] = js.native
  def text(): js.Promise[String] = js.native
}

object Response {
  @scala.inline
  def apply(
    body: Buffer,
    coreRes: IncomingMessage,
    headers: IncomingHttpHeaders,
    json: () => js.Promise[_],
    text: () => js.Promise[String]
  ): Response = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], coreRes = coreRes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: Buffer): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoreRes(value: IncomingMessage): Self = this.set("coreRes", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: IncomingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setJson(value: () => js.Promise[_]): Self = this.set("json", js.Any.fromFunction0(value))
    @scala.inline
    def setText(value: () => js.Promise[String]): Self = this.set("text", js.Any.fromFunction0(value))
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
  
}

