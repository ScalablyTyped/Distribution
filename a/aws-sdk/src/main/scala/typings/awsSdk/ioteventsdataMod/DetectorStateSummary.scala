package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectorStateSummary extends StObject {
  
  /**
    * The name of the state.
    */
  var stateName: js.UndefOr[StateName] = js.undefined
}
object DetectorStateSummary {
  
  inline def apply(): DetectorStateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorStateSummary]
  }
  
  extension [Self <: DetectorStateSummary](x: Self) {
    
    inline def setStateName(value: StateName): Self = StObject.set(x, "stateName", value.asInstanceOf[js.Any])
    
    inline def setStateNameUndefined: Self = StObject.set(x, "stateName", js.undefined)
  }
}
