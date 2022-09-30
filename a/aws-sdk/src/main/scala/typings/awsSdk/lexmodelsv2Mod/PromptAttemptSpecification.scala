package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptAttemptSpecification extends StObject {
  
  /**
    * Indicates whether the user can interrupt a speech prompt attempt from the bot.
    */
  var allowInterrupt: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * Indicates the allowed input types of the prompt attempt.
    */
  var allowedInputTypes: AllowedInputTypes
  
  /**
    * Specifies the settings on audio and DTMF input.
    */
  var audioAndDTMFInputSpecification: js.UndefOr[AudioAndDTMFInputSpecification] = js.undefined
  
  /**
    * Specifies the settings on text input.
    */
  var textInputSpecification: js.UndefOr[TextInputSpecification] = js.undefined
}
object PromptAttemptSpecification {
  
  inline def apply(allowedInputTypes: AllowedInputTypes): PromptAttemptSpecification = {
    val __obj = js.Dynamic.literal(allowedInputTypes = allowedInputTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptAttemptSpecification]
  }
  
  extension [Self <: PromptAttemptSpecification](x: Self) {
    
    inline def setAllowInterrupt(value: BoxedBoolean): Self = StObject.set(x, "allowInterrupt", value.asInstanceOf[js.Any])
    
    inline def setAllowInterruptUndefined: Self = StObject.set(x, "allowInterrupt", js.undefined)
    
    inline def setAllowedInputTypes(value: AllowedInputTypes): Self = StObject.set(x, "allowedInputTypes", value.asInstanceOf[js.Any])
    
    inline def setAudioAndDTMFInputSpecification(value: AudioAndDTMFInputSpecification): Self = StObject.set(x, "audioAndDTMFInputSpecification", value.asInstanceOf[js.Any])
    
    inline def setAudioAndDTMFInputSpecificationUndefined: Self = StObject.set(x, "audioAndDTMFInputSpecification", js.undefined)
    
    inline def setTextInputSpecification(value: TextInputSpecification): Self = StObject.set(x, "textInputSpecification", value.asInstanceOf[js.Any])
    
    inline def setTextInputSpecificationUndefined: Self = StObject.set(x, "textInputSpecification", js.undefined)
  }
}
