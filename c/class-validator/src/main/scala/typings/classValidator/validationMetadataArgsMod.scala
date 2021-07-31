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
    var constraints: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
    var validationTypeOptions: js.UndefOr[js.Any] = js.undefined
  }
  object ValidationMetadataArgs {
    
    @scala.inline
    def apply(propertyName: String, target: js.Function | String, `type`: String): ValidationMetadataArgs = {
      val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationMetadataArgs]
    }
    
    @scala.inline
    implicit class ValidationMetadataArgsMutableBuilder[Self <: ValidationMetadataArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstraintCls(value: js.Function): Self = StObject.set(x, "constraintCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintClsUndefined: Self = StObject.set(x, "constraintCls", js.undefined)
      
      @scala.inline
      def setConstraints(value: js.Array[js.Any]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      @scala.inline
      def setConstraintsVarargs(value: js.Any*): Self = StObject.set(x, "constraints", js.Array(value :_*))
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationOptions(value: ValidationOptions): Self = StObject.set(x, "validationOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationOptionsUndefined: Self = StObject.set(x, "validationOptions", js.undefined)
      
      @scala.inline
      def setValidationTypeOptions(value: js.Any): Self = StObject.set(x, "validationTypeOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationTypeOptionsUndefined: Self = StObject.set(x, "validationTypeOptions", js.undefined)
    }
  }
}
