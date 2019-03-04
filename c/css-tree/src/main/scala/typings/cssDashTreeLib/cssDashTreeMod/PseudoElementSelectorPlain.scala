package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoElementSelectorPlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain] | scala.Null
  var name: java.lang.String
  @JSName("type")
  var type_PseudoElementSelectorPlain: cssDashTreeLib.cssDashTreeLibStrings.PseudoElementSelector
}

object PseudoElementSelectorPlain {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: cssDashTreeLib.cssDashTreeLibStrings.PseudoElementSelector,
    children: js.Array[CssNodePlain] = null,
    loc: CssLocation = null
  ): PseudoElementSelectorPlain = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (children != null) __obj.updateDynamic("children")(children)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[PseudoElementSelectorPlain]
  }
}

