package typings.classDashValidator.metadataValidationMetadataArgsMod

import typings.classDashValidator.decoratorValidationOptionsMod.ValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationMetadataArgs extends js.Object {
  /**
    * Constraint class that performs validation. Used only for custom validations.
    */
  var constraintCls: js.UndefOr[js.Function] = js.undefined
  /**
    * Array of constraints of this validation.
    */
  var constraints: js.UndefOr[js.Array[_]] = js.undefined
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
  def apply(
    propertyName: String,
    target: js.Function | String,
    `type`: String,
    constraintCls: js.Function = null,
    constraints: js.Array[_] = null,
    validationOptions: ValidationOptions = null,
    validationTypeOptions: js.Any = null
  ): ValidationMetadataArgs = {
    val __obj = js.Dynamic.literal(propertyName = propertyName, target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (constraintCls != null) __obj.updateDynamic("constraintCls")(constraintCls)
    if (constraints != null) __obj.updateDynamic("constraints")(constraints)
    if (validationOptions != null) __obj.updateDynamic("validationOptions")(validationOptions)
    if (validationTypeOptions != null) __obj.updateDynamic("validationTypeOptions")(validationTypeOptions)
    __obj.asInstanceOf[ValidationMetadataArgs]
  }
}

