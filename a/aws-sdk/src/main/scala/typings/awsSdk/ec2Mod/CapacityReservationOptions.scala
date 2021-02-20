package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapacityReservationOptions extends StObject {
  
  /**
    * Indicates whether to use unused Capacity Reservations for fulfilling On-Demand capacity. If you specify use-capacity-reservations-first, the fleet uses unused Capacity Reservations to fulfill On-Demand capacity up to the target On-Demand capacity. If multiple instance pools have unused Capacity Reservations, the On-Demand allocation strategy (lowest-price or prioritized) is applied. If the number of unused Capacity Reservations is less than the On-Demand target capacity, the remaining On-Demand target capacity is launched according to the On-Demand allocation strategy (lowest-price or prioritized). If you do not specify a value, the fleet fulfils the On-Demand capacity according to the chosen On-Demand allocation strategy.
    */
  var UsageStrategy: js.UndefOr[FleetCapacityReservationUsageStrategy] = js.native
}
object CapacityReservationOptions {
  
  @scala.inline
  def apply(): CapacityReservationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityReservationOptions]
  }
  
  @scala.inline
  implicit class CapacityReservationOptionsMutableBuilder[Self <: CapacityReservationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsageStrategy(value: FleetCapacityReservationUsageStrategy): Self = StObject.set(x, "UsageStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageStrategyUndefined: Self = StObject.set(x, "UsageStrategy", js.undefined)
  }
}
