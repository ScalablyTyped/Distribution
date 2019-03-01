package typings
package currencyDashFormatterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var decimal: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String | Anon_Neg] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
  var symbol: js.UndefOr[java.lang.String] = js.undefined
  var thousand: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    decimal: java.lang.String = null,
    format: java.lang.String | Anon_Neg = null,
    locale: java.lang.String = null,
    precision: scala.Int | scala.Double = null,
    symbol: java.lang.String = null,
    thousand: java.lang.String = null
  ): Anon_Code = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (decimal != null) __obj.updateDynamic("decimal")(decimal)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (thousand != null) __obj.updateDynamic("thousand")(thousand)
    __obj.asInstanceOf[Anon_Code]
  }
}

