package typings.azureDashArmDashResource.libResourceModelsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentPropertiesExtended extends js.Object {
  /**
    * The correlation ID of the deployment.
    */
  val correlationId: js.UndefOr[String] = js.undefined
  /**
    * The debug setting of the deployment.
    */
  var debugSetting: js.UndefOr[DebugSetting] = js.undefined
  /**
    * The list of deployment dependencies.
    */
  var dependencies: js.UndefOr[js.Array[Dependency]] = js.undefined
  /**
    * The deployment mode. Possible values are Incremental and Complete. Possible values include:
    * 'Incremental', 'Complete'
    */
  var mode: js.UndefOr[String] = js.undefined
  /**
    * The deployment on error behavior.
    */
  var onErrorDeployment: js.UndefOr[OnErrorDeploymentExtended] = js.undefined
  /**
    * Key/value pairs that represent deployment output.
    */
  var outputs: js.UndefOr[js.Any] = js.undefined
  /**
    * Deployment parameters. Use only one of Parameters or ParametersLink.
    */
  var parameters: js.UndefOr[js.Any] = js.undefined
  /**
    * The URI referencing the parameters. Use only one of Parameters or ParametersLink.
    */
  var parametersLink: js.UndefOr[ParametersLink] = js.undefined
  /**
    * The list of resource providers needed for the deployment.
    */
  var providers: js.UndefOr[js.Array[Provider]] = js.undefined
  /**
    * The state of the provisioning.
    */
  val provisioningState: js.UndefOr[String] = js.undefined
  /**
    * The template content. Use only one of Template or TemplateLink.
    */
  var template: js.UndefOr[js.Any] = js.undefined
  /**
    * The URI referencing the template. Use only one of Template or TemplateLink.
    */
  var templateLink: js.UndefOr[TemplateLink] = js.undefined
  /**
    * The timestamp of the template deployment.
    */
  val timestamp: js.UndefOr[Date] = js.undefined
}

object DeploymentPropertiesExtended {
  @scala.inline
  def apply(
    correlationId: String = null,
    debugSetting: DebugSetting = null,
    dependencies: js.Array[Dependency] = null,
    mode: String = null,
    onErrorDeployment: OnErrorDeploymentExtended = null,
    outputs: js.Any = null,
    parameters: js.Any = null,
    parametersLink: ParametersLink = null,
    providers: js.Array[Provider] = null,
    provisioningState: String = null,
    template: js.Any = null,
    templateLink: TemplateLink = null,
    timestamp: Date = null
  ): DeploymentPropertiesExtended = {
    val __obj = js.Dynamic.literal()
    if (correlationId != null) __obj.updateDynamic("correlationId")(correlationId)
    if (debugSetting != null) __obj.updateDynamic("debugSetting")(debugSetting)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (onErrorDeployment != null) __obj.updateDynamic("onErrorDeployment")(onErrorDeployment)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (parametersLink != null) __obj.updateDynamic("parametersLink")(parametersLink)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    if (provisioningState != null) __obj.updateDynamic("provisioningState")(provisioningState)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateLink != null) __obj.updateDynamic("templateLink")(templateLink)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[DeploymentPropertiesExtended]
  }
}

