package typings.awsSdk.finspaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnvironmentRequest extends StObject {
  
  /**
    * The description of the environment.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The identifier of the FinSpace environment.
    */
  var environmentId: IdType
  
  /**
    * Authentication mode for the environment.    FEDERATED - Users access FinSpace through Single Sign On (SSO) via your Identity provider.    LOCAL - Users access FinSpace via email and password managed within the FinSpace environment.  
    */
  var federationMode: js.UndefOr[FederationMode] = js.undefined
  
  var federationParameters: js.UndefOr[FederationParameters] = js.undefined
  
  /**
    * The name of the environment.
    */
  var name: js.UndefOr[EnvironmentName] = js.undefined
}
object UpdateEnvironmentRequest {
  
  inline def apply(environmentId: IdType): UpdateEnvironmentRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentRequest]
  }
  
  extension [Self <: UpdateEnvironmentRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnvironmentId(value: IdType): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setFederationMode(value: FederationMode): Self = StObject.set(x, "federationMode", value.asInstanceOf[js.Any])
    
    inline def setFederationModeUndefined: Self = StObject.set(x, "federationMode", js.undefined)
    
    inline def setFederationParameters(value: FederationParameters): Self = StObject.set(x, "federationParameters", value.asInstanceOf[js.Any])
    
    inline def setFederationParametersUndefined: Self = StObject.set(x, "federationParameters", js.undefined)
    
    inline def setName(value: EnvironmentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
