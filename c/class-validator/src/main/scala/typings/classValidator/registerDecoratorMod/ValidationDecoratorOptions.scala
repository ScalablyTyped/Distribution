package typings.classValidator.registerDecoratorMod

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.classValidator.validatorConstraintInterfaceMod.ValidatorConstraintInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationDecoratorOptions extends js.Object {
  /**
    * Indicates if this decorator will perform async validation.
    */
  var async: js.UndefOr[Boolean] = js.native
  /**
    * Array of validation constraints.
    */
  var constraints: js.UndefOr[js.Array[_]] = js.native
  /**
    * Name of the validation that is being registered.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Validator options.
    */
  var options: js.UndefOr[ValidationOptions] = js.native
  /**
    * Target object's property name to be validated.
    */
  var propertyName: String = js.native
  /**
    * Target object to be validated.
    */
  var target: js.Function = js.native
  /**
    * Validator that performs validation.
    */
  var validator: ValidatorConstraintInterface | js.Function = js.native
}

object ValidationDecoratorOptions {
  @scala.inline
  def apply(propertyName: String, target: js.Function, validator: ValidatorConstraintInterface | js.Function): ValidationDecoratorOptions = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationDecoratorOptions]
  }
  @scala.inline
  implicit class ValidationDecoratorOptionsOps[Self <: ValidationDecoratorOptions] (val x: Self) extends AnyVal {
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
    def setTarget(value: js.Function): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidator(value: ValidatorConstraintInterface | js.Function): Self = this.set("validator", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setConstraintsVarargs(value: js.Any*): Self = this.set("constraints", js.Array(value :_*))
    @scala.inline
    def setConstraints(value: js.Array[_]): Self = this.set("constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptions(value: ValidationOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

