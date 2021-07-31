package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.classValidator.validatorConstraintInterfaceMod.ValidatorConstraintInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerDecoratorMod {
  
  @JSImport("class-validator/types/register-decorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def registerDecorator(options: ValidationDecoratorOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDecorator")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ValidationDecoratorOptions extends StObject {
    
    /**
      * Indicates if this decorator will perform async validation.
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Array of validation constraints.
      */
    var constraints: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * Name of the validation that is being registered.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Validator options.
      */
    var options: js.UndefOr[ValidationOptions] = js.undefined
    
    /**
      * Target object's property name to be validated.
      */
    var propertyName: String
    
    /**
      * Target object to be validated.
      */
    var target: js.Function
    
    /**
      * Validator that performs validation.
      */
    var validator: ValidatorConstraintInterface | js.Function
  }
  object ValidationDecoratorOptions {
    
    @scala.inline
    def apply(propertyName: String, target: js.Function, validator: ValidatorConstraintInterface | js.Function): ValidationDecoratorOptions = {
      val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationDecoratorOptions]
    }
    
    @scala.inline
    implicit class ValidationDecoratorOptionsMutableBuilder[Self <: ValidationDecoratorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setConstraints(value: js.Array[js.Any]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      @scala.inline
      def setConstraintsVarargs(value: js.Any*): Self = StObject.set(x, "constraints", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptions(value: ValidationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: js.Function): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidator(value: ValidatorConstraintInterface | js.Function): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
  }
}
