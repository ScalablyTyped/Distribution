package typings.awsSdkTypes.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpResponse[StreamType] extends HttpMessage[StreamType] {
  var statusCode: Double = js.native
}

object HttpResponse {
  @scala.inline
  def apply[StreamType](headers: HeaderBag, statusCode: Double): HttpResponse[StreamType] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponse[StreamType]]
  }
  @scala.inline
  implicit class HttpResponseOps[Self <: HttpResponse[_], StreamType] (val x: Self with HttpResponse[StreamType]) extends AnyVal {
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
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
  
}

