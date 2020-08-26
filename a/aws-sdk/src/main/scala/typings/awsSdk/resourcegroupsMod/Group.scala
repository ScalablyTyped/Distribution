package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  /**
    * The description of the resource group.
    */
  var Description: js.UndefOr[typings.awsSdk.resourcegroupsMod.Description] = js.native
  /**
    * The ARN of the resource group.
    */
  var GroupArn: typings.awsSdk.resourcegroupsMod.GroupArn = js.native
  /**
    * The name of the resource group.
    */
  var Name: GroupName = js.native
}

object Group {
  @scala.inline
  def apply(GroupArn: GroupArn, Name: GroupName): Group = {
    val __obj = js.Dynamic.literal(GroupArn = GroupArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  @scala.inline
  implicit class GroupOps[Self <: Group] (val x: Self) extends AnyVal {
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
    def setGroupArn(value: GroupArn): Self = this.set("GroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: GroupName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
  
}

