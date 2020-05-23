package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoClassSelectorPlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain] | Null
  var name: String
  @JSName("type")
  var type_PseudoClassSelectorPlain: typings.cssTree.cssTreeStrings.PseudoClassSelector
}

object PseudoClassSelectorPlain {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.cssTree.cssTreeStrings.PseudoClassSelector,
    children: js.Array[CssNodePlain] = null,
    loc: CssLocation = null
  ): PseudoClassSelectorPlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoClassSelectorPlain]
  }
}

