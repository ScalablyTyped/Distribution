package typings.azureIdentity.mod

import typings.azureCoreAuth.mod.TokenCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "ChainedTokenCredential")
@js.native
open class ChainedTokenCredential protected ()
  extends StObject
     with TokenCredential {
  /**
    * Creates an instance of ChainedTokenCredential using the given credentials.
    *
    * @param sources - `TokenCredential` implementations to be tried in order.
    *
    * Example usage:
    * ```javascript
    * const firstCredential = new ClientSecretCredential(tenantId, clientId, clientSecret);
    * const secondCredential = new ClientSecretCredential(tenantId, anotherClientId, anotherSecret);
    * const credentialChain = new ChainedTokenCredential(firstCredential, secondCredential);
    * ```
    */
  def this(sources: TokenCredential*) = this()
  
  /**
    * The message to use when the chained token fails to get a token
    */
  /* protected */ var UnavailableMessage: String = js.native
  
  /* private */ var _sources: Any = js.native
}
