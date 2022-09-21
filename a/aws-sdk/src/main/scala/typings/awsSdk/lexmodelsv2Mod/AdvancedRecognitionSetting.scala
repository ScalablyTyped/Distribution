package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedRecognitionSetting extends StObject {
  
  /**
    * Enables using the slot values as a custom vocabulary for recognizing user utterances.
    */
  var audioRecognitionStrategy: js.UndefOr[AudioRecognitionStrategy] = js.undefined
}
object AdvancedRecognitionSetting {
  
  inline def apply(): AdvancedRecognitionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedRecognitionSetting]
  }
  
  extension [Self <: AdvancedRecognitionSetting](x: Self) {
    
    inline def setAudioRecognitionStrategy(value: AudioRecognitionStrategy): Self = StObject.set(x, "audioRecognitionStrategy", value.asInstanceOf[js.Any])
    
    inline def setAudioRecognitionStrategyUndefined: Self = StObject.set(x, "audioRecognitionStrategy", js.undefined)
  }
}
