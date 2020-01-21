package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupInput extends js.Object {
  /**
    * The description of the resource group. Descriptions can have a maximum of 511 characters, including letters, numbers, hyphens, underscores, punctuation, and spaces.
    */
  var Description: js.UndefOr[GroupDescription] = js.native
  /**
    * The name of the group, which is the identifier of the group in other operations. A resource group name cannot be updated after it is created. A resource group name can have a maximum of 128 characters, including letters, numbers, hyphens, dots, and underscores. The name cannot start with AWS or aws; these are reserved. A resource group name must be unique within your account.
    */
  var Name: GroupName = js.native
  /**
    * The resource query that determines which AWS resources are members of this group.
    */
  var ResourceQuery: typings.awsSdk.resourcegroupsMod.ResourceQuery = js.native
  /**
    * The tags to add to the group. A tag is a string-to-string map of key-value pairs. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var Tags: js.UndefOr[typings.awsSdk.resourcegroupsMod.Tags] = js.native
}

object CreateGroupInput {
  @scala.inline
  def apply(
    Name: GroupName,
    ResourceQuery: ResourceQuery,
    Description: GroupDescription = null,
    Tags: Tags = null
  ): CreateGroupInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ResourceQuery = ResourceQuery.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupInput]
  }
}

