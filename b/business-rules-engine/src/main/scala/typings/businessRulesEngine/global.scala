package typings.businessRulesEngine

import typings.businessRulesEngine.anon.Contains
import typings.businessRulesEngine.mod.IError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Utils {
    
    @JSGlobal("Utils.NumberFce")
    @js.native
    open class NumberFce ()
      extends StObject
         with typings.businessRulesEngine.Utils.NumberFce
    object NumberFce {
      
      @JSGlobal("Utils.NumberFce")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def GetNegDigits(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetNegDigits")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    }
    
    @JSGlobal("Utils.StringFce")
    @js.native
    open class StringFce ()
      extends StObject
         with typings.businessRulesEngine.Utils.StringFce
    object StringFce {
      
      @JSGlobal("Utils.StringFce")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def format(s: String, args: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(s.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
    }
  }
  
  object Validation {
    
    @JSGlobal("Validation.AbstractValidator")
    @js.native
    open class AbstractValidator[T] ()
      extends typings.businessRulesEngine.mod.AbstractValidator[T]
    
    @JSGlobal("Validation.CompareOperator")
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
    
    @JSGlobal("Validation.CompositeValidationResult")
    @js.native
    open class CompositeValidationResult protected ()
      extends typings.businessRulesEngine.mod.CompositeValidationResult {
      def this(Name: String) = this()
    }
    
    @JSGlobal("Validation.Error")
    @js.native
    open class Error ()
      extends typings.businessRulesEngine.mod.Error
    
    @JSGlobal("Validation.MessageLocalization")
    @js.native
    open class MessageLocalization ()
      extends typings.businessRulesEngine.mod.MessageLocalization
    /* static members */
    object MessageLocalization {
      
      @JSGlobal("Validation.MessageLocalization")
      @js.native
      val ^ : js.Any = js.native
      
      inline def GetValidationMessage(validator: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetValidationMessage")(validator.asInstanceOf[js.Any]).asInstanceOf[String]
      
      @JSGlobal("Validation.MessageLocalization.ValidationMessages")
      @js.native
      def ValidationMessages: Contains = js.native
      inline def ValidationMessages_=(x: Contains): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ValidationMessages")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Validation.MessageLocalization.customMsg")
      @js.native
      def customMsg: String = js.native
      inline def customMsg_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customMsg")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Validation.MessageLocalization.defaultMessages")
      @js.native
      def defaultMessages: Contains = js.native
      inline def defaultMessages_=(x: Contains): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMessages")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Validation.ValidationFailure")
    @js.native
    open class ValidationFailure protected ()
      extends typings.businessRulesEngine.mod.ValidationFailure {
      def this(Error: IError, IsAsync: Boolean) = this()
    }
    
    @JSGlobal("Validation.ValidationResult")
    @js.native
    open class ValidationResult protected ()
      extends typings.businessRulesEngine.mod.ValidationResult {
      def this(Name: String) = this()
    }
  }
}
