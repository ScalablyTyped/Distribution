package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageTemplateType extends js.Object {
  
  /**
    * The message template for email messages.
    */
  var EmailMessage: js.UndefOr[EmailVerificationMessageType] = js.native
  
  /**
    * The subject line for email messages.
    */
  var EmailSubject: js.UndefOr[EmailVerificationSubjectType] = js.native
  
  /**
    * The message template for SMS messages.
    */
  var SMSMessage: js.UndefOr[SmsVerificationMessageType] = js.native
}
object MessageTemplateType {
  
  @scala.inline
  def apply(): MessageTemplateType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageTemplateType]
  }
  
  @scala.inline
  implicit class MessageTemplateTypeOps[Self <: MessageTemplateType] (val x: Self) extends AnyVal {
    
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
    def setEmailMessage(value: EmailVerificationMessageType): Self = this.set("EmailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailMessage: Self = this.set("EmailMessage", js.undefined)
    
    @scala.inline
    def setEmailSubject(value: EmailVerificationSubjectType): Self = this.set("EmailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailSubject: Self = this.set("EmailSubject", js.undefined)
    
    @scala.inline
    def setSMSMessage(value: SmsVerificationMessageType): Self = this.set("SMSMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSMSMessage: Self = this.set("SMSMessage", js.undefined)
  }
}
