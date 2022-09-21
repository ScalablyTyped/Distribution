package typings.creditCardType

import typings.creditCardType.creditCardTypeNumbers.`3`
import typings.creditCardType.creditCardTypeNumbers.`4`
import typings.creditCardType.typesMod.CreditCardTypeSecurityCodeLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    var name: String
    
    var size: Double
  }
  object Name {
    
    inline def apply(name: String, size: Double): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<credit-card-type.credit-card-type/dist/types.CreditCardType> */
  trait PartialCreditCardType extends StObject {
    
    var code: js.UndefOr[Name] = js.undefined
    
    var gaps: js.UndefOr[js.Array[Double]] = js.undefined
    
    var lengths: js.UndefOr[js.Array[Double]] = js.undefined
    
    var matchStrength: js.UndefOr[Double] = js.undefined
    
    var niceType: js.UndefOr[String] = js.undefined
    
    var patterns: js.UndefOr[js.Array[js.Array[Double] | Double]] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PartialCreditCardType {
    
    inline def apply(): PartialCreditCardType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCreditCardType]
    }
    
    extension [Self <: PartialCreditCardType](x: Self) {
      
      inline def setCode(value: Name): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setGaps(value: js.Array[Double]): Self = StObject.set(x, "gaps", value.asInstanceOf[js.Any])
      
      inline def setGapsUndefined: Self = StObject.set(x, "gaps", js.undefined)
      
      inline def setGapsVarargs(value: Double*): Self = StObject.set(x, "gaps", js.Array(value*))
      
      inline def setLengths(value: js.Array[Double]): Self = StObject.set(x, "lengths", value.asInstanceOf[js.Any])
      
      inline def setLengthsUndefined: Self = StObject.set(x, "lengths", js.undefined)
      
      inline def setLengthsVarargs(value: Double*): Self = StObject.set(x, "lengths", js.Array(value*))
      
      inline def setMatchStrength(value: Double): Self = StObject.set(x, "matchStrength", value.asInstanceOf[js.Any])
      
      inline def setMatchStrengthUndefined: Self = StObject.set(x, "matchStrength", js.undefined)
      
      inline def setNiceType(value: String): Self = StObject.set(x, "niceType", value.asInstanceOf[js.Any])
      
      inline def setNiceTypeUndefined: Self = StObject.set(x, "niceType", js.undefined)
      
      inline def setPatterns(value: js.Array[js.Array[Double] | Double]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
      
      inline def setPatternsVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "patterns", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Size extends StObject {
    
    var name: CreditCardTypeSecurityCodeLabel
    
    var size: `3` | `4`
  }
  object Size {
    
    inline def apply(name: CreditCardTypeSecurityCodeLabel, size: `3` | `4`): Size = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setName(value: CreditCardTypeSecurityCodeLabel): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: `3` | `4`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
