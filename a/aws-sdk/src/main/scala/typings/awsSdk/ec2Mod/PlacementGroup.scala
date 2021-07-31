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
  
  @scala.inline
  def apply(): PlacementGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementGroup]
  }
  
  @scala.inline
  implicit class PlacementGroupMutableBuilder[Self <: PlacementGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setPartitionCount(value: Integer): Self = StObject.set(x, "PartitionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionCountUndefined: Self = StObject.set(x, "PartitionCount", js.undefined)
    
    @scala.inline
    def setState(value: PlacementGroupState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setStrategy(value: PlacementStrategy): Self = StObject.set(x, "Strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategyUndefined: Self = StObject.set(x, "Strategy", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
