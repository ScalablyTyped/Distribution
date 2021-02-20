package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetCapacitySpecificationRequest extends StObject {
  
  /**
    * The default TotalTargetCapacity, which is either Spot or On-Demand.
    */
  var DefaultTargetCapacityType: js.UndefOr[typings.awsSdk.ec2Mod.DefaultTargetCapacityType] = js.native
  
  /**
    * The number of On-Demand units to request.
    */
  var OnDemandTargetCapacity: js.UndefOr[Integer] = js.native
  
  /**
    * The number of Spot units to request.
    */
  var SpotTargetCapacity: js.UndefOr[Integer] = js.native
  
  /**
    * The number of units to request, filled using DefaultTargetCapacityType.
    */
  var TotalTargetCapacity: Integer = js.native
}
object TargetCapacitySpecificationRequest {
  
  @scala.inline
  def apply(TotalTargetCapacity: Integer): TargetCapacitySpecificationRequest = {
    val __obj = js.Dynamic.literal(TotalTargetCapacity = TotalTargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetCapacitySpecificationRequest]
  }
  
  @scala.inline
  implicit class TargetCapacitySpecificationRequestMutableBuilder[Self <: TargetCapacitySpecificationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultTargetCapacityType(value: DefaultTargetCapacityType): Self = StObject.set(x, "DefaultTargetCapacityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTargetCapacityTypeUndefined: Self = StObject.set(x, "DefaultTargetCapacityType", js.undefined)
    
    @scala.inline
    def setOnDemandTargetCapacity(value: Integer): Self = StObject.set(x, "OnDemandTargetCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandTargetCapacityUndefined: Self = StObject.set(x, "OnDemandTargetCapacity", js.undefined)
    
    @scala.inline
    def setSpotTargetCapacity(value: Integer): Self = StObject.set(x, "SpotTargetCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotTargetCapacityUndefined: Self = StObject.set(x, "SpotTargetCapacity", js.undefined)
    
    @scala.inline
    def setTotalTargetCapacity(value: Integer): Self = StObject.set(x, "TotalTargetCapacity", value.asInstanceOf[js.Any])
  }
}
