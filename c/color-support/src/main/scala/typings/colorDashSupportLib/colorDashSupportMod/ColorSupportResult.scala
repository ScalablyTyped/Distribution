package typings
package colorDashSupportLib.colorDashSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSupportResult extends js.Object {
  var has16m: scala.Boolean
  var has256: scala.Boolean
  var hasBasic: scala.Boolean
  var level: colorDashSupportLib.ColorSupportLevel
}

object ColorSupportResult {
  @scala.inline
  def apply(
    has16m: scala.Boolean,
    has256: scala.Boolean,
    hasBasic: scala.Boolean,
    level: colorDashSupportLib.ColorSupportLevel
  ): ColorSupportResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("has16m")(has16m)
    __obj.updateDynamic("has256")(has256)
    __obj.updateDynamic("hasBasic")(hasBasic)
    __obj.updateDynamic("level")(level)
    __obj.asInstanceOf[ColorSupportResult]
  }
}

