package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoTune extends StObject {
  
  /**
    * Specifies details about the Auto-Tune action. See  Auto-Tune for Amazon OpenSearch Service  for more information. 
    */
  var AutoTuneDetails: js.UndefOr[typings.awsSdk.opensearchMod.AutoTuneDetails] = js.undefined
  
  /**
    * Specifies the Auto-Tune type. Valid value is SCHEDULED_ACTION.
    */
  var AutoTuneType: js.UndefOr[typings.awsSdk.opensearchMod.AutoTuneType] = js.undefined
}
object AutoTune {
  
  inline def apply(): AutoTune = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoTune]
  }
  
  extension [Self <: AutoTune](x: Self) {
    
    inline def setAutoTuneDetails(value: AutoTuneDetails): Self = StObject.set(x, "AutoTuneDetails", value.asInstanceOf[js.Any])
    
    inline def setAutoTuneDetailsUndefined: Self = StObject.set(x, "AutoTuneDetails", js.undefined)
    
    inline def setAutoTuneType(value: AutoTuneType): Self = StObject.set(x, "AutoTuneType", value.asInstanceOf[js.Any])
    
    inline def setAutoTuneTypeUndefined: Self = StObject.set(x, "AutoTuneType", js.undefined)
  }
}
