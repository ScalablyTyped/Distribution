package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationMetadataArgsMod {
  
  trait ValidationMetadataArgs extends StObject {
    
    /**
      * Constraint class that performs validation. Used only for custom validations.
      */
    var constraintCls: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Array of constraints of this validation.
      */
    var constraints: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * Property of the object to be validated.
      */
    var propertyName: String
    
    /**
      * Object that is used to be validated.
      */
    var target: js.Function | String
    
    /**
      * Validation type.
      */
    var `type`: String
    
    /**
      * Validation options.
      */
    var validationOptions: js.UndefOr[ValidationOptions] = js.undefined
    
    /**
      * Extra options specific to validation type.
      */
    var validationTypeOptions: js.UndefOr[Any] = js.undefined
  }
  object ValidationMetadataArgs {
    
    inline def apply(propertyName: String, target: js.Function | String, `type`: String): ValidationMetadataArgs = {
      val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationMetadataArgs]
    }
    
    extension [Self <: ValidationMetadataArgs](x: Self) {
      
      inline def setConstraintCls(value: js.Function): Self = StObject.set(x, "constraintCls", value.asInstanceOf[js.Any])
      
      inline def setConstraintClsUndefined: Self = StObject.set(x, "constraintCls", js.undefined)
      
      inline def setConstraints(value: js.Array[Any]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      inline def setConstraintsVarargs(value: Any*): Self = StObject.set(x, "constraints", js.Array(value*))
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValidationOptions(value: ValidationOptions): Self = StObject.set(x, "validationOptions", value.asInstanceOf[js.Any])
      
      inline def setValidationOptionsUndefined: Self = StObject.set(x, "validationOptions", js.undefined)
      
      inline def setValidationTypeOptions(value: Any): Self = StObject.set(x, "validationTypeOptions", value.asInstanceOf[js.Any])
      
      inline def setValidationTypeOptionsUndefined: Self = StObject.set(x, "validationTypeOptions", js.undefined)
    }
  }
}
