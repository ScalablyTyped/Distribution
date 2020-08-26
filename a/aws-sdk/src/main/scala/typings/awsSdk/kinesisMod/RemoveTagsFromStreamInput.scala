package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsFromStreamInput extends js.Object {
  /**
    * The name of the stream.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName = js.native
  /**
    * A list of tag keys. Each corresponding tag is removed from the stream.
    */
  var TagKeys: TagKeyList = js.native
}

object RemoveTagsFromStreamInput {
  @scala.inline
  def apply(StreamName: StreamName, TagKeys: TagKeyList): RemoveTagsFromStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromStreamInput]
  }
  @scala.inline
  implicit class RemoveTagsFromStreamInputOps[Self <: RemoveTagsFromStreamInput] (val x: Self) extends AnyVal {
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
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = this.set("TagKeys", js.Array(value :_*))
    @scala.inline
    def setTagKeys(value: TagKeyList): Self = this.set("TagKeys", value.asInstanceOf[js.Any])
  }
  
}

