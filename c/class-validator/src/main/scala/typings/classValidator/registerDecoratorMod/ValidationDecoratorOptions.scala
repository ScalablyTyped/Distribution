package typings.classValidator.registerDecoratorMod

import typings.classValidator.validatorConstraintInterfaceMod.ValidatorConstraintInterface
import typings.classValidator.validatorOptionsMod.ValidatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationDecoratorOptions extends js.Object {
  /**
    * Indicates if this decorator will perform async validation.
    */
  var async: js.UndefOr[Boolean] = js.undefined
  /**
    * Array of validation constraints.
    */
  var constraints: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Name of the validation that is being registered.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Validator options.
    */
  var options: js.UndefOr[ValidatorOptions] = js.undefined
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
  def apply(
    propertyName: String,
    target: js.Function,
    validator: ValidatorConstraintInterface | js.Function,
    async: js.UndefOr[Boolean] = js.undefined,
    constraints: js.Array[_] = null,
    name: String = null,
    options: ValidatorOptions = null
  ): ValidationDecoratorOptions = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationDecoratorOptions]
  }
}

