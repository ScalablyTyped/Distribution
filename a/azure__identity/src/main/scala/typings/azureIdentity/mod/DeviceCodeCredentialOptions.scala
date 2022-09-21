package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceCodeCredentialOptions
  extends StObject
     with InteractiveCredentialOptions
     with CredentialPersistenceOptions {
  
  /**
    * The client (application) ID of an App Registration in the tenant.
    */
  var clientId: js.UndefOr[String] = js.undefined
  
  /**
    * The Azure Active Directory tenant (directory) ID.
    */
  var tenantId: js.UndefOr[String] = js.undefined
  
  /**
    * A callback function that will be invoked to show {@link DeviceCodeInfo} to the user.
    * If left unassigned, we will automatically log the device code information
    * and the authentication instructions in the console.
    */
  var userPromptCallback: js.UndefOr[DeviceCodePromptCallback] = js.undefined
}
object DeviceCodeCredentialOptions {
  
  inline def apply(): DeviceCodeCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceCodeCredentialOptions]
  }
  
  extension [Self <: DeviceCodeCredentialOptions](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    inline def setUserPromptCallback(value: /* deviceCodeInfo */ DeviceCodeInfo => Unit): Self = StObject.set(x, "userPromptCallback", js.Any.fromFunction1(value))
    
    inline def setUserPromptCallbackUndefined: Self = StObject.set(x, "userPromptCallback", js.undefined)
  }
}
