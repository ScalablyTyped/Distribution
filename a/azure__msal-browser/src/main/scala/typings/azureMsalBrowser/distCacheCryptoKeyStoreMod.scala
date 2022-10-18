package typings.azureMsalBrowser

import typings.azureMsalBrowser.distCacheAsyncMemoryStorageMod.AsyncMemoryStorage
import typings.azureMsalBrowser.distCryptoCryptoOpsMod.CachedKeyPair
import typings.azureMsalCommon.mod.Logger
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheCryptoKeyStoreMod {
  
  @JSImport("@azure/msal-browser/dist/cache/CryptoKeyStore", "CryptoKeyStore")
  @js.native
  open class CryptoKeyStore protected () extends StObject {
    def this(logger: Logger) = this()
    
    var asymmetricKeys: AsyncMemoryStorage[CachedKeyPair] = js.native
    
    def clear(): js.Promise[Boolean] = js.native
    
    var logger: Logger = js.native
    
    var symmetricKeys: AsyncMemoryStorage[CryptoKey] = js.native
  }
  
  @js.native
  sealed trait CryptoKeyStoreNames extends StObject
  @JSImport("@azure/msal-browser/dist/cache/CryptoKeyStore", "CryptoKeyStoreNames")
  @js.native
  object CryptoKeyStoreNames extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CryptoKeyStoreNames & String] = js.native
    
    @js.native
    sealed trait asymmetricKeys
      extends StObject
         with CryptoKeyStoreNames
    /* "asymmetricKeys" */ val asymmetricKeys: typings.azureMsalBrowser.distCacheCryptoKeyStoreMod.CryptoKeyStoreNames.asymmetricKeys & String = js.native
    
    @js.native
    sealed trait symmetricKeys
      extends StObject
         with CryptoKeyStoreNames
    /* "symmetricKeys" */ val symmetricKeys: typings.azureMsalBrowser.distCacheCryptoKeyStoreMod.CryptoKeyStoreNames.symmetricKeys & String = js.native
  }
}
