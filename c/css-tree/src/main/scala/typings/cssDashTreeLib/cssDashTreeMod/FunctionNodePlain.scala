package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionNodePlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain]
  var name: java.lang.String
  @JSName("type")
  var type_FunctionNodePlain: cssDashTreeLib.cssDashTreeLibStrings.Function
}

object FunctionNodePlain {
  @scala.inline
  def apply(
    children: js.Array[CssNodePlain],
    name: java.lang.String,
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Function,
    loc: CssLocation = null
  ): FunctionNodePlain = {
    val __obj = js.Dynamic.literal(children = children, name = name)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[FunctionNodePlain]
  }
}

