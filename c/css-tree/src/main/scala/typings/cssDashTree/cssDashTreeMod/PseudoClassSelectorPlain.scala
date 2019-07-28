package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoClassSelectorPlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain] | Null
  var name: String
  @JSName("type")
  var type_PseudoClassSelectorPlain: typings.cssDashTree.cssDashTreeStrings.PseudoClassSelector
}

object PseudoClassSelectorPlain {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.cssDashTree.cssDashTreeStrings.PseudoClassSelector,
    children: js.Array[CssNodePlain] = null,
    loc: CssLocation = null
  ): PseudoClassSelectorPlain = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (children != null) __obj.updateDynamic("children")(children)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[PseudoClassSelectorPlain]
  }
}

