package typings.azureMsalBrowser

import typings.azureMsalBrowser.browserCacheManagerMod.BrowserCacheManager
import typings.azureMsalBrowser.inavigationclientMod.INavigationClient
import typings.azureMsalBrowser.interactionHandlerMod.InteractionHandler
import typings.azureMsalCommon.commonAuthorizationCodeRequestMod.CommonAuthorizationCodeRequest
import typings.azureMsalCommon.icryptoMod.ICrypto
import typings.azureMsalCommon.mod.AuthorizationCodeClient
import typings.azureMsalCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redirectHandlerMod {
  
  @JSImport("@azure/msal-browser/dist/interaction_handler/RedirectHandler", "RedirectHandler")
  @js.native
  open class RedirectHandler protected () extends InteractionHandler {
    def this(
      authCodeModule: AuthorizationCodeClient,
      storageImpl: BrowserCacheManager,
      authCodeRequest: CommonAuthorizationCodeRequest,
      logger: Logger,
      browserCrypto: ICrypto
    ) = this()
    
    /* private */ var browserCrypto: Any = js.native
    
    /**
      * Redirects window to given URL.
      * @param urlNavigate
      */
    def initiateAuthRequest(requestUrl: String, params: RedirectParams): js.Promise[Unit] = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Lifted 0 members from Set(@azure/msal-browser.@azure/msal-browser/dist/interaction_handler/InteractionHandler.InteractionParams) */ trait RedirectParams extends StObject {
    
    var navigationClient: INavigationClient
    
    var onRedirectNavigate: js.UndefOr[js.Function1[/* url */ String, Unit | Boolean]] = js.undefined
    
    var redirectStartPage: String
    
    var redirectTimeout: Double
  }
  object RedirectParams {
    
    inline def apply(navigationClient: INavigationClient, redirectStartPage: String, redirectTimeout: Double): RedirectParams = {
      val __obj = js.Dynamic.literal(navigationClient = navigationClient.asInstanceOf[js.Any], redirectStartPage = redirectStartPage.asInstanceOf[js.Any], redirectTimeout = redirectTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedirectParams]
    }
    
    extension [Self <: RedirectParams](x: Self) {
      
      inline def setNavigationClient(value: INavigationClient): Self = StObject.set(x, "navigationClient", value.asInstanceOf[js.Any])
      
      inline def setOnRedirectNavigate(value: /* url */ String => Unit | Boolean): Self = StObject.set(x, "onRedirectNavigate", js.Any.fromFunction1(value))
      
      inline def setOnRedirectNavigateUndefined: Self = StObject.set(x, "onRedirectNavigate", js.undefined)
      
      inline def setRedirectStartPage(value: String): Self = StObject.set(x, "redirectStartPage", value.asInstanceOf[js.Any])
      
      inline def setRedirectTimeout(value: Double): Self = StObject.set(x, "redirectTimeout", value.asInstanceOf[js.Any])
    }
  }
}
