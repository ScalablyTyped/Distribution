package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomaticInputFailoverSettings extends StObject {
  
  /**
    * This clear time defines the requirement a recovered input must meet to be considered healthy. The input must have no failover conditions for this length of time. Enter a time in milliseconds. This value is particularly important if the input_preference for the failover pair is set to PRIMARY_INPUT_PREFERRED, because after this time, MediaLive will switch back to the primary input.
    */
  var ErrorClearTimeMsec: js.UndefOr[integerMin1] = js.undefined
  
  /**
    * A list of failover conditions. If any of these conditions occur, MediaLive will perform a failover to the other input.
    */
  var FailoverConditions: js.UndefOr[listOfFailoverCondition] = js.undefined
  
  /**
    * Input preference when deciding which input to make active when a previously failed input has recovered.
    */
  var InputPreference: js.UndefOr[typings.awsSdk.medialiveMod.InputPreference] = js.undefined
  
  /**
    * The input ID of the secondary input in the automatic input failover pair.
    */
  var SecondaryInputId: string
}
object AutomaticInputFailoverSettings {
  
  inline def apply(SecondaryInputId: string): AutomaticInputFailoverSettings = {
    val __obj = js.Dynamic.literal(SecondaryInputId = SecondaryInputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomaticInputFailoverSettings]
  }
  
  extension [Self <: AutomaticInputFailoverSettings](x: Self) {
    
    inline def setErrorClearTimeMsec(value: integerMin1): Self = StObject.set(x, "ErrorClearTimeMsec", value.asInstanceOf[js.Any])
    
    inline def setErrorClearTimeMsecUndefined: Self = StObject.set(x, "ErrorClearTimeMsec", js.undefined)
    
    inline def setFailoverConditions(value: listOfFailoverCondition): Self = StObject.set(x, "FailoverConditions", value.asInstanceOf[js.Any])
    
    inline def setFailoverConditionsUndefined: Self = StObject.set(x, "FailoverConditions", js.undefined)
    
    inline def setFailoverConditionsVarargs(value: FailoverCondition*): Self = StObject.set(x, "FailoverConditions", js.Array(value*))
    
    inline def setInputPreference(value: InputPreference): Self = StObject.set(x, "InputPreference", value.asInstanceOf[js.Any])
    
    inline def setInputPreferenceUndefined: Self = StObject.set(x, "InputPreference", js.undefined)
    
    inline def setSecondaryInputId(value: string): Self = StObject.set(x, "SecondaryInputId", value.asInstanceOf[js.Any])
  }
}
