package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoElementSelectorPlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain] | Null
  var name: String
  @JSName("type")
  var type_PseudoElementSelectorPlain: typings.cssTree.cssTreeStrings.PseudoElementSelector
}

object PseudoElementSelectorPlain {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.cssTree.cssTreeStrings.PseudoElementSelector,
    children: js.Array[CssNodePlain] = null,
    loc: CssLocation = null
  ): PseudoElementSelectorPlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoElementSelectorPlain]
  }
}

