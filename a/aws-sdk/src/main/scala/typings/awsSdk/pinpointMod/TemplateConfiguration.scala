package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateConfiguration extends StObject {
  
  /**
    * The email template to use for the message.
    */
  var EmailTemplate: js.UndefOr[Template] = js.native
  
  /**
    * The push notification template to use for the message.
    */
  var PushTemplate: js.UndefOr[Template] = js.native
  
  /**
    * The SMS template to use for the message.
    */
  var SMSTemplate: js.UndefOr[Template] = js.native
  
  /**
    * The voice template to use for the message. This object isn't supported for campaigns.
    */
  var VoiceTemplate: js.UndefOr[Template] = js.native
}
object TemplateConfiguration {
  
  @scala.inline
  def apply(): TemplateConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateConfiguration]
  }
  
  @scala.inline
  implicit class TemplateConfigurationMutableBuilder[Self <: TemplateConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailTemplate(value: Template): Self = StObject.set(x, "EmailTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailTemplateUndefined: Self = StObject.set(x, "EmailTemplate", js.undefined)
    
    @scala.inline
    def setPushTemplate(value: Template): Self = StObject.set(x, "PushTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushTemplateUndefined: Self = StObject.set(x, "PushTemplate", js.undefined)
    
    @scala.inline
    def setSMSTemplate(value: Template): Self = StObject.set(x, "SMSTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSMSTemplateUndefined: Self = StObject.set(x, "SMSTemplate", js.undefined)
    
    @scala.inline
    def setVoiceTemplate(value: Template): Self = StObject.set(x, "VoiceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceTemplateUndefined: Self = StObject.set(x, "VoiceTemplate", js.undefined)
  }
}
