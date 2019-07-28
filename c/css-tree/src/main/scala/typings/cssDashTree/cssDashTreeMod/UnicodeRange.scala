package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnicodeRange
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_UnicodeRange: typings.cssDashTree.cssDashTreeStrings.UnicodeRange
  var value: String
}

object UnicodeRange {
  @scala.inline
  def apply(
    `type`: typings.cssDashTree.cssDashTreeStrings.UnicodeRange,
    value: String,
    loc: CssLocation = null
  ): UnicodeRange = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[UnicodeRange]
  }
}

