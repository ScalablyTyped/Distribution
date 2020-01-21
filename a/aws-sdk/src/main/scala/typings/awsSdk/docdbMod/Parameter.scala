package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameter extends js.Object {
  /**
    * Specifies the valid range of values for the parameter.
    */
  var AllowedValues: js.UndefOr[String] = js.native
  /**
    * Indicates when to apply parameter updates.
    */
  var ApplyMethod: js.UndefOr[typings.awsSdk.docdbMod.ApplyMethod] = js.native
  /**
    * Specifies the engine-specific parameters type.
    */
  var ApplyType: js.UndefOr[String] = js.native
  /**
    * Specifies the valid data type for the parameter.
    */
  var DataType: js.UndefOr[String] = js.native
  /**
    * Provides a description of the parameter.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    *  Indicates whether (true) or not (false) the parameter can be modified. Some parameters have security or operational implications that prevent them from being changed. 
    */
  var IsModifiable: js.UndefOr[Boolean] = js.native
  /**
    * The earliest engine version to which the parameter can apply.
    */
  var MinimumEngineVersion: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.native
  /**
    * Specifies the value of the parameter.
    */
  var ParameterValue: js.UndefOr[String] = js.native
  /**
    * Indicates the source of the parameter value.
    */
  var Source: js.UndefOr[String] = js.native
}

object Parameter {
  @scala.inline
  def apply(
    AllowedValues: String = null,
    ApplyMethod: ApplyMethod = null,
    ApplyType: String = null,
    DataType: String = null,
    Description: String = null,
    IsModifiable: js.UndefOr[scala.Boolean] = js.undefined,
    MinimumEngineVersion: String = null,
    ParameterName: String = null,
    ParameterValue: String = null,
    Source: String = null
  ): Parameter = {
    val __obj = js.Dynamic.literal()
    if (AllowedValues != null) __obj.updateDynamic("AllowedValues")(AllowedValues.asInstanceOf[js.Any])
    if (ApplyMethod != null) __obj.updateDynamic("ApplyMethod")(ApplyMethod.asInstanceOf[js.Any])
    if (ApplyType != null) __obj.updateDynamic("ApplyType")(ApplyType.asInstanceOf[js.Any])
    if (DataType != null) __obj.updateDynamic("DataType")(DataType.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(IsModifiable)) __obj.updateDynamic("IsModifiable")(IsModifiable.asInstanceOf[js.Any])
    if (MinimumEngineVersion != null) __obj.updateDynamic("MinimumEngineVersion")(MinimumEngineVersion.asInstanceOf[js.Any])
    if (ParameterName != null) __obj.updateDynamic("ParameterName")(ParameterName.asInstanceOf[js.Any])
    if (ParameterValue != null) __obj.updateDynamic("ParameterValue")(ParameterValue.asInstanceOf[js.Any])
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
}

