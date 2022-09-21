package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedIdentityCredentialResourceIdOptions
  extends StObject
     with TokenCredentialOptions {
  
  /**
    * Allows specifying a custom resource Id.
    * In scenarios such as when user assigned identities are created using an ARM template,
    * where the resource Id of the identity is known but the client Id can't be known ahead of time,
    * this parameter allows programs to use these user assigned identities
    * without having to first determine the client Id of the created identity.
    */
  var resourceId: String
}
object ManagedIdentityCredentialResourceIdOptions {
  
  inline def apply(resourceId: String): ManagedIdentityCredentialResourceIdOptions = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedIdentityCredentialResourceIdOptions]
  }
  
  extension [Self <: ManagedIdentityCredentialResourceIdOptions](x: Self) {
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
  }
}
