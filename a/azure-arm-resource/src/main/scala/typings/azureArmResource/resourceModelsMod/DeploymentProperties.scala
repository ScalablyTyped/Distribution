package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentProperties extends StObject {
  
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
  var parameters: js.UndefOr[Any] = js.undefined
  
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
  var template: js.UndefOr[Any] = js.undefined
  
  /**
    * The URI of the template. Use either the templateLink property or the template property, but
    * not both.
    */
  var templateLink: js.UndefOr[TemplateLink] = js.undefined
}
object DeploymentProperties {
  
  inline def apply(mode: String): DeploymentProperties = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentProperties]
  }
  
  extension [Self <: DeploymentProperties](x: Self) {
    
    inline def setDebugSetting(value: DebugSetting): Self = StObject.set(x, "debugSetting", value.asInstanceOf[js.Any])
    
    inline def setDebugSettingUndefined: Self = StObject.set(x, "debugSetting", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOnErrorDeployment(value: OnErrorDeployment): Self = StObject.set(x, "onErrorDeployment", value.asInstanceOf[js.Any])
    
    inline def setOnErrorDeploymentUndefined: Self = StObject.set(x, "onErrorDeployment", js.undefined)
    
    inline def setParameters(value: Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersLink(value: ParametersLink): Self = StObject.set(x, "parametersLink", value.asInstanceOf[js.Any])
    
    inline def setParametersLinkUndefined: Self = StObject.set(x, "parametersLink", js.undefined)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setTemplate(value: Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateLink(value: TemplateLink): Self = StObject.set(x, "templateLink", value.asInstanceOf[js.Any])
    
    inline def setTemplateLinkUndefined: Self = StObject.set(x, "templateLink", js.undefined)
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
