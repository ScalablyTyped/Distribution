package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Function
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
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionNodePlain]
  }
}

