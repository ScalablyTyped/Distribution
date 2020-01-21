package typings.baidumapWebSdk

import typings.baidumapWebSdk.BMap.Overlay
import typings.baidumapWebSdk.BMap.Pixel
import typings.baidumapWebSdk.BMap.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOverlay extends js.Object {
  var overlay: Overlay
  var pixel: Pixel
  var point: Point
  var target: js.Any
  var `type`: String
}

object AnonOverlay {
  @scala.inline
  def apply(overlay: Overlay, pixel: Pixel, point: Point, target: js.Any, `type`: String): AnonOverlay = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOverlay]
  }
}

