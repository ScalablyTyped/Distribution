package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.classValidator.typesValidationValidatorConstraintInterfaceMod.ValidatorConstraintInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRegisterDecoratorMod {
  
  @JSImport("class-validator/types/register-decorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerDecorator(options: ValidationDecoratorOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDecorator")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ValidationDecoratorOptions extends StObject {
    
    /**
      * Indicates if this decorator will perform async validation.
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Array of validation constraints.
      */
    var constraints: js.UndefOr[js.Array[Any]] = js.undefined
    
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
    
    inline def apply(propertyName: String, target: js.Function, validator: ValidatorConstraintInterface | js.Function): ValidationDecoratorOptions = {
      val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationDecoratorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidationDecoratorOptions] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setConstraints(value: js.Array[Any]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      inline def setConstraintsVarargs(value: Any*): Self = StObject.set(x, "constraints", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptions(value: ValidationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: js.Function): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setValidator(value: ValidatorConstraintInterface | js.Function): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
  }
}
