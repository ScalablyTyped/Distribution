package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnicodeRange
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_UnicodeRange: cssDashTreeLib.cssDashTreeLibStrings.UnicodeRange
  var value: java.lang.String
}

object UnicodeRange {
  @scala.inline
  def apply(
    `type`: cssDashTreeLib.cssDashTreeLibStrings.UnicodeRange,
    value: java.lang.String,
    loc: CssLocation = null
  ): UnicodeRange = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[UnicodeRange]
  }
}

