package typings.cssDashTree.cssDashTreeMod

import typings.cssDashTree.cssDashTreeStrings.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberNode
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_NumberNode: Number
  var value: String
}

object NumberNode {
  @scala.inline
  def apply(`type`: Number, value: String, loc: CssLocation = null): NumberNode = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[NumberNode]
  }
}

