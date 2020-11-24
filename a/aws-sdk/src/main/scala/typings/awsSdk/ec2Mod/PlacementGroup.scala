package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementGroup extends js.Object {
  
  /**
    * The ID of the placement group.
    */
  var GroupId: js.UndefOr[String] = js.native
  
  /**
    * The name of the placement group.
    */
  var GroupName: js.UndefOr[String] = js.native
  
  /**
    * The number of partitions. Valid only if strategy is set to partition.
    */
  var PartitionCount: js.UndefOr[Integer] = js.native
  
  /**
    * The state of the placement group.
    */
  var State: js.UndefOr[PlacementGroupState] = js.native
  
  /**
    * The placement strategy.
    */
  var Strategy: js.UndefOr[PlacementStrategy] = js.native
  
  /**
    * Any tags applied to the placement group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object PlacementGroup {
  
  @scala.inline
  def apply(): PlacementGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementGroup]
  }
  
  @scala.inline
  implicit class PlacementGroupOps[Self <: PlacementGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGroupId(value: String): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("GroupId", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    
    @scala.inline
    def setPartitionCount(value: Integer): Self = this.set("PartitionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionCount: Self = this.set("PartitionCount", js.undefined)
    
    @scala.inline
    def setState(value: PlacementGroupState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStrategy(value: PlacementStrategy): Self = this.set("Strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("Strategy", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
