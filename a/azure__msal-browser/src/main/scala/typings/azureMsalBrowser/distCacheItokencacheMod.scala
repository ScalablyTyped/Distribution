package typings.azureMsalBrowser

import typings.azureMsalBrowser.distCacheTokenCacheMod.LoadTokenOptions
import typings.azureMsalBrowser.distRequestSilentRequestMod.SilentRequest
import typings.azureMsalCommon.distResponseExternalTokenResponseMod.ExternalTokenResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheItokencacheMod {
  
  trait ITokenCache extends StObject {
    
    /** API to side-load tokens to MSAL cache */
    def loadExternalTokens(request: SilentRequest, response: ExternalTokenResponse, options: LoadTokenOptions): Unit
  }
  object ITokenCache {
    
    inline def apply(loadExternalTokens: (SilentRequest, ExternalTokenResponse, LoadTokenOptions) => Unit): ITokenCache = {
      val __obj = js.Dynamic.literal(loadExternalTokens = js.Any.fromFunction3(loadExternalTokens))
      __obj.asInstanceOf[ITokenCache]
    }
    
    extension [Self <: ITokenCache](x: Self) {
      
      inline def setLoadExternalTokens(value: (SilentRequest, ExternalTokenResponse, LoadTokenOptions) => Unit): Self = StObject.set(x, "loadExternalTokens", js.Any.fromFunction3(value))
    }
  }
}
