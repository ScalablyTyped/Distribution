package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementGroup extends StObject {
  
  /**
    * The ID of the placement group.
    */
  var GroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the placement group.
    */
  var GroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The number of partitions. Valid only if strategy is set to partition.
    */
  var PartitionCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The state of the placement group.
    */
  var State: js.UndefOr[PlacementGroupState] = js.undefined
  
  /**
    * The placement strategy.
    */
  var Strategy: js.UndefOr[PlacementStrategy] = js.undefined
  
  /**
    * Any tags applied to the placement group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object PlacementGroup {
  
  inline def apply(): PlacementGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementGroup]
  }
  
  extension [Self <: PlacementGroup](x: Self) {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setPartitionCount(value: Integer): Self = StObject.set(x, "PartitionCount", value.asInstanceOf[js.Any])
    
    inline def setPartitionCountUndefined: Self = StObject.set(x, "PartitionCount", js.undefined)
    
    inline def setState(value: PlacementGroupState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setStrategy(value: PlacementStrategy): Self = StObject.set(x, "Strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "Strategy", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
