package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerificationMessageTemplateType extends js.Object {
  /**
    * The default email option.
    */
  var DefaultEmailOption: js.UndefOr[DefaultEmailOptionType] = js.native
  /**
    * The email message template.
    */
  var EmailMessage: js.UndefOr[EmailVerificationMessageType] = js.native
  /**
    * The email message template for sending a confirmation link to the user.
    */
  var EmailMessageByLink: js.UndefOr[EmailVerificationMessageByLinkType] = js.native
  /**
    * The subject line for the email message template.
    */
  var EmailSubject: js.UndefOr[EmailVerificationSubjectType] = js.native
  /**
    * The subject line for the email message template for sending a confirmation link to the user.
    */
  var EmailSubjectByLink: js.UndefOr[EmailVerificationSubjectByLinkType] = js.native
  /**
    * The SMS message template.
    */
  var SmsMessage: js.UndefOr[SmsVerificationMessageType] = js.native
}

object VerificationMessageTemplateType {
  @scala.inline
  def apply(): VerificationMessageTemplateType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerificationMessageTemplateType]
  }
  @scala.inline
  implicit class VerificationMessageTemplateTypeOps[Self <: VerificationMessageTemplateType] (val x: Self) extends AnyVal {
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
    def setDefaultEmailOption(value: DefaultEmailOptionType): Self = this.set("DefaultEmailOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultEmailOption: Self = this.set("DefaultEmailOption", js.undefined)
    @scala.inline
    def setEmailMessage(value: EmailVerificationMessageType): Self = this.set("EmailMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailMessage: Self = this.set("EmailMessage", js.undefined)
    @scala.inline
    def setEmailMessageByLink(value: EmailVerificationMessageByLinkType): Self = this.set("EmailMessageByLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailMessageByLink: Self = this.set("EmailMessageByLink", js.undefined)
    @scala.inline
    def setEmailSubject(value: EmailVerificationSubjectType): Self = this.set("EmailSubject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailSubject: Self = this.set("EmailSubject", js.undefined)
    @scala.inline
    def setEmailSubjectByLink(value: EmailVerificationSubjectByLinkType): Self = this.set("EmailSubjectByLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailSubjectByLink: Self = this.set("EmailSubjectByLink", js.undefined)
    @scala.inline
    def setSmsMessage(value: SmsVerificationMessageType): Self = this.set("SmsMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmsMessage: Self = this.set("SmsMessage", js.undefined)
  }
  
}

