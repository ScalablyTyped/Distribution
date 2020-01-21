package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnicodeRange
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_UnicodeRange: typings.cssTree.cssTreeStrings.UnicodeRange
  var value: String
}

object UnicodeRange {
  @scala.inline
  def apply(`type`: typings.cssTree.cssTreeStrings.UnicodeRange, value: String, loc: CssLocation = null): UnicodeRange = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnicodeRange]
  }
}

