package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoElementSelector
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode] | scala.Null
  var name: java.lang.String
  @JSName("type")
  var type_PseudoElementSelector: cssDashTreeLib.cssDashTreeLibStrings.PseudoElementSelector
}

object PseudoElementSelector {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: cssDashTreeLib.cssDashTreeLibStrings.PseudoElementSelector,
    children: List[CssNode] = null,
    loc: CssLocation = null
  ): PseudoElementSelector = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    if (children != null) __obj.updateDynamic("children")(children)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[PseudoElementSelector]
  }
}

