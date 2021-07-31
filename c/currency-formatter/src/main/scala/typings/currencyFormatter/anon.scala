package typings.currencyFormatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
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
    def apply(): Code = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      @scala.inline
      def setFormat(value: String | Neg): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      @scala.inline
      def setThousand(value: String): Self = StObject.set(x, "thousand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThousandUndefined: Self = StObject.set(x, "thousand", js.undefined)
    }
  }
  
  trait Neg extends StObject {
    
    var neg: String
    
    var pos: String
    
    var zero: String
  }
  object Neg {
    
    @scala.inline
    def apply(neg: String, pos: String, zero: String): Neg = {
      val __obj = js.Dynamic.literal(neg = neg.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
      __obj.asInstanceOf[Neg]
    }
    
    @scala.inline
    implicit class NegMutableBuilder[Self <: Neg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNeg(value: String): Self = StObject.set(x, "neg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZero(value: String): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    }
  }
}
