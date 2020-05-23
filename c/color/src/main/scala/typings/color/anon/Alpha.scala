package typings.color.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alpha extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var b: Double
  var g: Double
  var r: Double
}

object Alpha {
  @scala.inline
  def apply(b: Double, g: Double, r: Double, alpha: js.UndefOr[Double] = js.undefined): Alpha = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alpha]
  }
}

