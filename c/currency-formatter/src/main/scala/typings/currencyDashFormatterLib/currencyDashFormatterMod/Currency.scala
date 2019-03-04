package typings
package currencyDashFormatterLib.currencyDashFormatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currency extends js.Object {
  var code: java.lang.String
  var decimalDigits: scala.Double
  var decimalSeparator: java.lang.String
  var spaceBetweenAmountAndSymbol: scala.Boolean
  var symbol: java.lang.String
  var symbolOnLeft: scala.Boolean
  var thousandsSeparator: java.lang.String
}

object Currency {
  @scala.inline
  def apply(
    code: java.lang.String,
    decimalDigits: scala.Double,
    decimalSeparator: java.lang.String,
    spaceBetweenAmountAndSymbol: scala.Boolean,
    symbol: java.lang.String,
    symbolOnLeft: scala.Boolean,
    thousandsSeparator: java.lang.String
  ): Currency = {
    val __obj = js.Dynamic.literal(code = code, decimalDigits = decimalDigits, decimalSeparator = decimalSeparator, spaceBetweenAmountAndSymbol = spaceBetweenAmountAndSymbol, symbol = symbol, symbolOnLeft = symbolOnLeft, thousandsSeparator = thousandsSeparator)
  
    __obj.asInstanceOf[Currency]
  }
}

