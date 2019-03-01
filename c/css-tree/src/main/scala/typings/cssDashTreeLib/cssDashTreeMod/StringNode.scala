package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringNode
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_StringNode: cssDashTreeLib.cssDashTreeLibStrings.String
  var value: java.lang.String
}

object StringNode {
  @scala.inline
  def apply(
    `type`: cssDashTreeLib.cssDashTreeLibStrings.String,
    value: java.lang.String,
    loc: CssLocation = null
  ): StringNode = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[StringNode]
  }
}

