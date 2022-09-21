package typings.azureIdentity.mod

import typings.azureCoreAuth.mod.TokenCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "ManagedIdentityCredential")
@js.native
/**
  * Creates an instance of ManagedIdentityCredential with clientId
  *
  * @param options - Options for configuring the client which makes the access token request.
  */
open class ManagedIdentityCredential ()
  extends StObject
     with TokenCredential {
  /**
    * Creates an instance of ManagedIdentityCredential with the client ID of a
    * user-assigned identity, or app registration (when working with AKS pod-identity).
    *
    * @param clientId - The client ID of the user-assigned identity, or app registration (when working with AKS pod-identity).
    * @param options - Options for configuring the client which makes the access token request.
    */
  def this(clientId: String) = this()
  def this(options: ManagedIdentityCredentialClientIdOptions) = this()
  def this(options: ManagedIdentityCredentialResourceIdOptions) = this()
  def this(clientId: String, options: TokenCredentialOptions) = this()
  
  /* private */ var authenticateManagedIdentity: Any = js.native
  
  /* private */ var cachedAvailableMSI: Any = js.native
  
  /* private */ var cachedMSI: Any = js.native
  
  /* private */ var clientId: Any = js.native
  
  /* private */ var identityClient: Any = js.native
  
  /* private */ var isAvailableIdentityClient: Any = js.native
  
  /* private */ var isEndpointUnavailable: Any = js.native
  
  /* private */ var resourceId: Any = js.native
}
