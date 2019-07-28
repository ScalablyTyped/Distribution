package typings.colorDashSupport.colorDashSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSupportResult extends js.Object {
  var has16m: Boolean
  var has256: Boolean
  var hasBasic: Boolean
  var level: ColorSupportLevel
}

object ColorSupportResult {
  @scala.inline
  def apply(has16m: Boolean, has256: Boolean, hasBasic: Boolean, level: ColorSupportLevel): ColorSupportResult = {
    val __obj = js.Dynamic.literal(has16m = has16m, has256 = has256, hasBasic = hasBasic, level = level)
  
    __obj.asInstanceOf[ColorSupportResult]
  }
}

