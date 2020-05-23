package typings.currencyFormatter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var decimal: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String | Neg] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var symbol: js.UndefOr[String] = js.undefined
  var thousand: js.UndefOr[String] = js.undefined
}

object Code {
  @scala.inline
  def apply(
    code: String = null,
    decimal: String = null,
    format: String | Neg = null,
    locale: String = null,
    precision: js.UndefOr[Double] = js.undefined,
    symbol: String = null,
    thousand: String = null
  ): Code = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (thousand != null) __obj.updateDynamic("thousand")(thousand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

