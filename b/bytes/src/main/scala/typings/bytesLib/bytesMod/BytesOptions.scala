package typings
package bytesLib.bytesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesOptions extends js.Object {
  var decimalPlaces: js.UndefOr[scala.Double] = js.undefined
  var fixedDecimals: js.UndefOr[scala.Boolean] = js.undefined
  var thousandsSeparator: js.UndefOr[java.lang.String] = js.undefined
  var unit: js.UndefOr[java.lang.String] = js.undefined
  var unitSeparator: js.UndefOr[java.lang.String] = js.undefined
}

object BytesOptions {
  @scala.inline
  def apply(
    decimalPlaces: scala.Int | scala.Double = null,
    fixedDecimals: js.UndefOr[scala.Boolean] = js.undefined,
    thousandsSeparator: java.lang.String = null,
    unit: java.lang.String = null,
    unitSeparator: java.lang.String = null
  ): BytesOptions = {
    val __obj = js.Dynamic.literal()
    if (decimalPlaces != null) __obj.updateDynamic("decimalPlaces")(decimalPlaces.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedDecimals)) __obj.updateDynamic("fixedDecimals")(fixedDecimals)
    if (thousandsSeparator != null) __obj.updateDynamic("thousandsSeparator")(thousandsSeparator)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (unitSeparator != null) __obj.updateDynamic("unitSeparator")(unitSeparator)
    __obj.asInstanceOf[BytesOptions]
  }
}

