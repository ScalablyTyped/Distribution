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
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionNode]
  }
}

