package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEmailIdentityRequest extends js.Object {
  /**
    * The identity (that is, the email address or domain) that you want to delete from your Amazon Pinpoint account.
    */
  var EmailIdentity: Identity = js.native
}

object DeleteEmailIdentityRequest {
  @scala.inline
  def apply(EmailIdentity: Identity): DeleteEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEmailIdentityRequest]
  }
  @scala.inline
  implicit class DeleteEmailIdentityRequestOps[Self <: DeleteEmailIdentityRequest] (val x: Self) extends AnyVal {
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

