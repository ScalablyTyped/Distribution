package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheetPlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain]
  @JSName("type")
  var type_StyleSheetPlain: cssDashTreeLib.cssDashTreeLibStrings.StyleSheet
}

object StyleSheetPlain {
  @scala.inline
  def apply(
    children: js.Array[CssNodePlain],
    `type`: cssDashTreeLib.cssDashTreeLibStrings.StyleSheet,
    loc: CssLocation = null
  ): StyleSheetPlain = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[StyleSheetPlain]
  }
}

