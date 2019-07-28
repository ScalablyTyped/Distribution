package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_Comment: typings.cssDashTree.cssDashTreeStrings.Comment
  var value: String
}

object Comment {
  @scala.inline
  def apply(`type`: typings.cssDashTree.cssDashTreeStrings.Comment, value: String, loc: CssLocation = null): Comment = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Comment]
  }
}

