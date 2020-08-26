package typings.azureArmResource.resourceModelsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentPropertiesExtended extends js.Object {
  /**
    * The correlation ID of the deployment.
    */
  val correlationId: js.UndefOr[String] = js.native
  /**
    * The debug setting of the deployment.
    */
  var debugSetting: js.UndefOr[DebugSetting] = js.native
  /**
    * The list of deployment dependencies.
    */
  var dependencies: js.UndefOr[js.Array[Dependency]] = js.native
  /**
    * The deployment mode. Possible values are Incremental and Complete. Possible values include:
    * 'Incremental', 'Complete'
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * The deployment on error behavior.
    */
  var onErrorDeployment: js.UndefOr[OnErrorDeploymentExtended] = js.native
  /**
    * Key/value pairs that represent deployment output.
    */
  var outputs: js.UndefOr[js.Any] = js.native
  /**
    * Deployment parameters. Use only one of Parameters or ParametersLink.
    */
  var parameters: js.UndefOr[js.Any] = js.native
  /**
    * The URI referencing the parameters. Use only one of Parameters or ParametersLink.
    */
  var parametersLink: js.UndefOr[ParametersLink] = js.native
  /**
    * The list of resource providers needed for the deployment.
    */
  var providers: js.UndefOr[js.Array[Provider]] = js.native
  /**
    * The state of the provisioning.
    */
  val provisioningState: js.UndefOr[String] = js.native
  /**
    * The template content. Use only one of Template or TemplateLink.
    */
  var template: js.UndefOr[js.Any] = js.native
  /**
    * The URI referencing the template. Use only one of Template or TemplateLink.
    */
  var templateLink: js.UndefOr[TemplateLink] = js.native
  /**
    * The timestamp of the template deployment.
    */
  val timestamp: js.UndefOr[Date] = js.native
}

object DeploymentPropertiesExtended {
  @scala.inline
  def apply(): DeploymentPropertiesExtended = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentPropertiesExtended]
  }
  @scala.inline
  implicit class DeploymentPropertiesExtendedOps[Self <: DeploymentPropertiesExtended] (val x: Self) extends AnyVal {
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
    def setCorrelationId(value: String): Self = this.set("correlationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorrelationId: Self = this.set("correlationId", js.undefined)
    @scala.inline
    def setDebugSetting(value: DebugSetting): Self = this.set("debugSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugSetting: Self = this.set("debugSetting", js.undefined)
    @scala.inline
    def setDependenciesVarargs(value: Dependency*): Self = this.set("dependencies", js.Array(value :_*))
    @scala.inline
    def setDependencies(value: js.Array[Dependency]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOnErrorDeployment(value: OnErrorDeploymentExtended): Self = this.set("onErrorDeployment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnErrorDeployment: Self = this.set("onErrorDeployment", js.undefined)
    @scala.inline
    def setOutputs(value: js.Any): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
    @scala.inline
    def setParameters(value: js.Any): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setParametersLink(value: ParametersLink): Self = this.set("parametersLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParametersLink: Self = this.set("parametersLink", js.undefined)
    @scala.inline
    def setProvidersVarargs(value: Provider*): Self = this.set("providers", js.Array(value :_*))
    @scala.inline
    def setProviders(value: js.Array[Provider]): Self = this.set("providers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviders: Self = this.set("providers", js.undefined)
    @scala.inline
    def setProvisioningState(value: String): Self = this.set("provisioningState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningState: Self = this.set("provisioningState", js.undefined)
    @scala.inline
    def setTemplate(value: js.Any): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTemplateLink(value: TemplateLink): Self = this.set("templateLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateLink: Self = this.set("templateLink", js.undefined)
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}

