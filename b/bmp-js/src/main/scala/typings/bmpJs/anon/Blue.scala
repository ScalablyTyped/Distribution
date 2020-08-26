package typings.bmpJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blue extends js.Object {
  var blue: Double = js.native
  var green: Double = js.native
  var quad: Double = js.native
  var red: Double = js.native
}

object Blue {
  @scala.inline
  def apply(blue: Double, green: Double, quad: Double, red: Double): Blue = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], quad = quad.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blue]
  }
  @scala.inline
  implicit class BlueOps[Self <: Blue] (val x: Self) extends AnyVal {
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
    def setQuad(value: Double): Self = this.set("quad", value.asInstanceOf[js.Any])
    @scala.inline
    def setRed(value: Double): Self = this.set("red", value.asInstanceOf[js.Any])
  }
  
}

