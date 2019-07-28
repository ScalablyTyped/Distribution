package typings.cssDashTree.cssDashTreeMod

import typings.cssDashTree.cssDashTreeStrings.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionNodePlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain]
  var name: String
  @JSName("type")
  var type_FunctionNodePlain: Function
}

object FunctionNodePlain {
  @scala.inline
  def apply(children: js.Array[CssNodePlain], name: String, `type`: Function, loc: CssLocation = null): FunctionNodePlain = {
    val __obj = js.Dynamic.literal(children = children, name = name)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[FunctionNodePlain]
  }
}

