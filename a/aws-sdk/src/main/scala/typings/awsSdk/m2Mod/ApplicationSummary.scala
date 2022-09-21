package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var applicationArn: Arn
  
  /**
    * The unique identifier of the application.
    */
  var applicationId: Identifier
  
  /**
    * The version of the application.
    */
  var applicationVersion: Version
  
  /**
    * The timestamp when the application was created.
    */
  var creationTime: js.Date
  
  /**
    * Indicates whether there is an ongoing deployment or if the application has ever deployed successfully.
    */
  var deploymentStatus: js.UndefOr[ApplicationDeploymentLifecycle] = js.undefined
  
  /**
    * The description of the application.
    */
  var description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The type of the target platform for this application.
    */
  var engineType: EngineType
  
  /**
    * The unique identifier of the runtime environment that hosts this application.
    */
  var environmentId: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The timestamp when the application was last started. Null until the application has started running for the first time.
    */
  var lastStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the application.
    */
  var name: EntityName
  
  /**
    * The status of the application.
    */
  var status: ApplicationLifecycle
  
  /**
    * Indicates the status of the latest version of the application.
    */
  var versionStatus: js.UndefOr[ApplicationVersionLifecycle] = js.undefined
}
object ApplicationSummary {
  
  inline def apply(
    applicationArn: Arn,
    applicationId: Identifier,
    applicationVersion: Version,
    creationTime: js.Date,
    engineType: EngineType,
    name: EntityName,
    status: ApplicationLifecycle
  ): ApplicationSummary = {
    val __obj = js.Dynamic.literal(applicationArn = applicationArn.asInstanceOf[js.Any], applicationId = applicationId.asInstanceOf[js.Any], applicationVersion = applicationVersion.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSummary]
  }
  
  extension [Self <: ApplicationSummary](x: Self) {
    
    inline def setApplicationArn(value: Arn): Self = StObject.set(x, "applicationArn", value.asInstanceOf[js.Any])
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersion(value: Version): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatus(value: ApplicationDeploymentLifecycle): Self = StObject.set(x, "deploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusUndefined: Self = StObject.set(x, "deploymentStatus", js.undefined)
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentId(value: Identifier): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "environmentId", js.undefined)
    
    inline def setLastStartTime(value: js.Date): Self = StObject.set(x, "lastStartTime", value.asInstanceOf[js.Any])
    
    inline def setLastStartTimeUndefined: Self = StObject.set(x, "lastStartTime", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ApplicationLifecycle): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setVersionStatus(value: ApplicationVersionLifecycle): Self = StObject.set(x, "versionStatus", value.asInstanceOf[js.Any])
    
    inline def setVersionStatusUndefined: Self = StObject.set(x, "versionStatus", js.undefined)
  }
}
