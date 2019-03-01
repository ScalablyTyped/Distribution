package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionNode
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  var name: java.lang.String
  @JSName("type")
  var type_FunctionNode: cssDashTreeLib.cssDashTreeLibStrings.Function
}

object FunctionNode {
  @scala.inline
  def apply(
    children: List[CssNode],
    name: java.lang.String,
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Function,
    loc: CssLocation = null
  ): FunctionNode = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("name")(name)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[FunctionNode]
  }
}

