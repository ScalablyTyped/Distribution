package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_Dimension: cssDashTreeLib.cssDashTreeLibStrings.Dimension
  var unit: java.lang.String
  var value: java.lang.String
}

object Dimension {
  @scala.inline
  def apply(
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Dimension,
    unit: java.lang.String,
    value: java.lang.String,
    loc: CssLocation = null
  ): Dimension = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("unit")(unit)
    __obj.updateDynamic("value")(value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Dimension]
  }
}

