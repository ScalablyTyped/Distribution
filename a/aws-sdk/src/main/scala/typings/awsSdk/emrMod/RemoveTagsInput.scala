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
  @scala.inline
  implicit class RemoveTagsInputOps[Self <: RemoveTagsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResourceId(value: ResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagKeysVarargs(value: String*): Self = this.set("TagKeys", js.Array(value :_*))
    @scala.inline
    def setTagKeys(value: StringList): Self = this.set("TagKeys", value.asInstanceOf[js.Any])
  }
  
}

