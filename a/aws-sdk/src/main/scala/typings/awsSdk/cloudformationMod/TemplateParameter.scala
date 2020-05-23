package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateParameter extends js.Object {
  /**
    * The default value associated with the parameter.
    */
  var DefaultValue: js.UndefOr[ParameterValue] = js.native
  /**
    * User defined description associated with the parameter.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.native
  /**
    * Flag indicating whether the parameter should be displayed as plain text in logs and UIs.
    */
  var NoEcho: js.UndefOr[typings.awsSdk.cloudformationMod.NoEcho] = js.native
  /**
    * The name associated with the parameter.
    */
  var ParameterKey: js.UndefOr[typings.awsSdk.cloudformationMod.ParameterKey] = js.native
}

object TemplateParameter {
  @scala.inline
  def apply(
    DefaultValue: ParameterValue = null,
    Description: Description = null,
    NoEcho: js.UndefOr[NoEcho] = js.undefined,
    ParameterKey: ParameterKey = null
  ): TemplateParameter = {
    val __obj = js.Dynamic.literal()
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(NoEcho)) __obj.updateDynamic("NoEcho")(NoEcho.get.asInstanceOf[js.Any])
    if (ParameterKey != null) __obj.updateDynamic("ParameterKey")(ParameterKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateParameter]
  }
}

