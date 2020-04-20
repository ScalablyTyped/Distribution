package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsInput extends js.Object {
  /**
    * The Amazon EMR resource identifier from which tags will be removed. This value must be a cluster identifier.
    */
  var ResourceId: typings.awsSdk.emrMod.ResourceId = js.native
  /**
    * A list of tag keys to remove from a resource.
    */
  var TagKeys: StringList = js.native
}

object RemoveTagsInput {
  @scala.inline
  def apply(ResourceId: ResourceId, TagKeys: StringList): RemoveTagsInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsInput]
  }
}

