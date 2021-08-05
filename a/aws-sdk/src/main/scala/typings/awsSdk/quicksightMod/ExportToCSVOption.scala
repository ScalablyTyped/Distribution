package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportToCSVOption extends StObject {
  
  /**
    * Availability status.
    */
  var AvailabilityStatus: js.UndefOr[DashboardBehavior] = js.undefined
}
object ExportToCSVOption {
  
  inline def apply(): ExportToCSVOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportToCSVOption]
  }
  
  extension [Self <: ExportToCSVOption](x: Self) {
    
    inline def setAvailabilityStatus(value: DashboardBehavior): Self = StObject.set(x, "AvailabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityStatusUndefined: Self = StObject.set(x, "AvailabilityStatus", js.undefined)
  }
}
