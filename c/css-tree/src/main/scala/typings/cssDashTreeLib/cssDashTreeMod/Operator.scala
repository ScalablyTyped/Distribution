package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operator
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_Operator: cssDashTreeLib.cssDashTreeLibStrings.Operator
  var value: java.lang.String
}

object Operator {
  @scala.inline
  def apply(
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Operator,
    value: java.lang.String,
    loc: CssLocation = null
  ): Operator = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Operator]
  }
}

