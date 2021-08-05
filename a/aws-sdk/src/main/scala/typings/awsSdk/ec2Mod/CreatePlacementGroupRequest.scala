package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePlacementGroupRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A name for the placement group. Must be unique within the scope of your account for the Region. Constraints: Up to 255 ASCII characters
    */
  var GroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The number of partitions. Valid only when Strategy is set to partition.
    */
  var PartitionCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The placement strategy.
    */
  var Strategy: js.UndefOr[PlacementStrategy] = js.undefined
  
  /**
    * The tags to apply to the new placement group.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreatePlacementGroupRequest {
  
  inline def apply(): CreatePlacementGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlacementGroupRequest]
  }
  
  extension [Self <: CreatePlacementGroupRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setPartitionCount(value: Integer): Self = StObject.set(x, "PartitionCount", value.asInstanceOf[js.Any])
    
    inline def setPartitionCountUndefined: Self = StObject.set(x, "PartitionCount", js.undefined)
    
    inline def setStrategy(value: PlacementStrategy): Self = StObject.set(x, "Strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "Strategy", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
  }
}
