package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdHocFilteringOption extends StObject {
  
  /**
    * Availability status.
    */
  var AvailabilityStatus: js.UndefOr[DashboardBehavior] = js.native
}
object AdHocFilteringOption {
  
  @scala.inline
  def apply(): AdHocFilteringOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdHocFilteringOption]
  }
  
  @scala.inline
  implicit class AdHocFilteringOptionMutableBuilder[Self <: AdHocFilteringOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityStatus(value: DashboardBehavior): Self = StObject.set(x, "AvailabilityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityStatusUndefined: Self = StObject.set(x, "AvailabilityStatus", js.undefined)
  }
}
