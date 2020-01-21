package typings.color

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlphaB extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var b: Double
  var g: Double
  var r: Double
}

object AnonAlphaB {
  @scala.inline
  def apply(b: Double, g: Double, r: Double, alpha: Int | Double = null): AnonAlphaB = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlphaB]
  }
}

