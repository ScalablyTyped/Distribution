package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoClassSelector
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode] | scala.Null
  var name: java.lang.String
  @JSName("type")
  var type_PseudoClassSelector: cssDashTreeLib.cssDashTreeLibStrings.PseudoClassSelector
}

object PseudoClassSelector {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: cssDashTreeLib.cssDashTreeLibStrings.PseudoClassSelector,
    children: List[CssNode] = null,
    loc: CssLocation = null
  ): PseudoClassSelector = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (children != null) __obj.updateDynamic("children")(children)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[PseudoClassSelector]
  }
}

