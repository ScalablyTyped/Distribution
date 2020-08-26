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
  def apply(): TemplateParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateParameter]
  }
  @scala.inline
  implicit class TemplateParameterOps[Self <: TemplateParameter] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: ParameterValue): Self = this.set("DefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("DefaultValue", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setNoEcho(value: NoEcho): Self = this.set("NoEcho", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoEcho: Self = this.set("NoEcho", js.undefined)
    @scala.inline
    def setParameterKey(value: ParameterKey): Self = this.set("ParameterKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterKey: Self = this.set("ParameterKey", js.undefined)
  }
  
}

