package typings.awsSdk.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamValidation extends js.Object {
  /**
    * Validates that a string value matches one of the allowable enum values.
    */
  var enum: js.UndefOr[Boolean] = js.native
  /**
    * Validates that a value meets the max constraint.
    */
  var max: js.UndefOr[Boolean] = js.native
  /**
    * Validates that a value meets the min constraint.
    * This is enabled by default when paramValidation is set to true.
    */
  var min: js.UndefOr[Boolean] = js.native
  /**
    * Validates that a string value matches a regular expression.
    */
  var pattern: js.UndefOr[Boolean] = js.native
}

object ParamValidation {
  @scala.inline
  def apply(
    enum: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Boolean] = js.undefined,
    min: js.UndefOr[Boolean] = js.undefined,
    pattern: js.UndefOr[Boolean] = js.undefined
  ): ParamValidation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enum)) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(pattern)) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamValidation]
  }
}

