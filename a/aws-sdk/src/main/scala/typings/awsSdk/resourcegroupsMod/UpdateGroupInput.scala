package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGroupInput extends js.Object {
  
  /**
    * The new description that you want to update the resource group with. Descriptions can contain letters, numbers, hyphens, underscores, periods, and spaces.
    */
  var Description: js.UndefOr[typings.awsSdk.resourcegroupsMod.Description] = js.native
  
  /**
    * The name or the ARN of the resource group to modify.
    */
  var Group: js.UndefOr[GroupString] = js.native
  
  /**
    * Don't use this parameter. Use Group instead.
    */
  var GroupName: js.UndefOr[typings.awsSdk.resourcegroupsMod.GroupName] = js.native
}
object UpdateGroupInput {
  
  @scala.inline
  def apply(): UpdateGroupInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGroupInput]
  }
  
  @scala.inline
  implicit class UpdateGroupInputOps[Self <: UpdateGroupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setGroup(value: GroupString): Self = this.set("Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("Group", js.undefined)
    
    @scala.inline
    def setGroupName(value: GroupName): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
  }
}
