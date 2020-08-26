package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * The key of the tag.
    */
  var TagKey: TagKeyType = js.native
  /**
    * The value of the tag.
    */
  var TagValue: TagValueType = js.native
}

object Tag {
  @scala.inline
  def apply(TagKey: TagKeyType, TagValue: TagValueType): Tag = {
    val __obj = js.Dynamic.literal(TagKey = TagKey.asInstanceOf[js.Any], TagValue = TagValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  @scala.inline
  implicit class TagOps[Self <: Tag] (val x: Self) extends AnyVal {
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
    def setTagKey(value: TagKeyType): Self = this.set("TagKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagValue(value: TagValueType): Self = this.set("TagValue", value.asInstanceOf[js.Any])
  }
  
}

