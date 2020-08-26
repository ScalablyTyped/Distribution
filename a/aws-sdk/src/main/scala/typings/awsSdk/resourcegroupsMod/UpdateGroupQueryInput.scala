package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGroupQueryInput extends js.Object {
  /**
    * The name or the ARN of the resource group to query.
    */
  var Group: js.UndefOr[GroupString] = js.native
  /**
    * Don't use this parameter. Use Group instead.
    */
  var GroupName: js.UndefOr[typings.awsSdk.resourcegroupsMod.GroupName] = js.native
  /**
    * The resource query to determine which AWS resources are members of this resource group.
    */
  var ResourceQuery: typings.awsSdk.resourcegroupsMod.ResourceQuery = js.native
}

object UpdateGroupQueryInput {
  @scala.inline
  def apply(ResourceQuery: ResourceQuery): UpdateGroupQueryInput = {
    val __obj = js.Dynamic.literal(ResourceQuery = ResourceQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGroupQueryInput]
  }
  @scala.inline
  implicit class UpdateGroupQueryInputOps[Self <: UpdateGroupQueryInput] (val x: Self) extends AnyVal {
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
    def setResourceQuery(value: ResourceQuery): Self = this.set("ResourceQuery", value.asInstanceOf[js.Any])
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

