package typings.currencyFormatter

import typings.currencyFormatter.anon.Neg
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
  
  /* Inlined std.Omit<currency-formatter.currency-formatter.Currency, 'code'> */
  object defaultCurrency {
    
    @JSImport("currency-formatter", "defaultCurrency")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("currency-formatter", "defaultCurrency.decimalDigits")
    @js.native
    def decimalDigits: Double = js.native
    inline def decimalDigits_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decimalDigits")(x.asInstanceOf[js.Any])
    
    @JSImport("currency-formatter", "defaultCurrency.decimalSeparator")
    @js.native
    def decimalSeparator: String = js.native
    inline def decimalSeparator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(x.asInstanceOf[js.Any])
    
    @JSImport("currency-formatter", "defaultCurrency.spaceBetweenAmountAndSymbol")
    @js.native
    def spaceBetweenAmountAndSymbol: Boolean = js.native
    inline def spaceBetweenAmountAndSymbol_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spaceBetweenAmountAndSymbol")(x.asInstanceOf[js.Any])
    
    @JSImport("currency-formatter", "defaultCurrency.symbol")
    @js.native
    def symbol: String = js.native
    
    @JSImport("currency-formatter", "defaultCurrency.symbolOnLeft")
    @js.native
    def symbolOnLeft: Boolean = js.native
    inline def symbolOnLeft_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolOnLeft")(x.asInstanceOf[js.Any])
    
    inline def symbol_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbol")(x.asInstanceOf[js.Any])
    
    @JSImport("currency-formatter", "defaultCurrency.thousandsSeparator")
    @js.native
    def thousandsSeparator: String = js.native
    inline def thousandsSeparator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("thousandsSeparator")(x.asInstanceOf[js.Any])
  }
  
  inline def findCurrency(currencyCode: String): js.UndefOr[Currency] = ^.asInstanceOf[js.Dynamic].applyDynamic("findCurrency")(currencyCode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Currency]]
  
  inline def format(value: Double, options: FormatOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def unformat(value: String, options: FormatOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unformat")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait Currency extends StObject {
    
    var code: String
    
    /**
      * @default 2
      */
    var decimalDigits: Double
    
    /**
      * @default '.'
      */
    var decimalSeparator: String
    
    /**
      * @default false
      */
    var spaceBetweenAmountAndSymbol: Boolean
    
    /**
      * @default ''
      */
    var symbol: String
    
    /**
      * @default false
      */
    var symbolOnLeft: Boolean
    
    /**
      * @default ','
      */
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
  
  trait FormatOptions extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var decimal: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[String | Neg] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var symbol: js.UndefOr[String] = js.undefined
    
    var thousand: js.UndefOr[String] = js.undefined
  }
  object FormatOptions {
    
    inline def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    extension [Self <: FormatOptions](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      inline def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      inline def setFormat(value: String | Neg): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setThousand(value: String): Self = StObject.set(x, "thousand", value.asInstanceOf[js.Any])
      
      inline def setThousandUndefined: Self = StObject.set(x, "thousand", js.undefined)
    }
  }
}
