package typings.businessRulesEngine

import typings.businessRulesEngine.mod.IAsyncPropertyValidator
import typings.businessRulesEngine.mod.IPropertyValidator
import typings.businessRulesEngine.mod.IStringValidator
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeValidatorsMod {
  
  @JSImport("business-rules-engine/node-validators", "ContainsValidator")
  @js.native
  class ContainsValidator protected () extends IAsyncPropertyValidator {
    def this(Options: Promise[js.Array[_]]) = this()
    
    var Options: Promise[js.Array[_]] = js.native
    
    def isAcceptable(s: String): Promise[Boolean] = js.native
    
    @JSName("tagName")
    var tagName_ContainsValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "DateISOValidator")
  @js.native
  class DateISOValidator () extends IStringValidator {
    
    @JSName("tagName")
    var tagName_DateISOValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "DateValidator")
  @js.native
  class DateValidator () extends IStringValidator {
    
    @JSName("tagName")
    var tagName_DateValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "DigitValidator")
  @js.native
  class DigitValidator () extends IStringValidator {
    
    @JSName("tagName")
    var tagName_DigitValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "EmailValidator")
  @js.native
  class EmailValidator () extends IStringValidator {
    
    @JSName("tagName")
    var tagName_EmailValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "LettersOnlyValidator")
  @js.native
  class LettersOnlyValidator () extends IStringValidator {
    
    @JSName("tagName")
    var tagName_LettersOnlyValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "MaxLengthValidator")
  @js.native
  class MaxLengthValidator () extends IStringValidator {
    def this(MaxLength: Double) = this()
    
    var MaxLength: Double = js.native
    
    @JSName("tagName")
    var tagName_MaxLengthValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "MaxValidator")
  @js.native
  class MaxValidator () extends IPropertyValidator {
    def this(Max: Double) = this()
    
    var Max: Double = js.native
    
    @JSName("tagName")
    var tagName_MaxValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "MinLengthValidator")
  @js.native
  class MinLengthValidator () extends IStringValidator {
    def this(MinLength: Double) = this()
    
    var MinLength: Double = js.native
    
    @JSName("tagName")
    var tagName_MinLengthValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "MinValidator")
  @js.native
  class MinValidator () extends IPropertyValidator {
    def this(Min: Double) = this()
    
    var Min: Double = js.native
    
    @JSName("tagName")
    var tagName_MinValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "NumberValidator")
  @js.native
  class NumberValidator () extends IStringValidator {
    
    @JSName("tagName")
    var tagName_NumberValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "PatternValidator")
  @js.native
  class PatternValidator () extends IStringValidator {
    def this(Pattern: String) = this()
    
    var Pattern: String = js.native
    
    @JSName("tagName")
    var tagName_PatternValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "RangeLengthValidator")
  @js.native
  class RangeLengthValidator () extends IStringValidator {
    def this(RangeLength: js.Array[Double]) = this()
    
    var MaxLength: Double = js.native
    
    var MinLength: Double = js.native
    
    var RangeLength: js.Array[Double] = js.native
    
    @JSName("tagName")
    var tagName_RangeLengthValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "RangeValidator")
  @js.native
  class RangeValidator () extends IPropertyValidator {
    def this(Range: js.Array[Double]) = this()
    
    var Max: Double = js.native
    
    var Min: Double = js.native
    
    var Range: js.Array[Double] = js.native
    
    @JSName("tagName")
    var tagName_RangeValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "RequiredValidator")
  @js.native
  class RequiredValidator () extends IStringValidator {
    
    @JSName("tagName")
    var tagName_RequiredValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "SignedDigitValidator")
  @js.native
  class SignedDigitValidator () extends IStringValidator {
    
    @JSName("tagName")
    var tagName_SignedDigitValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "StepValidator")
  @js.native
  class StepValidator () extends IPropertyValidator {
    def this(Step: String) = this()
    
    var Step: String = js.native
    
    @JSName("tagName")
    var tagName_StepValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "UrlValidator")
  @js.native
  class UrlValidator () extends IStringValidator {
    
    @JSName("tagName")
    var tagName_UrlValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "ZipCodeValidator")
  @js.native
  class ZipCodeValidator () extends IStringValidator {
    
    @JSName("tagName")
    var tagName_ZipCodeValidator: String = js.native
  }
}
