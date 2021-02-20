package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportToCSVOption extends StObject {
  
  /**
    * Availability status.
    */
  var AvailabilityStatus: js.UndefOr[DashboardBehavior] = js.native
}
object ExportToCSVOption {
  
  @scala.inline
  def apply(): ExportToCSVOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportToCSVOption]
  }
  
  @scala.inline
  implicit class ExportToCSVOptionMutableBuilder[Self <: ExportToCSVOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityStatus(value: DashboardBehavior): Self = StObject.set(x, "AvailabilityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityStatusUndefined: Self = StObject.set(x, "AvailabilityStatus", js.undefined)
  }
}
