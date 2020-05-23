package typings.colorDiff.mod

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
  def apply(B: Double, G: Double, R: Double, A: js.UndefOr[Double] = js.undefined): RGBColor = {
    val __obj = js.Dynamic.literal(B = B.asInstanceOf[js.Any], G = G.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any])
    if (!js.isUndefined(A)) __obj.updateDynamic("A")(A.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBColor]
  }
}

