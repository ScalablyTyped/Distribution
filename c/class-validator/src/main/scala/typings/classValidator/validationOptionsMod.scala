package typings.classValidator

import typings.classValidator.validationArgumentsMod.ValidationArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationOptionsMod {
  
  @JSImport("class-validator/types/decorator/ValidationOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isValidationOptions(`val`: js.Any): /* is class-validator.class-validator/types/decorator/ValidationOptions.ValidationOptions */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidationOptions")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is class-validator.class-validator/types/decorator/ValidationOptions.ValidationOptions */ Boolean]
  
  trait ValidationOptions extends StObject {
    
    /**
      * Indicates if validation must be performed always, no matter of validation groups used.
      */
    var always: js.UndefOr[Boolean] = js.undefined
    
    var context: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Specifies if validated value is an array and each of its items must be validated.
      */
    var each: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Validation groups used for this validation.
      */
    var groups: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Error message to be used on validation fail.
      * Message can be either string or a function that returns a string.
      */
    var message: js.UndefOr[String | (js.Function1[/* validationArguments */ ValidationArguments, String])] = js.undefined
  }
  object ValidationOptions {
    
    @scala.inline
    def apply(): ValidationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationOptions]
    }
    
    @scala.inline
    implicit class ValidationOptionsMutableBuilder[Self <: ValidationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlways(value: Boolean): Self = StObject.set(x, "always", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setEach(value: Boolean): Self = StObject.set(x, "each", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
      
      @scala.inline
      def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      @scala.inline
      def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: String | (js.Function1[/* validationArguments */ ValidationArguments, String])): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageFunction1(value: /* validationArguments */ ValidationArguments => String): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
