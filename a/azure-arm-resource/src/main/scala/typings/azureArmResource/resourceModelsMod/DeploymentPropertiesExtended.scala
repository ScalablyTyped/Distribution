package typings.azureArmResource.resourceModelsMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentPropertiesExtended extends StObject {
  
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
  implicit class DeploymentPropertiesExtendedMutableBuilder[Self <: DeploymentPropertiesExtended] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
    
    @scala.inline
    def setDebugSetting(value: DebugSetting): Self = StObject.set(x, "debugSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugSettingUndefined: Self = StObject.set(x, "debugSetting", js.undefined)
    
    @scala.inline
    def setDependencies(value: js.Array[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: Dependency*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOnErrorDeployment(value: OnErrorDeploymentExtended): Self = StObject.set(x, "onErrorDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnErrorDeploymentUndefined: Self = StObject.set(x, "onErrorDeployment", js.undefined)
    
    @scala.inline
    def setOutputs(value: js.Any): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersLink(value: ParametersLink): Self = StObject.set(x, "parametersLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersLinkUndefined: Self = StObject.set(x, "parametersLink", js.undefined)
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setProviders(value: js.Array[Provider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    @scala.inline
    def setProvidersVarargs(value: Provider*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    @scala.inline
    def setProvisioningState(value: String): Self = StObject.set(x, "provisioningState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningStateUndefined: Self = StObject.set(x, "provisioningState", js.undefined)
    
    @scala.inline
    def setTemplate(value: js.Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateLink(value: TemplateLink): Self = StObject.set(x, "templateLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateLinkUndefined: Self = StObject.set(x, "templateLink", js.undefined)
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
