package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServicePipelineInput extends StObject {
  
  /**
    * The deployment type. There are four modes for updating a service pipeline. The deploymentType field defines the mode.     NONE  In this mode, a deployment doesn't occur. Only the requested metadata parameters are updated.     CURRENT_VERSION  In this mode, the service pipeline is deployed and updated with the new spec that you provide. Only requested parameters are updated. Don’t include major or minor version parameters when you use this deployment-type.     MINOR_VERSION  In this mode, the service pipeline is deployed and updated with the published, recommended (latest) minor version of the current major version in use, by default. You can specify a different minor version of the current major version in use.     MAJOR_VERSION  In this mode, the service pipeline is deployed and updated with the published, recommended (latest) major and minor version of the current template, by default. You can specify a different major version that's higher than the major version in use and a minor version.  
    */
  var deploymentType: DeploymentUpdateType
  
  /**
    * The name of the service to that the pipeline is associated with.
    */
  var serviceName: ResourceName
  
  /**
    * The spec for the service pipeline to update.
    */
  var spec: SpecContents
  
  /**
    * The major version of the service template that was used to create the service that the pipeline is associated with.
    */
  var templateMajorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
  
  /**
    * The minor version of the service template that was used to create the service that the pipeline is associated with.
    */
  var templateMinorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
}
object UpdateServicePipelineInput {
  
  inline def apply(deploymentType: DeploymentUpdateType, serviceName: ResourceName, spec: SpecContents): UpdateServicePipelineInput = {
    val __obj = js.Dynamic.literal(deploymentType = deploymentType.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServicePipelineInput]
  }
  
  extension [Self <: UpdateServicePipelineInput](x: Self) {
    
    inline def setDeploymentType(value: DeploymentUpdateType): Self = StObject.set(x, "deploymentType", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: SpecContents): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setTemplateMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMajorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMajorVersionUndefined: Self = StObject.set(x, "templateMajorVersion", js.undefined)
    
    inline def setTemplateMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMinorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMinorVersionUndefined: Self = StObject.set(x, "templateMinorVersion", js.undefined)
  }
}
