package typings
package colorDashDiffLib.colorDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBColor extends js.Object {
  var A: js.UndefOr[scala.Double] = js.undefined
  var B: scala.Double
  var G: scala.Double
  var R: scala.Double
}

object RGBColor {
  @scala.inline
  def apply(B: scala.Double, G: scala.Double, R: scala.Double, A: scala.Int | scala.Double = null): RGBColor = {
    val __obj = js.Dynamic.literal(B = B, G = G, R = R)
    if (A != null) __obj.updateDynamic("A")(A.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBColor]
  }
}

