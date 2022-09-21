package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectAppConfigResource extends StObject {
  
  /**
    * The ID of the AppConfig application to use for client-side evaluation. 
    */
  var applicationId: AppConfigResourceId
  
  /**
    * The ID of the AppConfig profile to use for client-side evaluation. 
    */
  var configurationProfileId: AppConfigResourceId
  
  /**
    * The ID of the AppConfig environment to use for client-side evaluation. This must be an environment that is within the application that you specify for applicationId.
    */
  var environmentId: AppConfigResourceId
}
object ProjectAppConfigResource {
  
  inline def apply(
    applicationId: AppConfigResourceId,
    configurationProfileId: AppConfigResourceId,
    environmentId: AppConfigResourceId
  ): ProjectAppConfigResource = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], configurationProfileId = configurationProfileId.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectAppConfigResource]
  }
  
  extension [Self <: ProjectAppConfigResource](x: Self) {
    
    inline def setApplicationId(value: AppConfigResourceId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationProfileId(value: AppConfigResourceId): Self = StObject.set(x, "configurationProfileId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentId(value: AppConfigResourceId): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
  }
}
