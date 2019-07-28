package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_Dimension: typings.cssDashTree.cssDashTreeStrings.Dimension
  var unit: String
  var value: String
}

object Dimension {
  @scala.inline
  def apply(
    `type`: typings.cssDashTree.cssDashTreeStrings.Dimension,
    unit: String,
    value: String,
    loc: CssLocation = null
  ): Dimension = {
    val __obj = js.Dynamic.literal(unit = unit, value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Dimension]
  }
}

