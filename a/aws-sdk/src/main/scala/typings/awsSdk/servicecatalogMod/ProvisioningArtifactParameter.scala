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
  def apply(): ProvisioningArtifactParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifactParameter]
  }
  @scala.inline
  implicit class ProvisioningArtifactParameterOps[Self <: ProvisioningArtifactParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultValue(value: DefaultValue): Self = this.set("DefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("DefaultValue", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setIsNoEcho(value: NoEcho): Self = this.set("IsNoEcho", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNoEcho: Self = this.set("IsNoEcho", js.undefined)
    @scala.inline
    def setParameterConstraints(value: ParameterConstraints): Self = this.set("ParameterConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterConstraints: Self = this.set("ParameterConstraints", js.undefined)
    @scala.inline
    def setParameterKey(value: ParameterKey): Self = this.set("ParameterKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterKey: Self = this.set("ParameterKey", js.undefined)
    @scala.inline
    def setParameterType(value: ParameterType): Self = this.set("ParameterType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterType: Self = this.set("ParameterType", js.undefined)
  }
  
}

