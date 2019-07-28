package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_Value: typings.cssDashTree.cssDashTreeStrings.Value
}

object Value {
  @scala.inline
  def apply(
    children: List[CssNode],
    `type`: typings.cssDashTree.cssDashTreeStrings.Value,
    loc: CssLocation = null
  ): Value = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Value]
  }
}

