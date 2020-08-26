package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserEndpointsResponse extends js.Object {
  var EndpointsResponse: typings.awsSdk.pinpointMod.EndpointsResponse = js.native
}

object GetUserEndpointsResponse {
  @scala.inline
  def apply(EndpointsResponse: EndpointsResponse): GetUserEndpointsResponse = {
    val __obj = js.Dynamic.literal(EndpointsResponse = EndpointsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserEndpointsResponse]
  }
  @scala.inline
  implicit class GetUserEndpointsResponseOps[Self <: GetUserEndpointsResponse] (val x: Self) extends AnyVal {
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
    def setEndpointsResponse(value: EndpointsResponse): Self = this.set("EndpointsResponse", value.asInstanceOf[js.Any])
  }
  
}

