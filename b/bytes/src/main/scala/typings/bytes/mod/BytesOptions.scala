package typings.bytes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesOptions extends js.Object {
  var decimalPlaces: js.UndefOr[Double] = js.undefined
  var fixedDecimals: js.UndefOr[Boolean] = js.undefined
  var thousandsSeparator: js.UndefOr[String] = js.undefined
  var unit: js.UndefOr[Unit] = js.undefined
  var unitSeparator: js.UndefOr[String] = js.undefined
}

object BytesOptions {
  @scala.inline
  def apply(
    decimalPlaces: Int | Double = null,
    fixedDecimals: js.UndefOr[Boolean] = js.undefined,
    thousandsSeparator: String = null,
    unit: Unit = null,
    unitSeparator: String = null
  ): BytesOptions = {
    val __obj = js.Dynamic.literal()
    if (decimalPlaces != null) __obj.updateDynamic("decimalPlaces")(decimalPlaces.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedDecimals)) __obj.updateDynamic("fixedDecimals")(fixedDecimals.asInstanceOf[js.Any])
    if (thousandsSeparator != null) __obj.updateDynamic("thousandsSeparator")(thousandsSeparator.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (unitSeparator != null) __obj.updateDynamic("unitSeparator")(unitSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesOptions]
  }
}

