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
    maxE: js.UndefOr[Double] = js.undefined,
    minE: js.UndefOr[Double] = js.undefined,
    modulo: DecimalModulo = null,
    precision: js.UndefOr[Double] = js.undefined,
    rounding: DecimalRounding = null,
    toExpNeg: js.UndefOr[Double] = js.undefined,
    toExpPos: js.UndefOr[Double] = js.undefined
  ): DecimalConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crypto)) __obj.updateDynamic("crypto")(crypto.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults)) __obj.updateDynamic("defaults")(defaults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxE)) __obj.updateDynamic("maxE")(maxE.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minE)) __obj.updateDynamic("minE")(minE.get.asInstanceOf[js.Any])
    if (modulo != null) __obj.updateDynamic("modulo")(modulo.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (rounding != null) __obj.updateDynamic("rounding")(rounding.asInstanceOf[js.Any])
    if (!js.isUndefined(toExpNeg)) __obj.updateDynamic("toExpNeg")(toExpNeg.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toExpPos)) __obj.updateDynamic("toExpPos")(toExpPos.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalConfig]
  }
}

