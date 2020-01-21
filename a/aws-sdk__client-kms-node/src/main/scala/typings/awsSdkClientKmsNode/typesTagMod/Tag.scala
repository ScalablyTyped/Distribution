package typings.awsSdkClientKmsNode.typesTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * <p>The key of the tag.</p>
    */
  var TagKey: String
  /**
    * <p>The value of the tag.</p>
    */
  var TagValue: String
}

object Tag {
  @scala.inline
  def apply(TagKey: String, TagValue: String): Tag = {
    val __obj = js.Dynamic.literal(TagKey = TagKey.asInstanceOf[js.Any], TagValue = TagValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tag]
  }
}

