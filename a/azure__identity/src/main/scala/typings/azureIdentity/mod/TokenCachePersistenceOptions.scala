package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenCachePersistenceOptions extends StObject {
  
  /**
    * If set to true, persistent token caching will be enabled for this credential instance.
    */
  var enabled: Boolean
  
  /**
    * Unique identifier for the persistent token cache.
    *
    * Based on this identifier, the persistence file will be located in any of the following places:
    * - Darwin: '/Users/user/.IdentityService/<name>'
    * - Windows 8+: 'C:\\Users\\\user\\AppData\\Local\\.IdentityService\\<name>'
    * - Linux: '/home/user/.IdentityService/<name>'
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * If set to true, the cache will be stored without encryption if no OS level user encryption is available.
    * When set to false, the PersistentTokenCache will throw an error if no OS level user encryption is available.
    */
  var unsafeAllowUnencryptedStorage: js.UndefOr[Boolean] = js.undefined
}
object TokenCachePersistenceOptions {
  
  inline def apply(enabled: Boolean): TokenCachePersistenceOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenCachePersistenceOptions]
  }
  
  extension [Self <: TokenCachePersistenceOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUnsafeAllowUnencryptedStorage(value: Boolean): Self = StObject.set(x, "unsafeAllowUnencryptedStorage", value.asInstanceOf[js.Any])
    
    inline def setUnsafeAllowUnencryptedStorageUndefined: Self = StObject.set(x, "unsafeAllowUnencryptedStorage", js.undefined)
  }
}
