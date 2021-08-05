package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdHocFilteringOption extends StObject {
  
  /**
    * Availability status.
    */
  var AvailabilityStatus: js.UndefOr[DashboardBehavior] = js.undefined
}
object AdHocFilteringOption {
  
  inline def apply(): AdHocFilteringOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdHocFilteringOption]
  }
  
  extension [Self <: AdHocFilteringOption](x: Self) {
    
    inline def setAvailabilityStatus(value: DashboardBehavior): Self = StObject.set(x, "AvailabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityStatusUndefined: Self = StObject.set(x, "AvailabilityStatus", js.undefined)
  }
}
