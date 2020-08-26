package typings.colorRgba.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RGBKeyedColor extends _ColorValue {
  var blue: Double = js.native
  var green: Double = js.native
  var red: Double = js.native
}

object RGBKeyedColor {
  @scala.inline
  def apply(blue: Double, green: Double, red: Double): RGBKeyedColor = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBKeyedColor]
  }
  @scala.inline
  implicit class RGBKeyedColorOps[Self <: RGBKeyedColor] (val x: Self) extends AnyVal {
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
    def setBlue(value: Double): Self = this.set("blue", value.asInstanceOf[js.Any])
    @scala.inline
    def setGreen(value: Double): Self = this.set("green", value.asInstanceOf[js.Any])
    @scala.inline
    def setRed(value: Double): Self = this.set("red", value.asInstanceOf[js.Any])
  }
  
}

