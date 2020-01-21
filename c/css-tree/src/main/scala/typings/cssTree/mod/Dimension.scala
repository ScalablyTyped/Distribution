package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_Dimension: typings.cssTree.cssTreeStrings.Dimension
  var unit: String
  var value: String
}

object Dimension {
  @scala.inline
  def apply(
    `type`: typings.cssTree.cssTreeStrings.Dimension,
    unit: String,
    value: String,
    loc: CssLocation = null
  ): Dimension = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
}

