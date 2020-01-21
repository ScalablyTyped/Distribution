package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeTagsForResourceRequest extends js.Object {
  /**
    * A complex type that contains a list of the tags that you want to add to the specified health check or hosted zone and/or the tags that you want to edit Value for. You can add a maximum of 10 tags to a health check or a hosted zone.
    */
  var AddTags: js.UndefOr[TagList] = js.native
  /**
    * A complex type that contains a list of the tags that you want to delete from the specified health check or hosted zone. You can specify up to 10 keys.
    */
  var RemoveTagKeys: js.UndefOr[TagKeyList] = js.native
  /**
    * The ID of the resource for which you want to add, change, or delete tags.
    */
  var ResourceId: TagResourceId = js.native
  /**
    * The type of the resource.   The resource type for health checks is healthcheck.   The resource type for hosted zones is hostedzone.  
    */
  var ResourceType: TagResourceType = js.native
}

object ChangeTagsForResourceRequest {
  @scala.inline
  def apply(
    ResourceId: TagResourceId,
    ResourceType: TagResourceType,
    AddTags: TagList = null,
    RemoveTagKeys: TagKeyList = null
  ): ChangeTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    if (AddTags != null) __obj.updateDynamic("AddTags")(AddTags.asInstanceOf[js.Any])
    if (RemoveTagKeys != null) __obj.updateDynamic("RemoveTagKeys")(RemoveTagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTagsForResourceRequest]
  }
}

