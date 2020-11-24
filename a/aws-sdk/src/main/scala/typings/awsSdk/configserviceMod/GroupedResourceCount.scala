package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupedResourceCount extends js.Object {
  
  /**
    * The name of the group that can be region, account ID, or resource type. For example, region1, region2 if the region was chosen as GroupByKey.
    */
  var GroupName: StringWithCharLimit256 = js.native
  
  /**
    * The number of resources in the group.
    */
  var ResourceCount: Long = js.native
}
object GroupedResourceCount {
  
  @scala.inline
  def apply(GroupName: StringWithCharLimit256, ResourceCount: Long): GroupedResourceCount = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], ResourceCount = ResourceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupedResourceCount]
  }
  
  @scala.inline
  implicit class GroupedResourceCountOps[Self <: GroupedResourceCount] (val x: Self) extends AnyVal {
    
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
    def setGroupName(value: StringWithCharLimit256): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceCount(value: Long): Self = this.set("ResourceCount", value.asInstanceOf[js.Any])
  }
}
