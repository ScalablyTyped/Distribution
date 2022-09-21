package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultAzureCredentialResourceIdOptions
  extends StObject
     with DefaultAzureCredentialOptions {
  
  /**
    * Optionally pass in a resource ID to be used by the {@link ManagedIdentityCredential}.
    * In scenarios such as when user assigned identities are created using an ARM template,
    * where the resource Id of the identity is known but the client Id can't be known ahead of time,
    * this parameter allows programs to use these user assigned identities
    * without having to first determine the client Id of the created identity.
    */
  var managedIdentityResourceId: String
}
object DefaultAzureCredentialResourceIdOptions {
  
  inline def apply(managedIdentityResourceId: String): DefaultAzureCredentialResourceIdOptions = {
    val __obj = js.Dynamic.literal(managedIdentityResourceId = managedIdentityResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultAzureCredentialResourceIdOptions]
  }
  
  extension [Self <: DefaultAzureCredentialResourceIdOptions](x: Self) {
    
    inline def setManagedIdentityResourceId(value: String): Self = StObject.set(x, "managedIdentityResourceId", value.asInstanceOf[js.Any])
  }
}
