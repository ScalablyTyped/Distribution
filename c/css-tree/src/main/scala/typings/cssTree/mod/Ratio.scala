package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ratio
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var left: String
  var right: String
  @JSName("type")
  var type_Ratio: typings.cssTree.cssTreeStrings.Ratio
}

object Ratio {
  @scala.inline
  def apply(left: String, right: String, `type`: typings.cssTree.cssTreeStrings.Ratio, loc: CssLocation = null): Ratio = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ratio]
  }
}

