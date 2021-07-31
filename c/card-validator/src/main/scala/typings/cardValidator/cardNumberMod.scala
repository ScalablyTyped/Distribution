package typings.cardValidator

import typings.cardValidator.anon.Name
import typings.cardValidator.typesMod.Verification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardNumberMod {
  
  @JSImport("card-validator/dist/card-number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cardNumber(value: String): CardNumberVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("cardNumber")(value.asInstanceOf[js.Any]).asInstanceOf[CardNumberVerification]
  @scala.inline
  def cardNumber(value: String, options: CardNumberOptions): CardNumberVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("cardNumber")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CardNumberVerification]
  @scala.inline
  def cardNumber(value: js.Any): CardNumberVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("cardNumber")(value.asInstanceOf[js.Any]).asInstanceOf[CardNumberVerification]
  @scala.inline
  def cardNumber(value: js.Any, options: CardNumberOptions): CardNumberVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("cardNumber")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CardNumberVerification]
  
  trait CardNumberOptions extends StObject {
    
    var luhnValidateUnionPay: js.UndefOr[Boolean] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
  }
  object CardNumberOptions {
    
    @scala.inline
    def apply(): CardNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardNumberOptions]
    }
    
    @scala.inline
    implicit class CardNumberOptionsMutableBuilder[Self <: CardNumberOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLuhnValidateUnionPay(value: Boolean): Self = StObject.set(x, "luhnValidateUnionPay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLuhnValidateUnionPayUndefined: Self = StObject.set(x, "luhnValidateUnionPay", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    }
  }
  
  trait CardNumberVerification
    extends StObject
       with Verification {
    
    var card: CreditCardType | Null
  }
  object CardNumberVerification {
    
    @scala.inline
    def apply(isPotentiallyValid: Boolean, isValid: Boolean): CardNumberVerification = {
      val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], card = null)
      __obj.asInstanceOf[CardNumberVerification]
    }
    
    @scala.inline
    implicit class CardNumberVerificationMutableBuilder[Self <: CardNumberVerification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCard(value: CreditCardType): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardNull: Self = StObject.set(x, "card", null)
    }
  }
  
  trait CreditCardType extends StObject {
    
    var code: Name
    
    var gaps: js.Array[Double]
    
    var lengths: js.Array[Double]
    
    var niceType: String
    
    var patterns: js.Array[js.Array[Double] | Double]
    
    var `type`: String
  }
  object CreditCardType {
    
    @scala.inline
    def apply(
      code: Name,
      gaps: js.Array[Double],
      lengths: js.Array[Double],
      niceType: String,
      patterns: js.Array[js.Array[Double] | Double],
      `type`: String
    ): CreditCardType = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], gaps = gaps.asInstanceOf[js.Any], lengths = lengths.asInstanceOf[js.Any], niceType = niceType.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreditCardType]
    }
    
    @scala.inline
    implicit class CreditCardTypeMutableBuilder[Self <: CreditCardType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Name): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGaps(value: js.Array[Double]): Self = StObject.set(x, "gaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapsVarargs(value: Double*): Self = StObject.set(x, "gaps", js.Array(value :_*))
      
      @scala.inline
      def setLengths(value: js.Array[Double]): Self = StObject.set(x, "lengths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthsVarargs(value: Double*): Self = StObject.set(x, "lengths", js.Array(value :_*))
      
      @scala.inline
      def setNiceType(value: String): Self = StObject.set(x, "niceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatterns(value: js.Array[js.Array[Double] | Double]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternsVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "patterns", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
