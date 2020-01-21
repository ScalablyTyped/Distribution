package typings.currencyFormatter.mod

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
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], decimalDigits = decimalDigits.asInstanceOf[js.Any], decimalSeparator = decimalSeparator.asInstanceOf[js.Any], spaceBetweenAmountAndSymbol = spaceBetweenAmountAndSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], symbolOnLeft = symbolOnLeft.asInstanceOf[js.Any], thousandsSeparator = thousandsSeparator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Currency]
  }
}

