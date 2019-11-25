package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Percentage
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_Percentage: typings.cssDashTree.cssDashTreeStrings.Percentage
  var value: String
}

object Percentage {
  @scala.inline
  def apply(`type`: typings.cssDashTree.cssDashTreeStrings.Percentage, value: String, loc: CssLocation = null): Percentage = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Percentage]
  }
}

