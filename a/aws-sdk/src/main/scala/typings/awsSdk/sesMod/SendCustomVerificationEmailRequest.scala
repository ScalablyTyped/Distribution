package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendCustomVerificationEmailRequest extends js.Object {
  /**
    * Name of a configuration set to use when sending the verification email.
    */
  var ConfigurationSetName: js.UndefOr[typings.awsSdk.sesMod.ConfigurationSetName] = js.native
  /**
    * The email address to verify.
    */
  var EmailAddress: Address = js.native
  /**
    * The name of the custom verification email template to use when sending the verification email.
    */
  var TemplateName: typings.awsSdk.sesMod.TemplateName = js.native
}

object SendCustomVerificationEmailRequest {
  @scala.inline
  def apply(EmailAddress: Address, TemplateName: TemplateName): SendCustomVerificationEmailRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendCustomVerificationEmailRequest]
  }
  @scala.inline
  implicit class SendCustomVerificationEmailRequestOps[Self <: SendCustomVerificationEmailRequest] (val x: Self) extends AnyVal {
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
    def setEmailAddress(value: Address): Self = this.set("EmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateName(value: TemplateName): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = this.set("ConfigurationSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationSetName: Self = this.set("ConfigurationSetName", js.undefined)
  }
  
}

