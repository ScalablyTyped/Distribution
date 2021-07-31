package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationOptions extends StObject {
  
  /**
    * Text value to be included in the email body.
    */
  var EmailMessage: js.UndefOr[MessageType] = js.undefined
  
  /**
    * Boolean value to indicate an email notification should be sent to the receipients.
    */
  var SendEmail: js.UndefOr[BooleanType] = js.undefined
}
object NotificationOptions {
  
  @scala.inline
  def apply(): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationOptions]
  }
  
  @scala.inline
  implicit class NotificationOptionsMutableBuilder[Self <: NotificationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailMessage(value: MessageType): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailMessageUndefined: Self = StObject.set(x, "EmailMessage", js.undefined)
    
    @scala.inline
    def setSendEmail(value: BooleanType): Self = StObject.set(x, "SendEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendEmailUndefined: Self = StObject.set(x, "SendEmail", js.undefined)
  }
}
