package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteSpace
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_WhiteSpace: cssDashTreeLib.cssDashTreeLibStrings.WhiteSpace
  var value: java.lang.String
}

object WhiteSpace {
  @scala.inline
  def apply(
    `type`: cssDashTreeLib.cssDashTreeLibStrings.WhiteSpace,
    value: java.lang.String,
    loc: CssLocation = null
  ): WhiteSpace = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[WhiteSpace]
  }
}

