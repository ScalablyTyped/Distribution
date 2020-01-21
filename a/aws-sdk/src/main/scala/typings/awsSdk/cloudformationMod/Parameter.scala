package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameter extends js.Object {
  /**
    * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS CloudFormation uses the default value that is specified in your template.
    */
  var ParameterKey: js.UndefOr[typings.awsSdk.cloudformationMod.ParameterKey] = js.native
  /**
    * The input value associated with the parameter.
    */
  var ParameterValue: js.UndefOr[typings.awsSdk.cloudformationMod.ParameterValue] = js.native
  /**
    * Read-only. The value that corresponds to a Systems Manager parameter key. This field is returned only for  SSM parameter types in the template.
    */
  var ResolvedValue: js.UndefOr[ParameterValue] = js.native
  /**
    * During a stack update, use the existing parameter value that the stack is using for a given parameter key. If you specify true, do not specify a parameter value.
    */
  var UsePreviousValue: js.UndefOr[typings.awsSdk.cloudformationMod.UsePreviousValue] = js.native
}

object Parameter {
  @scala.inline
  def apply(
    ParameterKey: ParameterKey = null,
    ParameterValue: ParameterValue = null,
    ResolvedValue: ParameterValue = null,
    UsePreviousValue: js.UndefOr[Boolean] = js.undefined
  ): Parameter = {
    val __obj = js.Dynamic.literal()
    if (ParameterKey != null) __obj.updateDynamic("ParameterKey")(ParameterKey.asInstanceOf[js.Any])
    if (ParameterValue != null) __obj.updateDynamic("ParameterValue")(ParameterValue.asInstanceOf[js.Any])
    if (ResolvedValue != null) __obj.updateDynamic("ResolvedValue")(ResolvedValue.asInstanceOf[js.Any])
    if (!js.isUndefined(UsePreviousValue)) __obj.updateDynamic("UsePreviousValue")(UsePreviousValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
}

