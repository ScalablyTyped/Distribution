package typings.decimalJs.decimalGlobalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://mikemcl.github.io/decimal.js/#constructor-properties
trait DecimalConfig extends js.Object {
  var crypto: js.UndefOr[Boolean] = js.undefined
  var defaults: js.UndefOr[Boolean] = js.undefined
  var maxE: js.UndefOr[Double] = js.undefined
  var minE: js.UndefOr[Double] = js.undefined
  var modulo: js.UndefOr[DecimalModulo] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var rounding: js.UndefOr[DecimalRounding] = js.undefined
  var toExpNeg: js.UndefOr[Double] = js.undefined
  var toExpPos: js.UndefOr[Double] = js.undefined
}

object DecimalConfig {
  @scala.inline
  def apply(
    crypto: js.UndefOr[Boolean] = js.undefined,
    defaults: js.UndefOr[Boolean] = js.undefined,
    maxE: Int | Double = null,
    minE: Int | Double = null,
    modulo: DecimalModulo = null,
    precision: Int | Double = null,
    rounding: DecimalRounding = null,
    toExpNeg: Int | Double = null,
    toExpPos: Int | Double = null
  ): DecimalConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crypto)) __obj.updateDynamic("crypto")(crypto.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults)) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (maxE != null) __obj.updateDynamic("maxE")(maxE.asInstanceOf[js.Any])
    if (minE != null) __obj.updateDynamic("minE")(minE.asInstanceOf[js.Any])
    if (modulo != null) __obj.updateDynamic("modulo")(modulo.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (rounding != null) __obj.updateDynamic("rounding")(rounding.asInstanceOf[js.Any])
    if (toExpNeg != null) __obj.updateDynamic("toExpNeg")(toExpNeg.asInstanceOf[js.Any])
    if (toExpPos != null) __obj.updateDynamic("toExpPos")(toExpPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalConfig]
  }
}

