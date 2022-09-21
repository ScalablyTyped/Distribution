package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredentialPersistenceOptions extends StObject {
  
  /**
    * Options to provide to the persistence layer (if one is available) when
    * storing credentials.
    *
    * You must first register a persistence provider plugin. See the
    * `@azure/identity-cache-persistence` package on NPM.
    *
    * Example:
    *
    * ```javascript
    * import { cachePersistencePlugin } from "@azure/identity-cache-persistence";
    * import { useIdentityPlugin, DeviceCodeCredential } from "@azure/identity";
    *
    * useIdentityPlugin(cachePersistencePlugin);
    *
    * async function main() {
    *   const credential = new DeviceCodeCredential({
    *     tokenCachePersistenceOptions: {
    *       enabled: true
    *     }
    *   });
    * }
    *
    * main().catch((error) => {
    *   console.error("An error occurred:", error);
    *   process.exit(1);
    * });
    * ```
    */
  var tokenCachePersistenceOptions: js.UndefOr[TokenCachePersistenceOptions] = js.undefined
}
object CredentialPersistenceOptions {
  
  inline def apply(): CredentialPersistenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialPersistenceOptions]
  }
  
  extension [Self <: CredentialPersistenceOptions](x: Self) {
    
    inline def setTokenCachePersistenceOptions(value: TokenCachePersistenceOptions): Self = StObject.set(x, "tokenCachePersistenceOptions", value.asInstanceOf[js.Any])
    
    inline def setTokenCachePersistenceOptionsUndefined: Self = StObject.set(x, "tokenCachePersistenceOptions", js.undefined)
  }
}
