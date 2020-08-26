package typings.awsSdkTypes.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpRequest[StreamType]
  extends HttpMessage[StreamType]
     with HttpEndpoint {
  var method: String = js.native
}

object HttpRequest {
  @scala.inline
  def apply[StreamType](headers: HeaderBag, hostname: String, method: String, path: String, protocol: String): HttpRequest[StreamType] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRequest[StreamType]]
  }
  @scala.inline
  implicit class HttpRequestOps[Self <: HttpRequest[_], StreamType] (val x: Self with HttpRequest[StreamType]) extends AnyVal {
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
  }
  
}

