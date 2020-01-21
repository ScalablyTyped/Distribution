package typings.businessRulesEngine

import typings.businessRulesEngine.mod.IAsyncPropertyValidator
import typings.businessRulesEngine.mod.IPropertyValidator
import typings.businessRulesEngine.mod.IStringValidator
import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine/node-validators", JSImport.Namespace)
@js.native
object nodeValidatorsMod extends js.Object {
  @js.native
  class ContainsValidator protected () extends IAsyncPropertyValidator {
    def this(Options: Promise[js.Array[_]]) = this()
    var Options: Promise[js.Array[_]] = js.native
    /* CompleteClass */
    override var isAsync: Boolean = js.native
    @JSName("tagName")
    var tagName_ContainsValidator: String = js.native
    def isAcceptable(s: String): Promise[Boolean] = js.native
    /* CompleteClass */
    override def isAcceptable(s: js.Any): Promise[Boolean] = js.native
  }
  
  @js.native
  class DateISOValidator () extends IStringValidator {
    @JSName("tagName")
    var tagName_DateISOValidator: String = js.native
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: js.Any): Boolean = js.native
  }
  
  @js.native
  class DateValidator () extends IStringValidator {
    @JSName("tagName")
    var tagName_DateValidator: String = js.native
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: js.Any): Boolean = js.native
  }
  
  @js.native
  class DigitValidator () extends IStringValidator {
    @JSName("tagName")
    var tagName_DigitValidator: String = js.native
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: js.Any): Boolean = js.native
  }
  
  @js.native
  class EmailValidator () extends IStringValidator {
    @JSName("tagName")
    var tagName_EmailValidator: String = js.native
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: js.Any): Boolean = js.native
  }
  
  @js.native
  class LettersOnlyValidator () extends IStringValidator {
    @JSName("tagName")
    var tagName_LettersOnlyValidator: String = js.native
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: js.Any): Boolean = js.native
  }
  
  @js.native
  class MaxLengthValidator () extends IStringValidator {
    def this(MaxLength: Double) = this()
    var MaxLength: Double = js.native
    @JSName("tagName")
    var tagName_MaxLengthValidator: String = js.native
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: js.Any): Boolean = js.native
  }
  
  @js.native
  class MaxValidator () extends IPropertyValidator {
    def this(Max: Double) = this()
    var Max: Double = js.native
    @JSName("tagName")
    var tagName_MaxValidator: String = js.native
    /* CompleteClass */
    override def isAcceptable(s: js.Any): Boolean = js.native
  }
  
  @js.native
  class MinLengthValidator () extends IStringValidator {
    def this(MinLength: Double) = this()
    var MinLength: Double = js.native
    @JSName("tagName")
    var tagName_MinLengthValidator: String = js.native
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: js.Any): Boolean = js.native
  }
  
  @js.native
  class MinValidator () extends IPropertyValidator {
    def this(Min: Double) = this()
    var Min: Double = js.native
    @JSName("tagName")
    var tagName_MinValidator: String = js.native
    /* CompleteClass */
    override def isAcceptable(s: js.Any): Boolean = js.native
  }
  
  @js.native
  class NumberValidator () extends IStringValidator {
    @JSName("tagName")
    var tagName_NumberValidator: String = js.native
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: js.Any): Boolean = js.native
  }
  
  @js.native
  class PatternValidator () extends IStringValidator {
    def this(Pattern: String) = this()
    var Pattern: String = js.native
    @JSName("tagName")
    var tagName_PatternValidator: String = js.native
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: js.Any): Boolean = js.native
  }
  
  @js.native
  class RangeLengthValidator () extends IStringValidator {
    def this(RangeLength: js.Array[Double]) = this()
    var MaxLength: Double = js.native
    var MinLength: Double = js.native
    var RangeLength: js.Array[Double] = js.native
    @JSName("tagName")
    var tagName_RangeLengthValidator: String = js.native
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: js.Any): Boolean = js.native
  }
  
  @js.native
  class RangeValidator () extends IPropertyValidator {
    def this(Range: js.Array[Double]) = this()
    var Max: Double = js.native
    var Min: Double = js.native
    var Range: js.Array[Double] = js.native
    @JSName("tagName")
    var tagName_RangeValidator: String = js.native
    /* CompleteClass */
    override def isAcceptable(s: js.Any): Boolean = js.native
  }
  
  @js.native
  class RequiredValidator () extends IStringValidator {
    @JSName("tagName")
    var tagName_RequiredValidator: String = js.native
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: js.Any): Boolean = js.native
  }
  
  @js.native
  class SignedDigitValidator () extends IStringValidator {
    @JSName("tagName")
    var tagName_SignedDigitValidator: String = js.native
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: js.Any): Boolean = js.native
  }
  
  @js.native
  class StepValidator () extends IPropertyValidator {
    def this(Step: String) = this()
    var Step: String = js.native
    @JSName("tagName")
    var tagName_StepValidator: String = js.native
    /* CompleteClass */
    override def isAcceptable(s: js.Any): Boolean = js.native
  }
  
  @js.native
  class UrlValidator () extends IStringValidator {
    @JSName("tagName")
    var tagName_UrlValidator: String = js.native
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: js.Any): Boolean = js.native
  }
  
  @js.native
  class ZipCodeValidator () extends IStringValidator {
    @JSName("tagName")
    var tagName_ZipCodeValidator: String = js.native
    /* CompleteClass */
    override def isAcceptable(s: String): Boolean = js.native
    /* CompleteClass */
    override def isAcceptable(s: js.Any): Boolean = js.native
  }
  
}

