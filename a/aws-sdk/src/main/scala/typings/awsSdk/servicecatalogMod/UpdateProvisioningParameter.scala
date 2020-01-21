package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProvisioningParameter extends js.Object {
  /**
    * The parameter key.
    */
  var Key: js.UndefOr[ParameterKey] = js.native
  /**
    * If set to true, Value is ignored and the previous parameter value is kept.
    */
  var UsePreviousValue: js.UndefOr[typings.awsSdk.servicecatalogMod.UsePreviousValue] = js.native
  /**
    * The parameter value.
    */
  var Value: js.UndefOr[ParameterValue] = js.native
}

object UpdateProvisioningParameter {
  @scala.inline
  def apply(
    Key: ParameterKey = null,
    UsePreviousValue: js.UndefOr[Boolean] = js.undefined,
    Value: ParameterValue = null
  ): UpdateProvisioningParameter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (!js.isUndefined(UsePreviousValue)) __obj.updateDynamic("UsePreviousValue")(UsePreviousValue.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProvisioningParameter]
  }
}

