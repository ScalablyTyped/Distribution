package typings
package baidumapDashWebDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pixel extends js.Object {
  var pixel: baidumapDashWebDashSdkLib.BMapNs.Pixel
  var point: baidumapDashWebDashSdkLib.BMapNs.Point
  var target: js.Any
  var `type`: java.lang.String
}

object Anon_Pixel {
  @scala.inline
  def apply(
    pixel: baidumapDashWebDashSdkLib.BMapNs.Pixel,
    point: baidumapDashWebDashSdkLib.BMapNs.Point,
    target: js.Any,
    `type`: java.lang.String
  ): Anon_Pixel = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("pixel")(pixel)
    __obj.updateDynamic("point")(point)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Anon_Pixel]
  }
}

