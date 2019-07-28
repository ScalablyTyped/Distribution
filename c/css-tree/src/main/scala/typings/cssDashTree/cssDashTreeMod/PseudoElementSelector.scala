package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoElementSelector
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode] | Null
  var name: String
  @JSName("type")
  var type_PseudoElementSelector: typings.cssDashTree.cssDashTreeStrings.PseudoElementSelector
}

object PseudoElementSelector {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.cssDashTree.cssDashTreeStrings.PseudoElementSelector,
    children: List[CssNode] = null,
    loc: CssLocation = null
  ): PseudoElementSelector = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (children != null) __obj.updateDynamic("children")(children)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[PseudoElementSelector]
  }
}

