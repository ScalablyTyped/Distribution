package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotMaintenanceStrategies extends StObject {
  
  /**
    * The strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an elevated risk of being interrupted.
    */
  var CapacityRebalance: js.UndefOr[SpotCapacityRebalance] = js.native
}
object SpotMaintenanceStrategies {
  
  @scala.inline
  def apply(): SpotMaintenanceStrategies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotMaintenanceStrategies]
  }
  
  @scala.inline
  implicit class SpotMaintenanceStrategiesMutableBuilder[Self <: SpotMaintenanceStrategies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityRebalance(value: SpotCapacityRebalance): Self = StObject.set(x, "CapacityRebalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityRebalanceUndefined: Self = StObject.set(x, "CapacityRebalance", js.undefined)
  }
}
