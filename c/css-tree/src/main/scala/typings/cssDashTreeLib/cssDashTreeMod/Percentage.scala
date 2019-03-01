package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Percentage
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_Percentage: cssDashTreeLib.cssDashTreeLibStrings.Percentage
  var value: java.lang.String
}

object Percentage {
  @scala.inline
  def apply(
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Percentage,
    value: java.lang.String,
    loc: CssLocation = null
  ): Percentage = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Percentage]
  }
}

