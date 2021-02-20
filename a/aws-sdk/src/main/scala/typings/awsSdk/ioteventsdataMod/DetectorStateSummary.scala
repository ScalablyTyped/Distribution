package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectorStateSummary extends StObject {
  
  /**
    * The name of the state.
    */
  var stateName: js.UndefOr[StateName] = js.native
}
object DetectorStateSummary {
  
  @scala.inline
  def apply(): DetectorStateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorStateSummary]
  }
  
  @scala.inline
  implicit class DetectorStateSummaryMutableBuilder[Self <: DetectorStateSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStateName(value: StateName): Self = StObject.set(x, "stateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNameUndefined: Self = StObject.set(x, "stateName", js.undefined)
  }
}
