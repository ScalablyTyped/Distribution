package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningArtifactParameter extends js.Object {
  /**
    * The default value.
    */
  var DefaultValue: js.UndefOr[typings.awsSdk.servicecatalogMod.DefaultValue] = js.native
  /**
    * The description of the parameter.
    */
  var Description: js.UndefOr[typings.awsSdk.servicecatalogMod.Description] = js.native
  /**
    * If this value is true, the value for this parameter is obfuscated from view when the parameter is retrieved. This parameter is used to hide sensitive information.
    */
  var IsNoEcho: js.UndefOr[NoEcho] = js.native
  /**
    * Constraints that the administrator has put on a parameter.
    */
  var ParameterConstraints: js.UndefOr[typings.awsSdk.servicecatalogMod.ParameterConstraints] = js.native
  /**
    * The parameter key.
    */
  var ParameterKey: js.UndefOr[typings.awsSdk.servicecatalogMod.ParameterKey] = js.native
  /**
    * The parameter type.
    */
  var ParameterType: js.UndefOr[typings.awsSdk.servicecatalogMod.ParameterType] = js.native
}

object ProvisioningArtifactParameter {
  @scala.inline
  def apply(
    DefaultValue: DefaultValue = null,
    Description: Description = null,
    IsNoEcho: js.UndefOr[Boolean] = js.undefined,
    ParameterConstraints: ParameterConstraints = null,
    ParameterKey: ParameterKey = null,
    ParameterType: ParameterType = null
  ): ProvisioningArtifactParameter = {
    val __obj = js.Dynamic.literal()
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(IsNoEcho)) __obj.updateDynamic("IsNoEcho")(IsNoEcho.asInstanceOf[js.Any])
    if (ParameterConstraints != null) __obj.updateDynamic("ParameterConstraints")(ParameterConstraints.asInstanceOf[js.Any])
    if (ParameterKey != null) __obj.updateDynamic("ParameterKey")(ParameterKey.asInstanceOf[js.Any])
    if (ParameterType != null) __obj.updateDynamic("ParameterType")(ParameterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningArtifactParameter]
  }
}

