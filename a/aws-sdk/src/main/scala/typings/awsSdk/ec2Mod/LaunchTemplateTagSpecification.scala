package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateTagSpecification extends js.Object {
  /**
    * The type of resource.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.ec2Mod.ResourceType] = js.native
  /**
    * The tags for the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object LaunchTemplateTagSpecification {
  @scala.inline
  def apply(ResourceType: ResourceType = null, Tags: TagList = null): LaunchTemplateTagSpecification = {
    val __obj = js.Dynamic.literal()
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateTagSpecification]
  }
}

