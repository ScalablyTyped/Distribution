package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_Value: cssDashTreeLib.cssDashTreeLibStrings.Value
}

object Value {
  @scala.inline
  def apply(
    children: List[CssNode],
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Value,
    loc: CssLocation = null
  ): Value = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Value]
  }
}

