package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operator
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_Operator: typings.cssTree.cssTreeStrings.Operator
  var value: String
}

object Operator {
  @scala.inline
  def apply(`type`: typings.cssTree.cssTreeStrings.Operator, value: String, loc: CssLocation = null): Operator = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operator]
  }
}

