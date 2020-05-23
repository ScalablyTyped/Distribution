package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalDatabaseParameter extends js.Object {
  /**
    * Specifies the valid range of values for the parameter.
    */
  var allowedValues: js.UndefOr[String] = js.native
  /**
    * Indicates when parameter updates are applied. Can be immediate or pending-reboot.
    */
  var applyMethod: js.UndefOr[String] = js.native
  /**
    * Specifies the engine-specific parameter type.
    */
  var applyType: js.UndefOr[String] = js.native
  /**
    * Specifies the valid data type for the parameter.
    */
  var dataType: js.UndefOr[String] = js.native
  /**
    * Provides a description of the parameter.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A Boolean value indicating whether the parameter can be modified.
    */
  var isModifiable: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the name of the parameter.
    */
  var parameterName: js.UndefOr[String] = js.native
  /**
    * Specifies the value of the parameter.
    */
  var parameterValue: js.UndefOr[String] = js.native
}

object RelationalDatabaseParameter {
  @scala.inline
  def apply(
    allowedValues: String = null,
    applyMethod: String = null,
    applyType: String = null,
    dataType: String = null,
    description: String = null,
    isModifiable: js.UndefOr[Boolean] = js.undefined,
    parameterName: String = null,
    parameterValue: String = null
  ): RelationalDatabaseParameter = {
    val __obj = js.Dynamic.literal()
    if (allowedValues != null) __obj.updateDynamic("allowedValues")(allowedValues.asInstanceOf[js.Any])
    if (applyMethod != null) __obj.updateDynamic("applyMethod")(applyMethod.asInstanceOf[js.Any])
    if (applyType != null) __obj.updateDynamic("applyType")(applyType.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(isModifiable)) __obj.updateDynamic("isModifiable")(isModifiable.get.asInstanceOf[js.Any])
    if (parameterName != null) __obj.updateDynamic("parameterName")(parameterName.asInstanceOf[js.Any])
    if (parameterValue != null) __obj.updateDynamic("parameterValue")(parameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationalDatabaseParameter]
  }
}

