package typings.businessRulesEngine

import typings.businessRulesEngine.mod.IAsyncPropertyValidator
import typings.businessRulesEngine.mod.IPropertyValidator
import typings.businessRulesEngine.mod.IStringValidator
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeValidatorsMod {
  
  @JSImport("business-rules-engine/node-validators", "ContainsValidator")
  @js.native
  open class ContainsValidator protected ()
    extends StObject
       with IAsyncPropertyValidator {
    def this(Options: Promise[js.Array[Any]]) = this()
    
    var Options: Promise[js.Array[Any]] = js.native
    
    def isAcceptable(s: String): Promise[Boolean] = js.native
    /* CompleteClass */
    override def isAcceptable(s: Any): Promise[Boolean] = js.native
    
    /* CompleteClass */
    var isAsync: Boolean = js.native
    
    @JSName("tagName")
    var tagName_ContainsValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "DateISOValidator")
  @js.native
  open class DateISOValidator ()
    extends StObject
       with IStringValidator {
    
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: Any): Boolean = js.native
    
    @JSName("tagName")
    var tagName_DateISOValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "DateValidator")
  @js.native
  open class DateValidator ()
    extends StObject
       with IStringValidator {
    
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: Any): Boolean = js.native
    
    @JSName("tagName")
    var tagName_DateValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "DigitValidator")
  @js.native
  open class DigitValidator ()
    extends StObject
       with IStringValidator {
    
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: Any): Boolean = js.native
    
    @JSName("tagName")
    var tagName_DigitValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "EmailValidator")
  @js.native
  open class EmailValidator ()
    extends StObject
       with IStringValidator {
    
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: Any): Boolean = js.native
    
    @JSName("tagName")
    var tagName_EmailValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "LettersOnlyValidator")
  @js.native
  open class LettersOnlyValidator ()
    extends StObject
       with IStringValidator {
    
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: Any): Boolean = js.native
    
    @JSName("tagName")
    var tagName_LettersOnlyValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "MaxLengthValidator")
  @js.native
  open class MaxLengthValidator ()
    extends StObject
       with IStringValidator {
    def this(MaxLength: Double) = this()
    
    var MaxLength: Double = js.native
    
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: Any): Boolean = js.native
    
    @JSName("tagName")
    var tagName_MaxLengthValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "MaxValidator")
  @js.native
  open class MaxValidator ()
    extends StObject
       with IPropertyValidator {
    def this(Max: Double) = this()
    
    var Max: Double = js.native
    
    /* CompleteClass */
    override def isAcceptable(s: Any): Boolean = js.native
    
    @JSName("tagName")
    var tagName_MaxValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "MinLengthValidator")
  @js.native
  open class MinLengthValidator ()
    extends StObject
       with IStringValidator {
    def this(MinLength: Double) = this()
    
    var MinLength: Double = js.native
    
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: Any): Boolean = js.native
    
    @JSName("tagName")
    var tagName_MinLengthValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "MinValidator")
  @js.native
  open class MinValidator ()
    extends StObject
       with IPropertyValidator {
    def this(Min: Double) = this()
    
    var Min: Double = js.native
    
    /* CompleteClass */
    override def isAcceptable(s: Any): Boolean = js.native
    
    @JSName("tagName")
    var tagName_MinValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "NumberValidator")
  @js.native
  open class NumberValidator ()
    extends StObject
       with IStringValidator {
    
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: Any): Boolean = js.native
    
    @JSName("tagName")
    var tagName_NumberValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "PatternValidator")
  @js.native
  open class PatternValidator ()
    extends StObject
       with IStringValidator {
    def this(Pattern: String) = this()
    
    var Pattern: String = js.native
    
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: Any): Boolean = js.native
    
    @JSName("tagName")
    var tagName_PatternValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "RangeLengthValidator")
  @js.native
  open class RangeLengthValidator ()
    extends StObject
       with IStringValidator {
    def this(RangeLength: js.Array[Double]) = this()
    
    var MaxLength: Double = js.native
    
    var MinLength: Double = js.native
    
    var RangeLength: js.Array[Double] = js.native
    
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: Any): Boolean = js.native
    
    @JSName("tagName")
    var tagName_RangeLengthValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "RangeValidator")
  @js.native
  open class RangeValidator ()
    extends StObject
       with IPropertyValidator {
    def this(Range: js.Array[Double]) = this()
    
    var Max: Double = js.native
    
    var Min: Double = js.native
    
    var Range: js.Array[Double] = js.native
    
    /* CompleteClass */
    override def isAcceptable(s: Any): Boolean = js.native
    
    @JSName("tagName")
    var tagName_RangeValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "RequiredValidator")
  @js.native
  open class RequiredValidator ()
    extends StObject
       with IStringValidator {
    
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: Any): Boolean = js.native
    
    @JSName("tagName")
    var tagName_RequiredValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "SignedDigitValidator")
  @js.native
  open class SignedDigitValidator ()
    extends StObject
       with IStringValidator {
    
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: Any): Boolean = js.native
    
    @JSName("tagName")
    var tagName_SignedDigitValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "StepValidator")
  @js.native
  open class StepValidator ()
    extends StObject
       with IPropertyValidator {
    def this(Step: String) = this()
    
    var Step: String = js.native
    
    /* CompleteClass */
    override def isAcceptable(s: Any): Boolean = js.native
    
    @JSName("tagName")
    var tagName_StepValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "UrlValidator")
  @js.native
  open class UrlValidator ()
    extends StObject
       with IStringValidator {
    
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: Any): Boolean = js.native
    
    @JSName("tagName")
    var tagName_UrlValidator: String = js.native
  }
  
  @JSImport("business-rules-engine/node-validators", "ZipCodeValidator")
  @js.native
  open class ZipCodeValidator ()
    extends StObject
       with IStringValidator {
    
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: Any): Boolean = js.native
    
    @JSName("tagName")
    var tagName_ZipCodeValidator: String = js.native
  }
}
