package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * Specifies the EFS resource that you want to remove tags from.
    */
  var ResourceId: typings.awsSdk.efsMod.ResourceId = js.native
  /**
    * The keys of the key:value tag pairs that you want to remove from the specified EFS resource.
    */
  var TagKeys: js.UndefOr[typings.awsSdk.efsMod.TagKeys] = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceId: ResourceId, TagKeys: TagKeys = null): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    if (TagKeys != null) __obj.updateDynamic("TagKeys")(TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

