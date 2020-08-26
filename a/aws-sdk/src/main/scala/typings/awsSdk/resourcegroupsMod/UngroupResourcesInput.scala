package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UngroupResourcesInput extends js.Object {
  /**
    * The name or the ARN of the resource group from which to remove the resources.
    */
  var Group: GroupString = js.native
  /**
    * The ARNs of the resources to be removed from the group.
    */
  var ResourceArns: ResourceArnList = js.native
}

object UngroupResourcesInput {
  @scala.inline
  def apply(Group: GroupString, ResourceArns: ResourceArnList): UngroupResourcesInput = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], ResourceArns = ResourceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[UngroupResourcesInput]
  }
  @scala.inline
  implicit class UngroupResourcesInputOps[Self <: UngroupResourcesInput] (val x: Self) extends AnyVal {
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

