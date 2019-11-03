package typings.azureDashArmDashResource.libResourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentProperties extends js.Object {
  /**
    * The debug setting of the deployment.
    */
  var debugSetting: js.UndefOr[DebugSetting] = js.undefined
  /**
    * The mode that is used to deploy resources. This value can be either Incremental or Complete.
    * In Incremental mode, resources are deployed without deleting existing resources that are not
    * included in the template. In Complete mode, resources are deployed and existing resources in
    * the resource group that are not included in the template are deleted. Be careful when using
    * Complete mode as you may unintentionally delete resources. Possible values include:
    * 'Incremental', 'Complete'
    */
  var mode: String
  /**
    * The deployment on error behavior.
    */
  var onErrorDeployment: js.UndefOr[OnErrorDeployment] = js.undefined
  /**
    * Name and value pairs that define the deployment parameters for the template. You use this
    * element when you want to provide the parameter values directly in the request rather than link
    * to an existing parameter file. Use either the parametersLink property or the parameters
    * property, but not both. It can be a JObject or a well formed JSON string.
    */
  var parameters: js.UndefOr[js.Any] = js.undefined
  /**
    * The URI of parameters file. You use this element to link to an existing parameters file. Use
    * either the parametersLink property or the parameters property, but not both.
    */
  var parametersLink: js.UndefOr[ParametersLink] = js.undefined
  /**
    * The template content. You use this element when you want to pass the template syntax directly
    * in the request rather than link to an existing template. It can be a JObject or well-formed
    * JSON string. Use either the templateLink property or the template property, but not both.
    */
  var template: js.UndefOr[js.Any] = js.undefined
  /**
    * The URI of the template. Use either the templateLink property or the template property, but
    * not both.
    */
  var templateLink: js.UndefOr[TemplateLink] = js.undefined
}

object DeploymentProperties {
  @scala.inline
  def apply(
    mode: String,
    debugSetting: DebugSetting = null,
    onErrorDeployment: OnErrorDeployment = null,
    parameters: js.Any = null,
    parametersLink: ParametersLink = null,
    template: js.Any = null,
    templateLink: TemplateLink = null
  ): DeploymentProperties = {
    val __obj = js.Dynamic.literal(mode = mode)
    if (debugSetting != null) __obj.updateDynamic("debugSetting")(debugSetting)
    if (onErrorDeployment != null) __obj.updateDynamic("onErrorDeployment")(onErrorDeployment)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (parametersLink != null) __obj.updateDynamic("parametersLink")(parametersLink)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateLink != null) __obj.updateDynamic("templateLink")(templateLink)
    __obj.asInstanceOf[DeploymentProperties]
  }
}

