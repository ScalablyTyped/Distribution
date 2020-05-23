package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoElementSelector
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode] | Null
  var name: String
  @JSName("type")
  var type_PseudoElementSelector: typings.cssTree.cssTreeStrings.PseudoElementSelector
}

object PseudoElementSelector {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.cssTree.cssTreeStrings.PseudoElementSelector,
    children: List[CssNode] = null,
    loc: CssLocation = null
  ): PseudoElementSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoElementSelector]
  }
}

