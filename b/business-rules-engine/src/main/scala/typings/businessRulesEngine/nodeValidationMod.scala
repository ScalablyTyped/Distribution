package typings.businessRulesEngine

import typings.businessRulesEngine.mod.IError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-validation", JSImport.Namespace)
@js.native
object nodeValidationMod extends js.Object {
  @js.native
  class AbstractValidator[T] ()
    extends typings.businessRulesEngine.mod.AbstractValidator[T]
  
  @js.native
  class CompositeValidationResult protected ()
    extends typings.businessRulesEngine.mod.CompositeValidationResult {
    def this(Name: String) = this()
  }
  
  @js.native
  class Error ()
    extends typings.businessRulesEngine.mod.Error
  
  @js.native
  class MessageLocalization ()
    extends typings.businessRulesEngine.mod.MessageLocalization
  
  @js.native
  class ValidationFailure protected ()
    extends typings.businessRulesEngine.mod.ValidationFailure {
    def this(Error: IError, IsAsync: Boolean) = this()
  }
  
  @js.native
  class ValidationResult protected ()
    extends typings.businessRulesEngine.mod.ValidationResult {
    def this(Name: String) = this()
  }
  
  @js.native
  object CompareOperator extends js.Object {
    /* 2 */ val Equal: typings.businessRulesEngine.mod.CompareOperator.Equal with Double = js.native
    /* 5 */ val GreaterThan: typings.businessRulesEngine.mod.CompareOperator.GreaterThan with Double = js.native
    /* 4 */ val GreaterThanEqual: typings.businessRulesEngine.mod.CompareOperator.GreaterThanEqual with Double = js.native
    /* 0 */ val LessThan: typings.businessRulesEngine.mod.CompareOperator.LessThan with Double = js.native
    /* 1 */ val LessThanEqual: typings.businessRulesEngine.mod.CompareOperator.LessThanEqual with Double = js.native
    /* 3 */ val NotEqual: typings.businessRulesEngine.mod.CompareOperator.NotEqual with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.businessRulesEngine.mod.CompareOperator with Double] = js.native
  }
  
  /* static members */
  @js.native
  object MessageLocalization extends js.Object {
    var ValidationMessages: AnonContains = js.native
    var customMsg: String = js.native
    var defaultMessages: AnonContains = js.native
    def GetValidationMessage(validator: js.Any): String = js.native
  }
  
}

