package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTag extends js.Object {
  /**
    * Specifies the ARN of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.native
  /**
    * A list of tags.
    */
  var TagsList: js.UndefOr[typings.awsSdk.cloudtrailMod.TagsList] = js.native
}

object ResourceTag {
  @scala.inline
  def apply(ResourceId: String = null, TagsList: TagsList = null): ResourceTag = {
    val __obj = js.Dynamic.literal()
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (TagsList != null) __obj.updateDynamic("TagsList")(TagsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTag]
  }
}

