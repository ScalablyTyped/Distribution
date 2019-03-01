package typings
package decimalDotJsLib.decimalDotJsMod.DecimalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var crypto: js.UndefOr[scala.Boolean] = js.undefined
  var defaults: js.UndefOr[scala.Boolean] = js.undefined
  var maxE: js.UndefOr[scala.Double] = js.undefined
  var minE: js.UndefOr[scala.Double] = js.undefined
  var modulo: js.UndefOr[Modulo] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
  var rounding: js.UndefOr[Rounding] = js.undefined
  var toExpNeg: js.UndefOr[scala.Double] = js.undefined
  var toExpPos: js.UndefOr[scala.Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    crypto: js.UndefOr[scala.Boolean] = js.undefined,
    defaults: js.UndefOr[scala.Boolean] = js.undefined,
    maxE: scala.Int | scala.Double = null,
    minE: scala.Int | scala.Double = null,
    modulo: Modulo = null,
    precision: scala.Int | scala.Double = null,
    rounding: Rounding = null,
    toExpNeg: scala.Int | scala.Double = null,
    toExpPos: scala.Int | scala.Double = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crypto)) __obj.updateDynamic("crypto")(crypto)
    if (!js.isUndefined(defaults)) __obj.updateDynamic("defaults")(defaults)
    if (maxE != null) __obj.updateDynamic("maxE")(maxE.asInstanceOf[js.Any])
    if (minE != null) __obj.updateDynamic("minE")(minE.asInstanceOf[js.Any])
    if (modulo != null) __obj.updateDynamic("modulo")(modulo)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (rounding != null) __obj.updateDynamic("rounding")(rounding)
    if (toExpNeg != null) __obj.updateDynamic("toExpNeg")(toExpNeg.asInstanceOf[js.Any])
    if (toExpPos != null) __obj.updateDynamic("toExpPos")(toExpPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

