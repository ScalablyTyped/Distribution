package typings.businessRulesEngine

import typings.businessRulesEngine.anon.Contains
import typings.businessRulesEngine.mod.IError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeValidationMod {
  
  @JSImport("node-validation", "AbstractValidator")
  @js.native
  class AbstractValidator[T] ()
    extends typings.businessRulesEngine.mod.AbstractValidator[T]
  
  @JSImport("node-validation", "CompareOperator")
  @js.native
  object CompareOperator extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.businessRulesEngine.mod.CompareOperator & Double] = js.native
    
    /* 2 */ val Equal: typings.businessRulesEngine.mod.CompareOperator.Equal & Double = js.native
    
    /* 5 */ val GreaterThan: typings.businessRulesEngine.mod.CompareOperator.GreaterThan & Double = js.native
    
    /* 4 */ val GreaterThanEqual: typings.businessRulesEngine.mod.CompareOperator.GreaterThanEqual & Double = js.native
    
    /* 0 */ val LessThan: typings.businessRulesEngine.mod.CompareOperator.LessThan & Double = js.native
    
    /* 1 */ val LessThanEqual: typings.businessRulesEngine.mod.CompareOperator.LessThanEqual & Double = js.native
    
    /* 3 */ val NotEqual: typings.businessRulesEngine.mod.CompareOperator.NotEqual & Double = js.native
  }
  
  @JSImport("node-validation", "CompositeValidationResult")
  @js.native
  class CompositeValidationResult protected ()
    extends typings.businessRulesEngine.mod.CompositeValidationResult {
    def this(Name: String) = this()
  }
  
  @JSImport("node-validation", "Error")
  @js.native
  class Error ()
    extends typings.businessRulesEngine.mod.Error
  
  @JSImport("node-validation", "MessageLocalization")
  @js.native
  class MessageLocalization ()
    extends typings.businessRulesEngine.mod.MessageLocalization
  /* static members */
  object MessageLocalization {
    
    @JSImport("node-validation", "MessageLocalization")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def GetValidationMessage(validator: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetValidationMessage")(validator.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("node-validation", "MessageLocalization.ValidationMessages")
    @js.native
    def ValidationMessages: Contains = js.native
    @scala.inline
    def ValidationMessages_=(x: Contains): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ValidationMessages")(x.asInstanceOf[js.Any])
    
    @JSImport("node-validation", "MessageLocalization.customMsg")
    @js.native
    def customMsg: String = js.native
    @scala.inline
    def customMsg_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customMsg")(x.asInstanceOf[js.Any])
    
    @JSImport("node-validation", "MessageLocalization.defaultMessages")
    @js.native
    def defaultMessages: Contains = js.native
    @scala.inline
    def defaultMessages_=(x: Contains): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMessages")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("node-validation", "ValidationFailure")
  @js.native
  class ValidationFailure protected ()
    extends typings.businessRulesEngine.mod.ValidationFailure {
    def this(Error: IError, IsAsync: Boolean) = this()
  }
  
  @JSImport("node-validation", "ValidationResult")
  @js.native
  class ValidationResult protected ()
    extends typings.businessRulesEngine.mod.ValidationResult {
    def this(Name: String) = this()
  }
}
