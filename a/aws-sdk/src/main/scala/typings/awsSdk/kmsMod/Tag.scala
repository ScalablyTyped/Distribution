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
}

