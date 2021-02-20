package typings.creditCardType

import typings.creditCardType.creditCardTypeNumbers.`3`
import typings.creditCardType.creditCardTypeNumbers.`4`
import typings.creditCardType.typesMod.CreditCardTypeSecurityCodeLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
    
    var size: Double = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String, size: Double): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<credit-card-type.credit-card-type/dist/types.CreditCardType> */
  @js.native
  trait PartialCreditCardType extends StObject {
    
    var code: js.UndefOr[Name] = js.native
    
    var gaps: js.UndefOr[js.Array[Double]] = js.native
    
    var lengths: js.UndefOr[js.Array[Double]] = js.native
    
    var matchStrength: js.UndefOr[Double] = js.native
    
    var niceType: js.UndefOr[String] = js.native
    
    var patterns: js.UndefOr[js.Array[js.Array[Double] | Double]] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object PartialCreditCardType {
    
    @scala.inline
    def apply(): PartialCreditCardType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCreditCardType]
    }
    
    @scala.inline
    implicit class PartialCreditCardTypeMutableBuilder[Self <: PartialCreditCardType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Name): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setGaps(value: js.Array[Double]): Self = StObject.set(x, "gaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapsUndefined: Self = StObject.set(x, "gaps", js.undefined)
      
      @scala.inline
      def setGapsVarargs(value: Double*): Self = StObject.set(x, "gaps", js.Array(value :_*))
      
      @scala.inline
      def setLengths(value: js.Array[Double]): Self = StObject.set(x, "lengths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthsUndefined: Self = StObject.set(x, "lengths", js.undefined)
      
      @scala.inline
      def setLengthsVarargs(value: Double*): Self = StObject.set(x, "lengths", js.Array(value :_*))
      
      @scala.inline
      def setMatchStrength(value: Double): Self = StObject.set(x, "matchStrength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchStrengthUndefined: Self = StObject.set(x, "matchStrength", js.undefined)
      
      @scala.inline
      def setNiceType(value: String): Self = StObject.set(x, "niceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNiceTypeUndefined: Self = StObject.set(x, "niceType", js.undefined)
      
      @scala.inline
      def setPatterns(value: js.Array[js.Array[Double] | Double]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
      
      @scala.inline
      def setPatternsVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "patterns", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Size extends StObject {
    
    var name: CreditCardTypeSecurityCodeLabel = js.native
    
    var size: `3` | `4` = js.native
  }
  object Size {
    
    @scala.inline
    def apply(name: CreditCardTypeSecurityCodeLabel, size: `3` | `4`): Size = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: CreditCardTypeSecurityCodeLabel): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: `3` | `4`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
