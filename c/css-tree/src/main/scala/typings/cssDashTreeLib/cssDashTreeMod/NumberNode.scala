package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberNode
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_NumberNode: cssDashTreeLib.cssDashTreeLibStrings.Number
  var value: java.lang.String
}

object NumberNode {
  @scala.inline
  def apply(
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Number,
    value: java.lang.String,
    loc: CssLocation = null
  ): NumberNode = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[NumberNode]
  }
}

