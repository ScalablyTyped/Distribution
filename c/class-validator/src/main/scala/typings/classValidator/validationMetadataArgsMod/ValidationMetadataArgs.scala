package typings.classValidator.validationMetadataArgsMod

import typings.classValidator.validationOptionsMod.ValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationMetadataArgs extends js.Object {
  
  /**
    * Constraint class that performs validation. Used only for custom validations.
    */
  var constraintCls: js.UndefOr[js.Function] = js.native
  
  /**
    * Array of constraints of this validation.
    */
  var constraints: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Property of the object to be validated.
    */
  var propertyName: String = js.native
  
  /**
    * Object that is used to be validated.
    */
  var target: js.Function | String = js.native
  
  /**
    * Validation type.
    */
  var `type`: String = js.native
  
  /**
    * Validation options.
    */
  var validationOptions: js.UndefOr[ValidationOptions] = js.native
  
  /**
    * Extra options specific to validation type.
    */
  var validationTypeOptions: js.UndefOr[js.Any] = js.native
}
object ValidationMetadataArgs {
  
  @scala.inline
  def apply(propertyName: String, target: js.Function | String, `type`: String): ValidationMetadataArgs = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMetadataArgs]
  }
  
  @scala.inline
  implicit class ValidationMetadataArgsOps[Self <: ValidationMetadataArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Function | String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintCls(value: js.Function): Self = this.set("constraintCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraintCls: Self = this.set("constraintCls", js.undefined)
    
    @scala.inline
    def setConstraintsVarargs(value: js.Any*): Self = this.set("constraints", js.Array(value :_*))
    
    @scala.inline
    def setConstraints(value: js.Array[_]): Self = this.set("constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    
    @scala.inline
    def setValidationOptions(value: ValidationOptions): Self = this.set("validationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationOptions: Self = this.set("validationOptions", js.undefined)
    
    @scala.inline
    def setValidationTypeOptions(value: js.Any): Self = this.set("validationTypeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationTypeOptions: Self = this.set("validationTypeOptions", js.undefined)
  }
}
