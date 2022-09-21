package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultAzureCredentialClientIdOptions
  extends StObject
     with DefaultAzureCredentialOptions {
  
  /**
    * Optionally pass in a user assigned client ID to be used by the {@link ManagedIdentityCredential}.
    * This client ID can also be passed through to the {@link ManagedIdentityCredential} through the environment variable: AZURE_CLIENT_ID.
    */
  var managedIdentityClientId: js.UndefOr[String] = js.undefined
}
object DefaultAzureCredentialClientIdOptions {
  
  inline def apply(): DefaultAzureCredentialClientIdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultAzureCredentialClientIdOptions]
  }
  
  extension [Self <: DefaultAzureCredentialClientIdOptions](x: Self) {
    
    inline def setManagedIdentityClientId(value: String): Self = StObject.set(x, "managedIdentityClientId", value.asInstanceOf[js.Any])
    
    inline def setManagedIdentityClientIdUndefined: Self = StObject.set(x, "managedIdentityClientId", js.undefined)
  }
}
