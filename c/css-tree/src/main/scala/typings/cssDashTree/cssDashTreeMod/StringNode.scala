package typings.cssDashTree.cssDashTreeMod

import typings.cssDashTree.cssDashTreeStrings.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringNode
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_StringNode: String
  var value: java.lang.String
}

object StringNode {
  @scala.inline
  def apply(`type`: String, value: java.lang.String, loc: CssLocation = null): StringNode = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[StringNode]
  }
}

