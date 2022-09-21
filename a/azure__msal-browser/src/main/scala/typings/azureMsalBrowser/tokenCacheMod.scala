package typings.azureMsalBrowser

import typings.azureMsalBrowser.browserCacheManagerMod.BrowserCacheManager
import typings.azureMsalBrowser.configurationMod.BrowserConfiguration
import typings.azureMsalBrowser.itokencacheMod.ITokenCache
import typings.azureMsalBrowser.silentRequestMod.SilentRequest
import typings.azureMsalCommon.externalTokenResponseMod.ExternalTokenResponse
import typings.azureMsalCommon.icryptoMod.ICrypto
import typings.azureMsalCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenCacheMod {
  
  @JSImport("@azure/msal-browser/dist/cache/TokenCache", "TokenCache")
  @js.native
  open class TokenCache protected ()
    extends StObject
       with ITokenCache {
    def this(
      configuration: BrowserConfiguration,
      storage: BrowserCacheManager,
      logger: Logger,
      cryptoObj: ICrypto
    ) = this()
    
    /* protected */ var config: BrowserConfiguration = js.native
    
    /* private */ var cryptoObj: Any = js.native
    
    var isBrowserEnvironment: Boolean = js.native
    
    /**
      * Helper function to load access tokens to msal-browser cache
      * @param request
      * @param response
      * @param options
      * @param homeAccountId
      * @param environment
      * @param tenantId
      * @returns
      */
    /* private */ var loadAccessToken: Any = js.native
    
    /** API to side-load tokens to MSAL cache */
    /* CompleteClass */
    override def loadExternalTokens(request: SilentRequest, response: ExternalTokenResponse, options: LoadTokenOptions): Unit = js.native
    
    /**
      * Helper function to load id tokens to msal-browser cache
      * @param idToken
      * @param homeAccountId
      * @param environment
      * @param tenantId
      * @param options
      */
    /* private */ var loadIdToken: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /* private */ var storage: Any = js.native
  }
  
  trait LoadTokenOptions extends StObject {
    
    var clientInfo: js.UndefOr[String] = js.undefined
    
    var expiresOn: js.UndefOr[Double] = js.undefined
    
    var extendedExpiresOn: js.UndefOr[Double] = js.undefined
  }
  object LoadTokenOptions {
    
    inline def apply(): LoadTokenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadTokenOptions]
    }
    
    extension [Self <: LoadTokenOptions](x: Self) {
      
      inline def setClientInfo(value: String): Self = StObject.set(x, "clientInfo", value.asInstanceOf[js.Any])
      
      inline def setClientInfoUndefined: Self = StObject.set(x, "clientInfo", js.undefined)
      
      inline def setExpiresOn(value: Double): Self = StObject.set(x, "expiresOn", value.asInstanceOf[js.Any])
      
      inline def setExpiresOnUndefined: Self = StObject.set(x, "expiresOn", js.undefined)
      
      inline def setExtendedExpiresOn(value: Double): Self = StObject.set(x, "extendedExpiresOn", value.asInstanceOf[js.Any])
      
      inline def setExtendedExpiresOnUndefined: Self = StObject.set(x, "extendedExpiresOn", js.undefined)
    }
  }
}
