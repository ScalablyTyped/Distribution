package typings.baidumapWebSdk

import typings.baidumapWebSdk.BMap.Pixel
import typings.baidumapWebSdk.BMap.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPixelPoint extends js.Object {
  var pixel: Pixel
  var point: Point
  var target: js.Any
  var `type`: String
  var zoom: Double
}

object AnonPixelPoint {
  @scala.inline
  def apply(pixel: Pixel, point: Point, target: js.Any, `type`: String, zoom: Double): AnonPixelPoint = {
    val __obj = js.Dynamic.literal(pixel = pixel.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPixelPoint]
  }
}

