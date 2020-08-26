package typings.baidumapWebSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pixel extends js.Object {
  var pixel: typings.baidumapWebSdk.BMap.Pixel = js.native
  var point: typings.baidumapWebSdk.BMap.Point = js.native
  var target: js.Any = js.native
  var `type`: String = js.native
}

object Pixel {
  @scala.inline
  def apply(
    pixel: typings.baidumapWebSdk.BMap.Pixel,
    point: typings.baidumapWebSdk.BMap.Point,
    target: js.Any,
    `type`: String
  ): Pixel = {
    val __obj = js.Dynamic.literal(pixel = pixel.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pixel]
  }
  @scala.inline
  implicit class PixelOps[Self <: Pixel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPixel(value: typings.baidumapWebSdk.BMap.Pixel): Self = this.set("pixel", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoint(value: typings.baidumapWebSdk.BMap.Point): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

