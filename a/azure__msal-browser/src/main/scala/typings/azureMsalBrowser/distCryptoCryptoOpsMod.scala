package typings.azureMsalBrowser

import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.mod.Logger
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCryptoCryptoOpsMod {
  
  @JSImport("@azure/msal-browser/dist/crypto/CryptoOps", "CryptoOps")
  @js.native
  open class CryptoOps protected ()
    extends StObject
       with ICrypto {
    def this(logger: Logger) = this()
    def this(logger: Logger, performanceClient: IPerformanceClient) = this()
    
    /* private */ var b64Decode: Any = js.native
    
    /* private */ var b64Encode: Any = js.native
    
    /* private */ var browserCrypto: Any = js.native
    
    /* private */ var cache: Any = js.native
    
    /* private */ var guidGenerator: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /**
      * CryptoOps can be used in contexts outside a PCA instance,
      * meaning there won't be a performance manager available.
      */
    /* private */ var performanceClient: Any = js.native
    
    /* private */ var pkceGenerator: Any = js.native
  }
  /* static members */
  object CryptoOps {
    
    @JSImport("@azure/msal-browser/dist/crypto/CryptoOps", "CryptoOps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-browser/dist/crypto/CryptoOps", "CryptoOps.EXTRACTABLE")
    @js.native
    def EXTRACTABLE: Any = js.native
    inline def EXTRACTABLE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXTRACTABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/crypto/CryptoOps", "CryptoOps.POP_KEY_USAGES")
    @js.native
    def POP_KEY_USAGES: Any = js.native
    inline def POP_KEY_USAGES_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POP_KEY_USAGES")(x.asInstanceOf[js.Any])
  }
  
  trait CachedKeyPair extends StObject {
    
    var privateKey: CryptoKey
    
    var publicKey: CryptoKey
    
    var requestMethod: js.UndefOr[String] = js.undefined
    
    var requestUri: js.UndefOr[String] = js.undefined
  }
  object CachedKeyPair {
    
    inline def apply(privateKey: CryptoKey, publicKey: CryptoKey): CachedKeyPair = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachedKeyPair]
    }
    
    extension [Self <: CachedKeyPair](x: Self) {
      
      inline def setPrivateKey(value: CryptoKey): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: CryptoKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setRequestMethod(value: String): Self = StObject.set(x, "requestMethod", value.asInstanceOf[js.Any])
      
      inline def setRequestMethodUndefined: Self = StObject.set(x, "requestMethod", js.undefined)
      
      inline def setRequestUri(value: String): Self = StObject.set(x, "requestUri", value.asInstanceOf[js.Any])
      
      inline def setRequestUriUndefined: Self = StObject.set(x, "requestUri", js.undefined)
    }
  }
}
