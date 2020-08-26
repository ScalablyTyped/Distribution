package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsFromResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource you want to remove the tags from.
    */
  var ResourceARN: typings.awsSdk.storagegatewayMod.ResourceARN = js.native
  /**
    * The keys of the tags you want to remove from the specified resource. A tag is composed of a key-value pair.
    */
  var TagKeys: typings.awsSdk.storagegatewayMod.TagKeys = js.native
}

object RemoveTagsFromResourceInput {
  @scala.inline
  def apply(ResourceARN: ResourceARN, TagKeys: TagKeys): RemoveTagsFromResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromResourceInput]
  }
  @scala.inline
  implicit class RemoveTagsFromResourceInputOps[Self <: RemoveTagsFromResourceInput] (val x: Self) extends AnyVal {
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
    def setResourceARN(value: ResourceARN): Self = this.set("ResourceARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = this.set("TagKeys", js.Array(value :_*))
    @scala.inline
    def setTagKeys(value: TagKeys): Self = this.set("TagKeys", value.asInstanceOf[js.Any])
  }
  
}

