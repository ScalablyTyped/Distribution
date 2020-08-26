package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAdmChannelRequest extends js.Object {
  var ADMChannelRequest: typings.awsSdk.pinpointMod.ADMChannelRequest = js.native
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
}

object UpdateAdmChannelRequest {
  @scala.inline
  def apply(ADMChannelRequest: ADMChannelRequest, ApplicationId: string): UpdateAdmChannelRequest = {
    val __obj = js.Dynamic.literal(ADMChannelRequest = ADMChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAdmChannelRequest]
  }
  @scala.inline
  implicit class UpdateAdmChannelRequestOps[Self <: UpdateAdmChannelRequest] (val x: Self) extends AnyVal {
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
    def setADMChannelRequest(value: ADMChannelRequest): Self = this.set("ADMChannelRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
  }
  
}

