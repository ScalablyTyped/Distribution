package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HexColor
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_HexColor: typings.cssTree.cssTreeStrings.HexColor
  var value: String
}

object HexColor {
  @scala.inline
  def apply(`type`: typings.cssTree.cssTreeStrings.HexColor, value: String, loc: CssLocation = null): HexColor = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexColor]
  }
}

