package typings
package baidumapDashWebDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Overlay extends js.Object {
  var overlay: baidumapDashWebDashSdkLib.BMapNs.Overlay
  var pixel: baidumapDashWebDashSdkLib.BMapNs.Pixel
  var point: baidumapDashWebDashSdkLib.BMapNs.Point
  var target: js.Any
  var `type`: java.lang.String
}

object Anon_Overlay {
  @scala.inline
  def apply(
    overlay: baidumapDashWebDashSdkLib.BMapNs.Overlay,
    pixel: baidumapDashWebDashSdkLib.BMapNs.Pixel,
    point: baidumapDashWebDashSdkLib.BMapNs.Point,
    target: js.Any,
    `type`: java.lang.String
  ): Anon_Overlay = {
    val __obj = js.Dynamic.literal(overlay = overlay, pixel = pixel, point = point, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Overlay]
  }
}

