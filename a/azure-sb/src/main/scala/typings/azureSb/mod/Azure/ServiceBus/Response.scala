package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var body: Dictionary[String | js.Object] = js.native
  var headers: Dictionary[String] = js.native
  var isSuccessful: Boolean = js.native
  var md5: js.UndefOr[String] = js.native
  var statusCode: Double = js.native
}

object Response {
  @scala.inline
  def apply(
    body: Dictionary[String | js.Object],
    headers: Dictionary[String],
    isSuccessful: Boolean,
    statusCode: Double
  ): Response = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], isSuccessful = isSuccessful.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
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
    def setBody(value: Dictionary[String | js.Object]): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Dictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSuccessful(value: Boolean): Self = this.set("isSuccessful", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMd5(value: String): Self = this.set("md5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMd5: Self = this.set("md5", js.undefined)
  }
  
}

