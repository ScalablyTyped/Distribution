package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_Comment: cssDashTreeLib.cssDashTreeLibStrings.Comment
  var value: java.lang.String
}

object Comment {
  @scala.inline
  def apply(
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Comment,
    value: java.lang.String,
    loc: CssLocation = null
  ): Comment = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Comment]
  }
}

