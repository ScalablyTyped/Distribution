package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteSpace
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_WhiteSpace: typings.cssTree.cssTreeStrings.WhiteSpace
  var value: String
}

object WhiteSpace {
  @scala.inline
  def apply(`type`: typings.cssTree.cssTreeStrings.WhiteSpace, value: String, loc: CssLocation = null): WhiteSpace = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteSpace]
  }
}

