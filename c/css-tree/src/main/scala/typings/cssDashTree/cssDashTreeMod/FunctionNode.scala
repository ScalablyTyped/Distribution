package typings.cssDashTree.cssDashTreeMod

import typings.cssDashTree.cssDashTreeStrings.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionNode
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  var name: String
  @JSName("type")
  var type_FunctionNode: Function
}

object FunctionNode {
  @scala.inline
  def apply(children: List[CssNode], name: String, `type`: Function, loc: CssLocation = null): FunctionNode = {
    val __obj = js.Dynamic.literal(children = children, name = name)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[FunctionNode]
  }
}

