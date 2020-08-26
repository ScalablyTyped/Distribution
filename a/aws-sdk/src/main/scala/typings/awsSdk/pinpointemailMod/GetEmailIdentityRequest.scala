package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEmailIdentityRequest extends js.Object {
  /**
    * The email identity that you want to retrieve details for.
    */
  var EmailIdentity: Identity = js.native
}

object GetEmailIdentityRequest {
  @scala.inline
  def apply(EmailIdentity: Identity): GetEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEmailIdentityRequest]
  }
  @scala.inline
  implicit class GetEmailIdentityRequestOps[Self <: GetEmailIdentityRequest] (val x: Self) extends AnyVal {
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
    def setEmailIdentity(value: Identity): Self = this.set("EmailIdentity", value.asInstanceOf[js.Any])
  }
  
}

