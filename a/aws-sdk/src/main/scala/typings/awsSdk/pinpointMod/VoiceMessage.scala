package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceMessage extends StObject {
  
  /**
    * The text of the script to use for the voice message.
    */
  var Body: js.UndefOr[string] = js.undefined
  
  /**
    * The code for the language to use when synthesizing the text of the message script. For a list of supported languages and the code for each one, see the Amazon Polly Developer Guide.
    */
  var LanguageCode: js.UndefOr[string] = js.undefined
  
  /**
    * The long code to send the voice message from. This value should be one of the dedicated long codes that's assigned to your AWS account. Although it isn't required, we recommend that you specify the long code in E.164 format, for example +12065550100, to ensure prompt and accurate delivery of the message.
    */
  var OriginationNumber: js.UndefOr[string] = js.undefined
  
  /**
    * The default message variables to use in the voice message. You can override the default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.undefined
  
  /**
    * The name of the voice to use when delivering the message. For a list of supported voices, see the Amazon Polly Developer Guide.
    */
  var VoiceId: js.UndefOr[string] = js.undefined
}
object VoiceMessage {
  
  @scala.inline
  def apply(): VoiceMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceMessage]
  }
  
  @scala.inline
  implicit class VoiceMessageMutableBuilder[Self <: VoiceMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: string): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setOriginationNumber(value: string): Self = StObject.set(x, "OriginationNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginationNumberUndefined: Self = StObject.set(x, "OriginationNumber", js.undefined)
    
    @scala.inline
    def setSubstitutions(value: MapOfListOfString): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    
    @scala.inline
    def setVoiceId(value: string): Self = StObject.set(x, "VoiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceIdUndefined: Self = StObject.set(x, "VoiceId", js.undefined)
  }
}
