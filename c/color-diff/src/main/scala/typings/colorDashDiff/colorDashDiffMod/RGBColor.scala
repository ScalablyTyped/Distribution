package typings.colorDashDiff.colorDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBColor extends js.Object {
  var A: js.UndefOr[Double] = js.undefined
  var B: Double
  var G: Double
  var R: Double
}

object RGBColor {
  @scala.inline
  def apply(B: Double, G: Double, R: Double, A: Int | Double = null): RGBColor = {
    val __obj = js.Dynamic.literal(B = B.asInstanceOf[js.Any], G = G.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any])
    if (A != null) __obj.updateDynamic("A")(A.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBColor]
  }
}

