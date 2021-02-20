package typings.currencyFormatter

import typings.currencyFormatter.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("currency-formatter", "currencies")
  @js.native
  val currencies: js.Array[Currency] = js.native
  
  @JSImport("currency-formatter", "defaultCurrency")
  @js.native
  val defaultCurrency: Currency = js.native
  
  @JSImport("currency-formatter", "findCurrency")
  @js.native
  def findCurrency(currencyCode: String): Currency = js.native
  
  @JSImport("currency-formatter", "format")
  @js.native
  def format(value: Double, options: Code): String = js.native
  
  @JSImport("currency-formatter", "unformat")
  @js.native
  def unformat(value: String, options: Code): Double = js.native
  
  @js.native
  trait Currency extends StObject {
    
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
    implicit class CurrencyMutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalDigits(value: Double): Self = StObject.set(x, "decimalDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceBetweenAmountAndSymbol(value: Boolean): Self = StObject.set(x, "spaceBetweenAmountAndSymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolOnLeft(value: Boolean): Self = StObject.set(x, "symbolOnLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThousandsSeparator(value: String): Self = StObject.set(x, "thousandsSeparator", value.asInstanceOf[js.Any])
    }
  }
}
