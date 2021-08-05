package typings.currencyFormatter

import typings.currencyFormatter.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("currency-formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("currency-formatter", "currencies")
  @js.native
  val currencies: js.Array[Currency] = js.native
  
  @JSImport("currency-formatter", "defaultCurrency")
  @js.native
  val defaultCurrency: Currency = js.native
  
  inline def findCurrency(currencyCode: String): Currency = ^.asInstanceOf[js.Dynamic].applyDynamic("findCurrency")(currencyCode.asInstanceOf[js.Any]).asInstanceOf[Currency]
  
  inline def format(value: Double, options: Code): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def unformat(value: String, options: Code): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unformat")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait Currency extends StObject {
    
    var code: String
    
    var decimalDigits: Double
    
    var decimalSeparator: String
    
    var spaceBetweenAmountAndSymbol: Boolean
    
    var symbol: String
    
    var symbolOnLeft: Boolean
    
    var thousandsSeparator: String
  }
  object Currency {
    
    inline def apply(
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
    
    extension [Self <: Currency](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDecimalDigits(value: Double): Self = StObject.set(x, "decimalDigits", value.asInstanceOf[js.Any])
      
      inline def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
      
      inline def setSpaceBetweenAmountAndSymbol(value: Boolean): Self = StObject.set(x, "spaceBetweenAmountAndSymbol", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolOnLeft(value: Boolean): Self = StObject.set(x, "symbolOnLeft", value.asInstanceOf[js.Any])
      
      inline def setThousandsSeparator(value: String): Self = StObject.set(x, "thousandsSeparator", value.asInstanceOf[js.Any])
    }
  }
}
