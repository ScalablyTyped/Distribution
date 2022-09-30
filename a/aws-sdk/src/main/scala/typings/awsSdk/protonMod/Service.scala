package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Service extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the service.
    */
  var arn: ServiceArn
  
  /**
    * The name of the code repository branch that holds the code that's deployed in Proton.
    */
  var branchName: js.UndefOr[GitBranchName] = js.undefined
  
  /**
    * The time when the service was created.
    */
  var createdAt: js.Date
  
  /**
    * A description of the service.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The time when the service was last modified.
    */
  var lastModifiedAt: js.Date
  
  /**
    * The name of the service.
    */
  var name: ResourceName
  
  /**
    * The service pipeline detail data.
    */
  var pipeline: js.UndefOr[ServicePipeline] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the repository connection. For more information, see Setting up an AWS CodeStar connection in the Proton User Guide.
    */
  var repositoryConnectionArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the source code repository.
    */
  var repositoryId: js.UndefOr[RepositoryId] = js.undefined
  
  /**
    * The formatted specification that defines the service.
    */
  var spec: SpecContents
  
  /**
    * The status of the service.
    */
  var status: ServiceStatus
  
  /**
    * A service status message.
    */
  var statusMessage: js.UndefOr[StatusMessage] = js.undefined
  
  /**
    * The name of the service template.
    */
  var templateName: ResourceName
}
object Service {
  
  inline def apply(
    arn: ServiceArn,
    createdAt: js.Date,
    lastModifiedAt: js.Date,
    name: ResourceName,
    spec: SpecContents,
    status: ServiceStatus,
    templateName: ResourceName
  ): Service = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], lastModifiedAt = lastModifiedAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
  
  extension [Self <: Service](x: Self) {
    
    inline def setArn(value: ServiceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setBranchName(value: GitBranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setBranchNameUndefined: Self = StObject.set(x, "branchName", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastModifiedAt(value: js.Date): Self = StObject.set(x, "lastModifiedAt", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPipeline(value: ServicePipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setRepositoryConnectionArn(value: Arn): Self = StObject.set(x, "repositoryConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setRepositoryConnectionArnUndefined: Self = StObject.set(x, "repositoryConnectionArn", js.undefined)
    
    inline def setRepositoryId(value: RepositoryId): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    
    inline def setRepositoryIdUndefined: Self = StObject.set(x, "repositoryId", js.undefined)
    
    inline def setSpec(value: SpecContents): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ServiceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
