package typings.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentPropertiesExtended extends StObject {
  
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
  var outputs: js.UndefOr[Any] = js.undefined
  
  /**
    * Deployment parameters. Use only one of Parameters or ParametersLink.
    */
  var parameters: js.UndefOr[Any] = js.undefined
  
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
  var template: js.UndefOr[Any] = js.undefined
  
  /**
    * The URI referencing the template. Use only one of Template or TemplateLink.
    */
  var templateLink: js.UndefOr[TemplateLink] = js.undefined
  
  /**
    * The timestamp of the template deployment.
    */
  val timestamp: js.UndefOr[js.Date] = js.undefined
}
object DeploymentPropertiesExtended {
  
  inline def apply(): DeploymentPropertiesExtended = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentPropertiesExtended]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentPropertiesExtended] (val x: Self) extends AnyVal {
    
    inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
    
    inline def setDebugSetting(value: DebugSetting): Self = StObject.set(x, "debugSetting", value.asInstanceOf[js.Any])
    
    inline def setDebugSettingUndefined: Self = StObject.set(x, "debugSetting", js.undefined)
    
    inline def setDependencies(value: js.Array[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: Dependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnErrorDeployment(value: OnErrorDeploymentExtended): Self = StObject.set(x, "onErrorDeployment", value.asInstanceOf[js.Any])
    
    inline def setOnErrorDeploymentUndefined: Self = StObject.set(x, "onErrorDeployment", js.undefined)
    
    inline def setOutputs(value: Any): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setParameters(value: Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersLink(value: ParametersLink): Self = StObject.set(x, "parametersLink", value.asInstanceOf[js.Any])
    
    inline def setParametersLinkUndefined: Self = StObject.set(x, "parametersLink", js.undefined)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setProviders(value: js.Array[Provider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setProvidersVarargs(value: Provider*): Self = StObject.set(x, "providers", js.Array(value*))
    
    inline def setProvisioningState(value: String): Self = StObject.set(x, "provisioningState", value.asInstanceOf[js.Any])
    
    inline def setProvisioningStateUndefined: Self = StObject.set(x, "provisioningState", js.undefined)
    
    inline def setTemplate(value: Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateLink(value: TemplateLink): Self = StObject.set(x, "templateLink", value.asInstanceOf[js.Any])
    
    inline def setTemplateLinkUndefined: Self = StObject.set(x, "templateLink", js.undefined)
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
