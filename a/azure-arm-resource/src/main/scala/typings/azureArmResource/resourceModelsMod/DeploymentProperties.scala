package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentProperties extends js.Object {
  /**
    * The debug setting of the deployment.
    */
  var debugSetting: js.UndefOr[DebugSetting] = js.native
  /**
    * The mode that is used to deploy resources. This value can be either Incremental or Complete.
    * In Incremental mode, resources are deployed without deleting existing resources that are not
    * included in the template. In Complete mode, resources are deployed and existing resources in
    * the resource group that are not included in the template are deleted. Be careful when using
    * Complete mode as you may unintentionally delete resources. Possible values include:
    * 'Incremental', 'Complete'
    */
  var mode: String = js.native
  /**
    * The deployment on error behavior.
    */
  var onErrorDeployment: js.UndefOr[OnErrorDeployment] = js.native
  /**
    * Name and value pairs that define the deployment parameters for the template. You use this
    * element when you want to provide the parameter values directly in the request rather than link
    * to an existing parameter file. Use either the parametersLink property or the parameters
    * property, but not both. It can be a JObject or a well formed JSON string.
    */
  var parameters: js.UndefOr[js.Any] = js.native
  /**
    * The URI of parameters file. You use this element to link to an existing parameters file. Use
    * either the parametersLink property or the parameters property, but not both.
    */
  var parametersLink: js.UndefOr[ParametersLink] = js.native
  /**
    * The template content. You use this element when you want to pass the template syntax directly
    * in the request rather than link to an existing template. It can be a JObject or well-formed
    * JSON string. Use either the templateLink property or the template property, but not both.
    */
  var template: js.UndefOr[js.Any] = js.native
  /**
    * The URI of the template. Use either the templateLink property or the template property, but
    * not both.
    */
  var templateLink: js.UndefOr[TemplateLink] = js.native
}

object DeploymentProperties {
  @scala.inline
  def apply(mode: String): DeploymentProperties = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentProperties]
  }
  @scala.inline
  implicit class DeploymentPropertiesOps[Self <: DeploymentProperties] (val x: Self) extends AnyVal {
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
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebugSetting(value: DebugSetting): Self = this.set("debugSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugSetting: Self = this.set("debugSetting", js.undefined)
    @scala.inline
    def setOnErrorDeployment(value: OnErrorDeployment): Self = this.set("onErrorDeployment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnErrorDeployment: Self = this.set("onErrorDeployment", js.undefined)
    @scala.inline
    def setParameters(value: js.Any): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setParametersLink(value: ParametersLink): Self = this.set("parametersLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParametersLink: Self = this.set("parametersLink", js.undefined)
    @scala.inline
    def setTemplate(value: js.Any): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTemplateLink(value: TemplateLink): Self = this.set("templateLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateLink: Self = this.set("templateLink", js.undefined)
  }
  
}

