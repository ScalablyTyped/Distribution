package typings.currencyFormatter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Currency extends js.Object {
  
  var code: String = js.native
  
  var decimalDigits: Double = js.native
  
  var decimalSeparator: String = js.native
  
  var spaceBetweenAmountAndSymbol: Boolean = js.native
  
  var symbol: String = js.native
  
  var symbolOnLeft: Boolean = js.native
  
  var thousandsSeparator: String = js.native
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
  
  @scala.inline
  implicit class CurrencyOps[Self <: Currency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalDigits(value: Double): Self = this.set("decimalDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalSeparator(value: String): Self = this.set("decimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBetweenAmountAndSymbol(value: Boolean): Self = this.set("spaceBetweenAmountAndSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolOnLeft(value: Boolean): Self = this.set("symbolOnLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThousandsSeparator(value: String): Self = this.set("thousandsSeparator", value.asInstanceOf[js.Any])
  }
}
