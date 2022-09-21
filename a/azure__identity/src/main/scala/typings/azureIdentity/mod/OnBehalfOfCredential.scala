package typings.azureIdentity.mod

import typings.azureCoreAuth.mod.TokenCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "OnBehalfOfCredential")
@js.native
open class OnBehalfOfCredential protected ()
  extends StObject
     with TokenCredential {
  /**
    * Creates an instance of the {@link OnBehalfOfCredential} with the details
    * needed to authenticate against Azure Active Directory with path to a PEM certificate,
    * and an user assertion.
    *
    * Example using the `KeyClient` from [\@azure/keyvault-keys](https://www.npmjs.com/package/\@azure/keyvault-keys):
    *
    * ```ts
    * const tokenCredential = new OnBehalfOfCredential({
    *   tenantId,
    *   clientId,
    *   certificatePath: "/path/to/certificate.pem",
    *   userAssertionToken: "access-token"
    * });
    * const client = new KeyClient("vault-url", tokenCredential);
    *
    * await client.getKey("key-name");
    * ```
    *
    * @param options - Optional parameters, generally common across credentials.
    */
  /**
    * Creates an instance of the {@link OnBehalfOfCredential} with the details
    * needed to authenticate against Azure Active Directory with a client
    * secret and an user assertion.
    *
    * Example using the `KeyClient` from [\@azure/keyvault-keys](https://www.npmjs.com/package/\@azure/keyvault-keys):
    *
    * ```ts
    * const tokenCredential = new OnBehalfOfCredential({
    *   tenantId,
    *   clientId,
    *   clientSecret,
    *   userAssertionToken: "access-token"
    * });
    * const client = new KeyClient("vault-url", tokenCredential);
    *
    * await client.getKey("key-name");
    * ```
    *
    * @param options - Optional parameters, generally common across credentials.
    */
  def this(options: OnBehalfOfCredentialCertificateOptions & MultiTenantTokenCredentialOptions & CredentialPersistenceOptions & OnBehalfOfCredentialSecretOptions) = this()
  
  /* private */ var additionallyAllowedTenantIds: Any = js.native
  
  /* private */ var msalFlow: Any = js.native
  
  /* private */ var options: Any = js.native
  
  /* private */ var tenantId: Any = js.native
}
