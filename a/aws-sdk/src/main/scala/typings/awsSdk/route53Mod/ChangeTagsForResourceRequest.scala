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
  def apply(ResourceId: TagResourceId, ResourceType: TagResourceType): ChangeTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTagsForResourceRequest]
  }
  @scala.inline
  implicit class ChangeTagsForResourceRequestOps[Self <: ChangeTagsForResourceRequest] (val x: Self) extends AnyVal {
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
    def setResourceId(value: TagResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: TagResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddTagsVarargs(value: Tag*): Self = this.set("AddTags", js.Array(value :_*))
    @scala.inline
    def setAddTags(value: TagList): Self = this.set("AddTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddTags: Self = this.set("AddTags", js.undefined)
    @scala.inline
    def setRemoveTagKeysVarargs(value: TagKey*): Self = this.set("RemoveTagKeys", js.Array(value :_*))
    @scala.inline
    def setRemoveTagKeys(value: TagKeyList): Self = this.set("RemoveTagKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveTagKeys: Self = this.set("RemoveTagKeys", js.undefined)
  }
  
}

