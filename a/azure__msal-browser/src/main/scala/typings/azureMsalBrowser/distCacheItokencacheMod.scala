package typings.azureMsalBrowser

import typings.azureMsalBrowser.distCacheTokenCacheMod.LoadTokenOptions
import typings.azureMsalBrowser.distRequestSilentRequestMod.SilentRequest
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.distResponseExternalTokenResponseMod.ExternalTokenResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheItokencacheMod {
  
  trait ITokenCache extends StObject {
    
    /**
      * API to side-load tokens to MSAL cache
      * @returns `AuthenticationResult` for the response that was loaded.
      */
    def loadExternalTokens(request: SilentRequest, response: ExternalTokenResponse, options: LoadTokenOptions): AuthenticationResult
  }
  object ITokenCache {
    
    inline def apply(
      loadExternalTokens: (SilentRequest, ExternalTokenResponse, LoadTokenOptions) => AuthenticationResult
    ): ITokenCache = {
      val __obj = js.Dynamic.literal(loadExternalTokens = js.Any.fromFunction3(loadExternalTokens))
      __obj.asInstanceOf[ITokenCache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITokenCache] (val x: Self) extends AnyVal {
      
      inline def setLoadExternalTokens(value: (SilentRequest, ExternalTokenResponse, LoadTokenOptions) => AuthenticationResult): Self = StObject.set(x, "loadExternalTokens", js.Any.fromFunction3(value))
    }
  }
}
