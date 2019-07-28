package typings.baidumapDashWebDashSdk

import typings.baidumapDashWebDashSdk.BMapNs.Pixel
import typings.baidumapDashWebDashSdk.BMapNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pixel extends js.Object {
  var pixel: Pixel
  var point: Point
  var target: js.Any
  var `type`: String
}

object Anon_Pixel {
  @scala.inline
  def apply(pixel: Pixel, point: Point, target: js.Any, `type`: String): Anon_Pixel = {
    val __obj = js.Dynamic.literal(pixel = pixel, point = point, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Pixel]
  }
}

