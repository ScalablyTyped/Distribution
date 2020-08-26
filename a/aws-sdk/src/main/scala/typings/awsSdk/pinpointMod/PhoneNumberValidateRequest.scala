package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumberValidateRequest extends js.Object {
  var NumberValidateRequest: typings.awsSdk.pinpointMod.NumberValidateRequest = js.native
}

object PhoneNumberValidateRequest {
  @scala.inline
  def apply(NumberValidateRequest: NumberValidateRequest): PhoneNumberValidateRequest = {
    val __obj = js.Dynamic.literal(NumberValidateRequest = NumberValidateRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumberValidateRequest]
  }
  @scala.inline
  implicit class PhoneNumberValidateRequestOps[Self <: PhoneNumberValidateRequest] (val x: Self) extends AnyVal {
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
    def setNumberValidateRequest(value: NumberValidateRequest): Self = this.set("NumberValidateRequest", value.asInstanceOf[js.Any])
  }
  
}

