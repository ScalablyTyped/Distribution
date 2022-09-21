package typings.azureMsalBrowser.browserConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApiId extends StObject
@JSImport("@azure/msal-browser/dist/utils/BrowserConstants", "ApiId")
@js.native
object ApiId extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApiId & Double] = js.native
  
  @js.native
  sealed trait acquireTokenByCode
    extends StObject
       with ApiId
  /* 866 */ val acquireTokenByCode: typings.azureMsalBrowser.browserConstantsMod.ApiId.acquireTokenByCode & Double = js.native
  
  @js.native
  sealed trait acquireTokenPopup
    extends StObject
       with ApiId
  /* 862 */ val acquireTokenPopup: typings.azureMsalBrowser.browserConstantsMod.ApiId.acquireTokenPopup & Double = js.native
  
  @js.native
  sealed trait acquireTokenRedirect
    extends StObject
       with ApiId
  /* 861 */ val acquireTokenRedirect: typings.azureMsalBrowser.browserConstantsMod.ApiId.acquireTokenRedirect & Double = js.native
  
  @js.native
  sealed trait acquireTokenSilent_authCode
    extends StObject
       with ApiId
  /* 864 */ val acquireTokenSilent_authCode: typings.azureMsalBrowser.browserConstantsMod.ApiId.acquireTokenSilent_authCode & Double = js.native
  
  @js.native
  sealed trait acquireTokenSilent_silentFlow
    extends StObject
       with ApiId
  /* 61 */ val acquireTokenSilent_silentFlow: typings.azureMsalBrowser.browserConstantsMod.ApiId.acquireTokenSilent_silentFlow & Double = js.native
  
  @js.native
  sealed trait handleRedirectPromise
    extends StObject
       with ApiId
  /* 865 */ val handleRedirectPromise: typings.azureMsalBrowser.browserConstantsMod.ApiId.handleRedirectPromise & Double = js.native
  
  @js.native
  sealed trait logout
    extends StObject
       with ApiId
  /* 961 */ val logout: typings.azureMsalBrowser.browserConstantsMod.ApiId.logout & Double = js.native
  
  @js.native
  sealed trait logoutPopup
    extends StObject
       with ApiId
  /* 962 */ val logoutPopup: typings.azureMsalBrowser.browserConstantsMod.ApiId.logoutPopup & Double = js.native
  
  @js.native
  sealed trait ssoSilent
    extends StObject
       with ApiId
  /* 863 */ val ssoSilent: typings.azureMsalBrowser.browserConstantsMod.ApiId.ssoSilent & Double = js.native
}
