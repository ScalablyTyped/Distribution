package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePlacementGroupRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * A name for the placement group. Must be unique within the scope of your account for the Region. Constraints: Up to 255 ASCII characters
    */
  var GroupName: js.UndefOr[String] = js.native
  
  /**
    * The number of partitions. Valid only when Strategy is set to partition.
    */
  var PartitionCount: js.UndefOr[Integer] = js.native
  
  /**
    * The placement strategy.
    */
  var Strategy: js.UndefOr[PlacementStrategy] = js.native
  
  /**
    * The tags to apply to the new placement group.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}
object CreatePlacementGroupRequest {
  
  @scala.inline
  def apply(): CreatePlacementGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlacementGroupRequest]
  }
  
  @scala.inline
  implicit class CreatePlacementGroupRequestOps[Self <: CreatePlacementGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    
    @scala.inline
    def setPartitionCount(value: Integer): Self = this.set("PartitionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionCount: Self = this.set("PartitionCount", js.undefined)
    
    @scala.inline
    def setStrategy(value: PlacementStrategy): Self = this.set("Strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("Strategy", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
  }
}
