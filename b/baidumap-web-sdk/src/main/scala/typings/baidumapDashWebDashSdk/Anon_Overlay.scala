package typings.baidumapDashWebDashSdk

import typings.baidumapDashWebDashSdk.BMap.Overlay
import typings.baidumapDashWebDashSdk.BMap.Pixel
import typings.baidumapDashWebDashSdk.BMap.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Overlay extends js.Object {
  var overlay: Overlay
  var pixel: Pixel
  var point: Point
  var target: js.Any
  var `type`: String
}

object Anon_Overlay {
  @scala.inline
  def apply(overlay: Overlay, pixel: Pixel, point: Point, target: js.Any, `type`: String): Anon_Overlay = {
    val __obj = js.Dynamic.literal(overlay = overlay, pixel = pixel, point = point, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Overlay]
  }
}

