package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupResourcesInput extends js.Object {
  
  /**
    * The name or the ARN of the resource group to add resources to.
    */
  var Group: GroupString = js.native
  
  /**
    * The list of ARNs for resources to be added to the group. 
    */
  var ResourceArns: ResourceArnList = js.native
}
object GroupResourcesInput {
  
  @scala.inline
  def apply(Group: GroupString, ResourceArns: ResourceArnList): GroupResourcesInput = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], ResourceArns = ResourceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupResourcesInput]
  }
  
  @scala.inline
  implicit class GroupResourcesInputOps[Self <: GroupResourcesInput] (val x: Self) extends AnyVal {
    
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
    def setGroup(value: GroupString): Self = this.set("Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnsVarargs(value: ResourceArn*): Self = this.set("ResourceArns", js.Array(value :_*))
    
    @scala.inline
    def setResourceArns(value: ResourceArnList): Self = this.set("ResourceArns", value.asInstanceOf[js.Any])
  }
}
