package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceFleetModifyConfig extends StObject {
  
  /**
    * A unique identifier for the instance fleet.
    */
  var InstanceFleetId: typings.awsSdk.emrMod.InstanceFleetId = js.native
  
  /**
    * The target capacity of On-Demand units for the instance fleet. For more information see InstanceFleetConfig$TargetOnDemandCapacity.
    */
  var TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.native
  
  /**
    * The target capacity of Spot units for the instance fleet. For more information, see InstanceFleetConfig$TargetSpotCapacity.
    */
  var TargetSpotCapacity: js.UndefOr[WholeNumber] = js.native
}
object InstanceFleetModifyConfig {
  
  @scala.inline
  def apply(InstanceFleetId: InstanceFleetId): InstanceFleetModifyConfig = {
    val __obj = js.Dynamic.literal(InstanceFleetId = InstanceFleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceFleetModifyConfig]
  }
  
  @scala.inline
  implicit class InstanceFleetModifyConfigMutableBuilder[Self <: InstanceFleetModifyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceFleetId(value: InstanceFleetId): Self = StObject.set(x, "InstanceFleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetOnDemandCapacity(value: WholeNumber): Self = StObject.set(x, "TargetOnDemandCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetOnDemandCapacityUndefined: Self = StObject.set(x, "TargetOnDemandCapacity", js.undefined)
    
    @scala.inline
    def setTargetSpotCapacity(value: WholeNumber): Self = StObject.set(x, "TargetSpotCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSpotCapacityUndefined: Self = StObject.set(x, "TargetSpotCapacity", js.undefined)
  }
}
