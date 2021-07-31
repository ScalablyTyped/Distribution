package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageTemplateType extends StObject {
  
  /**
    * The message template for email messages.
    */
  var EmailMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined
  
  /**
    * The subject line for email messages.
    */
  var EmailSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined
  
  /**
    * The message template for SMS messages.
    */
  var SMSMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
}
object MessageTemplateType {
  
  @scala.inline
  def apply(): MessageTemplateType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageTemplateType]
  }
  
  @scala.inline
  implicit class MessageTemplateTypeMutableBuilder[Self <: MessageTemplateType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailMessage(value: EmailVerificationMessageType): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailMessageUndefined: Self = StObject.set(x, "EmailMessage", js.undefined)
    
    @scala.inline
    def setEmailSubject(value: EmailVerificationSubjectType): Self = StObject.set(x, "EmailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSubjectUndefined: Self = StObject.set(x, "EmailSubject", js.undefined)
    
    @scala.inline
    def setSMSMessage(value: SmsVerificationMessageType): Self = StObject.set(x, "SMSMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSMSMessageUndefined: Self = StObject.set(x, "SMSMessage", js.undefined)
  }
}
