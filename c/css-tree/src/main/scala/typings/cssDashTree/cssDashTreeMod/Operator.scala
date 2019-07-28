package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operator
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_Operator: typings.cssDashTree.cssDashTreeStrings.Operator
  var value: String
}

object Operator {
  @scala.inline
  def apply(`type`: typings.cssDashTree.cssDashTreeStrings.Operator, value: String, loc: CssLocation = null): Operator = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Operator]
  }
}

