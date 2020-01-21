package typings.classValidator.validatorOptionsMod

import typings.classValidator.AnonTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorOptions extends js.Object {
  /**
    * If set to true, the validation will not use default messages.
    * Error message always will be undefined if its not explicitly set.
    */
  var dismissDefaultMessages: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, instead of stripping non-whitelisted properties validator will throw an error
    */
  var forbidNonWhitelisted: js.UndefOr[Boolean] = js.undefined
  /**
    * Settings true will cause fail validation of unknown objects.
    */
  var forbidUnknownValues: js.UndefOr[Boolean] = js.undefined
  /**
    * Groups to be used during validation of the object.
    */
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If set to true then validator will skip validation of all properties that are null or undefined in the validating object.
    */
  var skipMissingProperties: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true then validator will skip validation of all properties that are null in the validating object.
    */
  var skipNullProperties: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true then validator will skip validation of all properties that are undefined in the validating object.
    */
  var skipUndefinedProperties: js.UndefOr[Boolean] = js.undefined
  /**
    * ValidationError special options.
    */
  var validationError: js.UndefOr[AnonTarget] = js.undefined
  /**
    * If set to true validator will strip validated object of any properties that do not have any decorators.
    *
    * Tip: if no other decorator is suitable for your property use @Allow decorator.
    */
  var whitelist: js.UndefOr[Boolean] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    dismissDefaultMessages: js.UndefOr[Boolean] = js.undefined,
    forbidNonWhitelisted: js.UndefOr[Boolean] = js.undefined,
    forbidUnknownValues: js.UndefOr[Boolean] = js.undefined,
    groups: js.Array[String] = null,
    skipMissingProperties: js.UndefOr[Boolean] = js.undefined,
    skipNullProperties: js.UndefOr[Boolean] = js.undefined,
    skipUndefinedProperties: js.UndefOr[Boolean] = js.undefined,
    validationError: AnonTarget = null,
    whitelist: js.UndefOr[Boolean] = js.undefined
  ): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dismissDefaultMessages)) __obj.updateDynamic("dismissDefaultMessages")(dismissDefaultMessages.asInstanceOf[js.Any])
    if (!js.isUndefined(forbidNonWhitelisted)) __obj.updateDynamic("forbidNonWhitelisted")(forbidNonWhitelisted.asInstanceOf[js.Any])
    if (!js.isUndefined(forbidUnknownValues)) __obj.updateDynamic("forbidUnknownValues")(forbidUnknownValues.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(skipMissingProperties)) __obj.updateDynamic("skipMissingProperties")(skipMissingProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(skipNullProperties)) __obj.updateDynamic("skipNullProperties")(skipNullProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(skipUndefinedProperties)) __obj.updateDynamic("skipUndefinedProperties")(skipUndefinedProperties.asInstanceOf[js.Any])
    if (validationError != null) __obj.updateDynamic("validationError")(validationError.asInstanceOf[js.Any])
    if (!js.isUndefined(whitelist)) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorOptions]
  }
}

