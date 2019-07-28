package typings.currencyDashFormatter.currencyDashFormatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currency extends js.Object {
  var code: String
  var decimalDigits: Double
  var decimalSeparator: String
  var spaceBetweenAmountAndSymbol: Boolean
  var symbol: String
  var symbolOnLeft: Boolean
  var thousandsSeparator: String
}

object Currency {
  @scala.inline
  def apply(
    code: String,
    decimalDigits: Double,
    decimalSeparator: String,
    spaceBetweenAmountAndSymbol: Boolean,
    symbol: String,
    symbolOnLeft: Boolean,
    thousandsSeparator: String
  ): Currency = {
    val __obj = js.Dynamic.literal(code = code, decimalDigits = decimalDigits, decimalSeparator = decimalSeparator, spaceBetweenAmountAndSymbol = spaceBetweenAmountAndSymbol, symbol = symbol, symbolOnLeft = symbolOnLeft, thousandsSeparator = thousandsSeparator)
  
    __obj.asInstanceOf[Currency]
  }
}

