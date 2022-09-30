package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedInputTypes extends StObject {
  
  /**
    * Indicates whether audio input is allowed.
    */
  var allowAudioInput: BoxedBoolean
  
  /**
    * Indicates whether DTMF input is allowed.
    */
  var allowDTMFInput: BoxedBoolean
}
object AllowedInputTypes {
  
  inline def apply(allowAudioInput: BoxedBoolean, allowDTMFInput: BoxedBoolean): AllowedInputTypes = {
    val __obj = js.Dynamic.literal(allowAudioInput = allowAudioInput.asInstanceOf[js.Any], allowDTMFInput = allowDTMFInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedInputTypes]
  }
  
  extension [Self <: AllowedInputTypes](x: Self) {
    
    inline def setAllowAudioInput(value: BoxedBoolean): Self = StObject.set(x, "allowAudioInput", value.asInstanceOf[js.Any])
    
    inline def setAllowDTMFInput(value: BoxedBoolean): Self = StObject.set(x, "allowDTMFInput", value.asInstanceOf[js.Any])
  }
}
