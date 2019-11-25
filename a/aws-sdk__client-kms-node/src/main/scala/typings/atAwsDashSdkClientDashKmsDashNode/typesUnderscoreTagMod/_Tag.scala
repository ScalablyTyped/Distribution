package typings.atAwsDashSdkClientDashKmsDashNode.typesUnderscoreTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Tag extends js.Object {
  /**
    * <p>The key of the tag.</p>
    */
  var TagKey: String
  /**
    * <p>The value of the tag.</p>
    */
  var TagValue: String
}

object _Tag {
  @scala.inline
  def apply(TagKey: String, TagValue: String): _Tag = {
    val __obj = js.Dynamic.literal(TagKey = TagKey.asInstanceOf[js.Any], TagValue = TagValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Tag]
  }
}

