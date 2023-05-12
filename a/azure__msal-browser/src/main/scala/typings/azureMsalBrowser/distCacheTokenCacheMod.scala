package typings.azureMsalBrowser

import typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
import typings.azureMsalBrowser.distCacheItokencacheMod.ITokenCache
import typings.azureMsalBrowser.distConfigConfigurationMod.BrowserConfiguration
import typings.azureMsalBrowser.distRequestSilentRequestMod.SilentRequest
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.distResponseExternalTokenResponseMod.ExternalTokenResponse
import typings.azureMsalCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheTokenCacheMod {
  
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
    
    /**
      * Helper function to generate an `AuthenticationResult` for the result.
      * @param request
      * @param idTokenObj
      * @param cacheRecord
      * @param authority
      * @returns `AuthenticationResult`
      */
    /* private */ var generateAuthenticationResult: Any = js.native
    
    var isBrowserEnvironment: Boolean = js.native
    
    /**
      * Helper function to load access tokens to msal-browser cache
      * @param request
      * @param response
      * @param homeAccountId
      * @param environment
      * @param tenantId
      * @returns `AccessTokenEntity`
      */
    /* private */ var loadAccessToken: Any = js.native
    
    /**
      * Helper function to load account to msal-browser cache
      * @param idToken
      * @param environment
      * @param clientInfo
      * @param authorityType
      * @param requestHomeAccountId
      * @returns `AccountEntity`
      */
    /* private */ var loadAccount: Any = js.native
    
    /**
      * API to side-load tokens to MSAL cache
      * @returns `AuthenticationResult` for the response that was loaded.
      */
    /* CompleteClass */
    override def loadExternalTokens(request: SilentRequest, response: ExternalTokenResponse, options: LoadTokenOptions): AuthenticationResult = js.native
    
    /**
      * Helper function to load id tokens to msal-browser cache
      * @param idToken
      * @param homeAccountId
      * @param environment
      * @param tenantId
      * @returns `IdTokenEntity`
      */
    /* private */ var loadIdToken: Any = js.native
    
    /**
      * Helper function to load refresh tokens to msal-browser cache
      * @param request
      * @param response
      * @param homeAccountId
      * @param environment
      * @returns `RefreshTokenEntity`
      */
    /* private */ var loadRefreshToken: Any = js.native
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadTokenOptions] (val x: Self) extends AnyVal {
      
      inline def setClientInfo(value: String): Self = StObject.set(x, "clientInfo", value.asInstanceOf[js.Any])
      
      inline def setClientInfoUndefined: Self = StObject.set(x, "clientInfo", js.undefined)
      
      inline def setExpiresOn(value: Double): Self = StObject.set(x, "expiresOn", value.asInstanceOf[js.Any])
      
      inline def setExpiresOnUndefined: Self = StObject.set(x, "expiresOn", js.undefined)
      
      inline def setExtendedExpiresOn(value: Double): Self = StObject.set(x, "extendedExpiresOn", value.asInstanceOf[js.Any])
      
      inline def setExtendedExpiresOnUndefined: Self = StObject.set(x, "extendedExpiresOn", js.undefined)
    }
  }
}
