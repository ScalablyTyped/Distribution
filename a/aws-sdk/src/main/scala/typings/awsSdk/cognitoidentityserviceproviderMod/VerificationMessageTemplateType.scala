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
  def apply(
    DefaultEmailOption: DefaultEmailOptionType = null,
    EmailMessage: EmailVerificationMessageType = null,
    EmailMessageByLink: EmailVerificationMessageByLinkType = null,
    EmailSubject: EmailVerificationSubjectType = null,
    EmailSubjectByLink: EmailVerificationSubjectByLinkType = null,
    SmsMessage: SmsVerificationMessageType = null
  ): VerificationMessageTemplateType = {
    val __obj = js.Dynamic.literal()
    if (DefaultEmailOption != null) __obj.updateDynamic("DefaultEmailOption")(DefaultEmailOption.asInstanceOf[js.Any])
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage.asInstanceOf[js.Any])
    if (EmailMessageByLink != null) __obj.updateDynamic("EmailMessageByLink")(EmailMessageByLink.asInstanceOf[js.Any])
    if (EmailSubject != null) __obj.updateDynamic("EmailSubject")(EmailSubject.asInstanceOf[js.Any])
    if (EmailSubjectByLink != null) __obj.updateDynamic("EmailSubjectByLink")(EmailSubjectByLink.asInstanceOf[js.Any])
    if (SmsMessage != null) __obj.updateDynamic("SmsMessage")(SmsMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerificationMessageTemplateType]
  }
}

