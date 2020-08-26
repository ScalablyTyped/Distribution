package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupInput extends js.Object {
  /**
    * A configuration associates the resource group with an AWS service and specifies how the service can interact with the resources in the group. A configuration is an array of GroupConfigurationItem elements.  You can specify either a Configuration or a ResourceQuery in a group, but not both. 
    */
  var Configuration: js.UndefOr[GroupConfigurationList] = js.native
  /**
    * The description of the resource group. Descriptions can consist of letters, numbers, hyphens, underscores, periods, and spaces.
    */
  var Description: js.UndefOr[typings.awsSdk.resourcegroupsMod.Description] = js.native
  /**
    * The name of the group, which is the identifier of the group in other operations. You can't change the name of a resource group after you create it. A resource group name can consist of letters, numbers, hyphens, periods, and underscores. The name cannot start with AWS or aws; these are reserved. A resource group name must be unique within each AWS Region in your AWS account.
    */
  var Name: GroupName = js.native
  /**
    * The resource query that determines which AWS resources are members of this group.  You can specify either a ResourceQuery or a Configuration, but not both. 
    */
  var ResourceQuery: js.UndefOr[typings.awsSdk.resourcegroupsMod.ResourceQuery] = js.native
  /**
    * The tags to add to the group. A tag is key-value pair string.
    */
  var Tags: js.UndefOr[typings.awsSdk.resourcegroupsMod.Tags] = js.native
}

object CreateGroupInput {
  @scala.inline
  def apply(Name: GroupName): CreateGroupInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupInput]
  }
  @scala.inline
  implicit class CreateGroupInputOps[Self <: CreateGroupInput] (val x: Self) extends AnyVal {
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
    def setName(value: GroupName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationVarargs(value: GroupConfigurationItem*): Self = this.set("Configuration", js.Array(value :_*))
    @scala.inline
    def setConfiguration(value: GroupConfigurationList): Self = this.set("Configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("Configuration", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setResourceQuery(value: ResourceQuery): Self = this.set("ResourceQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceQuery: Self = this.set("ResourceQuery", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

