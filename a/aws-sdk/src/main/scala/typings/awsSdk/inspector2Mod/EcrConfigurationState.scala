package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcrConfigurationState extends StObject {
  
  /**
    * An object that contains details about the state of the ECR automated re-scan setting.
    */
  var rescanDurationState: js.UndefOr[EcrRescanDurationState] = js.undefined
}
object EcrConfigurationState {
  
  inline def apply(): EcrConfigurationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcrConfigurationState]
  }
  
  extension [Self <: EcrConfigurationState](x: Self) {
    
    inline def setRescanDurationState(value: EcrRescanDurationState): Self = StObject.set(x, "rescanDurationState", value.asInstanceOf[js.Any])
    
    inline def setRescanDurationStateUndefined: Self = StObject.set(x, "rescanDurationState", js.undefined)
  }
}
