package typings.creditCardType

import org.scalablytyped.runtime.StringDictionary
import typings.creditCardType.anon.Name
import typings.creditCardType.anon.Size
import typings.creditCardType.creditCardTypeStrings.discover_
import typings.creditCardType.creditCardTypeStrings.elo_
import typings.creditCardType.creditCardTypeStrings.hiper_
import typings.creditCardType.creditCardTypeStrings.hipercard_
import typings.creditCardType.creditCardTypeStrings.jcb_
import typings.creditCardType.creditCardTypeStrings.maestro_
import typings.creditCardType.creditCardTypeStrings.mastercard_
import typings.creditCardType.creditCardTypeStrings.mir_
import typings.creditCardType.creditCardTypeStrings.unionpay_
import typings.creditCardType.creditCardTypeStrings.visa_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait BuiltInCreditCardType
    extends StObject
       with CreditCardType {
    
    @JSName("code")
    var code_BuiltInCreditCardType: Size
    
    @JSName("niceType")
    var niceType_BuiltInCreditCardType: CreditCardTypeCardBrandNiceType
    
    @JSName("type")
    var type_BuiltInCreditCardType: CreditCardTypeCardBrandId
  }
  object BuiltInCreditCardType {
    
    inline def apply(
      code: Size,
      gaps: js.Array[Double],
      lengths: js.Array[Double],
      niceType: CreditCardTypeCardBrandNiceType,
      patterns: js.Array[js.Array[Double] | Double],
      `type`: CreditCardTypeCardBrandId
    ): BuiltInCreditCardType = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], gaps = gaps.asInstanceOf[js.Any], lengths = lengths.asInstanceOf[js.Any], niceType = niceType.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuiltInCreditCardType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuiltInCreditCardType] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Size): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setNiceType(value: CreditCardTypeCardBrandNiceType): Self = StObject.set(x, "niceType", value.asInstanceOf[js.Any])
      
      inline def setType(value: CreditCardTypeCardBrandId): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type CardCollection = StringDictionary[CreditCardType]
  
  trait CreditCardType extends StObject {
    
    var code: Name
    
    var gaps: js.Array[Double]
    
    var lengths: js.Array[Double]
    
    var matchStrength: js.UndefOr[Double] = js.undefined
    
    var niceType: String
    
    var patterns: js.Array[js.Array[Double] | Double]
    
    var `type`: String
  }
  object CreditCardType {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: CreditCardType] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Name): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setGaps(value: js.Array[Double]): Self = StObject.set(x, "gaps", value.asInstanceOf[js.Any])
      
      inline def setGapsVarargs(value: Double*): Self = StObject.set(x, "gaps", js.Array(value*))
      
      inline def setLengths(value: js.Array[Double]): Self = StObject.set(x, "lengths", value.asInstanceOf[js.Any])
      
      inline def setLengthsVarargs(value: Double*): Self = StObject.set(x, "lengths", js.Array(value*))
      
      inline def setMatchStrength(value: Double): Self = StObject.set(x, "matchStrength", value.asInstanceOf[js.Any])
      
      inline def setMatchStrengthUndefined: Self = StObject.set(x, "matchStrength", js.undefined)
      
      inline def setNiceType(value: String): Self = StObject.set(x, "niceType", value.asInstanceOf[js.Any])
      
      inline def setPatterns(value: js.Array[js.Array[Double] | Double]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "patterns", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.creditCardType.creditCardTypeStrings.`american-express`
    - typings.creditCardType.creditCardTypeStrings.`diners-club`
    - typings.creditCardType.creditCardTypeStrings.discover_
    - typings.creditCardType.creditCardTypeStrings.elo_
    - typings.creditCardType.creditCardTypeStrings.hiper_
    - typings.creditCardType.creditCardTypeStrings.hipercard_
    - typings.creditCardType.creditCardTypeStrings.jcb_
    - typings.creditCardType.creditCardTypeStrings.maestro_
    - typings.creditCardType.creditCardTypeStrings.mastercard_
    - typings.creditCardType.creditCardTypeStrings.mir_
    - typings.creditCardType.creditCardTypeStrings.unionpay_
    - typings.creditCardType.creditCardTypeStrings.visa_
  */
  trait CreditCardTypeCardBrandId extends StObject
  object CreditCardTypeCardBrandId {
    
    inline def `american-express`: typings.creditCardType.creditCardTypeStrings.`american-express` = "american-express".asInstanceOf[typings.creditCardType.creditCardTypeStrings.`american-express`]
    
    inline def `diners-club`: typings.creditCardType.creditCardTypeStrings.`diners-club` = "diners-club".asInstanceOf[typings.creditCardType.creditCardTypeStrings.`diners-club`]
    
    inline def discover: discover_ = "discover".asInstanceOf[discover_]
    
    inline def elo: elo_ = "elo".asInstanceOf[elo_]
    
    inline def hiper: hiper_ = "hiper".asInstanceOf[hiper_]
    
    inline def hipercard: hipercard_ = "hipercard".asInstanceOf[hipercard_]
    
    inline def jcb: jcb_ = "jcb".asInstanceOf[jcb_]
    
    inline def maestro: maestro_ = "maestro".asInstanceOf[maestro_]
    
    inline def mastercard: mastercard_ = "mastercard".asInstanceOf[mastercard_]
    
    inline def mir: mir_ = "mir".asInstanceOf[mir_]
    
    inline def unionpay: unionpay_ = "unionpay".asInstanceOf[unionpay_]
    
    inline def visa: visa_ = "visa".asInstanceOf[visa_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.creditCardType.creditCardTypeStrings.`American Express`
    - typings.creditCardType.creditCardTypeStrings.`Diners Club`
    - typings.creditCardType.creditCardTypeStrings.Discover
    - typings.creditCardType.creditCardTypeStrings.Elo
    - typings.creditCardType.creditCardTypeStrings.Hiper
    - typings.creditCardType.creditCardTypeStrings.Hipercard
    - typings.creditCardType.creditCardTypeStrings.JCB
    - typings.creditCardType.creditCardTypeStrings.Maestro
    - typings.creditCardType.creditCardTypeStrings.Mastercard
    - typings.creditCardType.creditCardTypeStrings.Mir
    - typings.creditCardType.creditCardTypeStrings.UnionPay
    - typings.creditCardType.creditCardTypeStrings.Visa
  */
  trait CreditCardTypeCardBrandNiceType extends StObject
  object CreditCardTypeCardBrandNiceType {
    
    inline def `American Express`: typings.creditCardType.creditCardTypeStrings.`American Express` = ("American Express").asInstanceOf[typings.creditCardType.creditCardTypeStrings.`American Express`]
    
    inline def `Diners Club`: typings.creditCardType.creditCardTypeStrings.`Diners Club` = ("Diners Club").asInstanceOf[typings.creditCardType.creditCardTypeStrings.`Diners Club`]
    
    inline def Discover: typings.creditCardType.creditCardTypeStrings.Discover = "Discover".asInstanceOf[typings.creditCardType.creditCardTypeStrings.Discover]
    
    inline def Elo: typings.creditCardType.creditCardTypeStrings.Elo = "Elo".asInstanceOf[typings.creditCardType.creditCardTypeStrings.Elo]
    
    inline def Hiper: typings.creditCardType.creditCardTypeStrings.Hiper = "Hiper".asInstanceOf[typings.creditCardType.creditCardTypeStrings.Hiper]
    
    inline def Hipercard: typings.creditCardType.creditCardTypeStrings.Hipercard = "Hipercard".asInstanceOf[typings.creditCardType.creditCardTypeStrings.Hipercard]
    
    inline def JCB: typings.creditCardType.creditCardTypeStrings.JCB = "JCB".asInstanceOf[typings.creditCardType.creditCardTypeStrings.JCB]
    
    inline def Maestro: typings.creditCardType.creditCardTypeStrings.Maestro = "Maestro".asInstanceOf[typings.creditCardType.creditCardTypeStrings.Maestro]
    
    inline def Mastercard: typings.creditCardType.creditCardTypeStrings.Mastercard = "Mastercard".asInstanceOf[typings.creditCardType.creditCardTypeStrings.Mastercard]
    
    inline def Mir: typings.creditCardType.creditCardTypeStrings.Mir = "Mir".asInstanceOf[typings.creditCardType.creditCardTypeStrings.Mir]
    
    inline def UnionPay: typings.creditCardType.creditCardTypeStrings.UnionPay = "UnionPay".asInstanceOf[typings.creditCardType.creditCardTypeStrings.UnionPay]
    
    inline def Visa: typings.creditCardType.creditCardTypeStrings.Visa = "Visa".asInstanceOf[typings.creditCardType.creditCardTypeStrings.Visa]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.creditCardType.creditCardTypeStrings.CVV
    - typings.creditCardType.creditCardTypeStrings.CVC
    - typings.creditCardType.creditCardTypeStrings.CID
    - typings.creditCardType.creditCardTypeStrings.CVN
    - typings.creditCardType.creditCardTypeStrings.CVE
    - typings.creditCardType.creditCardTypeStrings.CVP2
  */
  trait CreditCardTypeSecurityCodeLabel extends StObject
  object CreditCardTypeSecurityCodeLabel {
    
    inline def CID: typings.creditCardType.creditCardTypeStrings.CID = "CID".asInstanceOf[typings.creditCardType.creditCardTypeStrings.CID]
    
    inline def CVC: typings.creditCardType.creditCardTypeStrings.CVC = "CVC".asInstanceOf[typings.creditCardType.creditCardTypeStrings.CVC]
    
    inline def CVE: typings.creditCardType.creditCardTypeStrings.CVE = "CVE".asInstanceOf[typings.creditCardType.creditCardTypeStrings.CVE]
    
    inline def CVN: typings.creditCardType.creditCardTypeStrings.CVN = "CVN".asInstanceOf[typings.creditCardType.creditCardTypeStrings.CVN]
    
    inline def CVP2: typings.creditCardType.creditCardTypeStrings.CVP2 = "CVP2".asInstanceOf[typings.creditCardType.creditCardTypeStrings.CVP2]
    
    inline def CVV: typings.creditCardType.creditCardTypeStrings.CVV = "CVV".asInstanceOf[typings.creditCardType.creditCardTypeStrings.CVV]
  }
}
