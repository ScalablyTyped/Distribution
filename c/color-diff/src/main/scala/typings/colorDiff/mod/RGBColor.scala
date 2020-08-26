package typings.colorDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RGBColor extends js.Object {
  var A: js.UndefOr[Double] = js.native
  var B: Double = js.native
  var G: Double = js.native
  var R: Double = js.native
}

object RGBColor {
  @scala.inline
  def apply(B: Double, G: Double, R: Double): RGBColor = {
    val __obj = js.Dynamic.literal(B = B.asInstanceOf[js.Any], G = G.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBColor]
  }
  @scala.inline
  implicit class RGBColorOps[Self <: RGBColor] (val x: Self) extends AnyVal {
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
    def setB(value: Double): Self = this.set("B", value.asInstanceOf[js.Any])
    @scala.inline
    def setG(value: Double): Self = this.set("G", value.asInstanceOf[js.Any])
    @scala.inline
    def setR(value: Double): Self = this.set("R", value.asInstanceOf[js.Any])
    @scala.inline
    def setA(value: Double): Self = this.set("A", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteA: Self = this.set("A", js.undefined)
  }
  
}

