package typings.azureMsalBrowser.distUtilsBrowserConstantsMod

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
  /* 866 */ val acquireTokenByCode: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId.acquireTokenByCode & Double = js.native
  
  @js.native
  sealed trait acquireTokenPopup
    extends StObject
       with ApiId
  /* 862 */ val acquireTokenPopup: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId.acquireTokenPopup & Double = js.native
  
  @js.native
  sealed trait acquireTokenRedirect
    extends StObject
       with ApiId
  /* 861 */ val acquireTokenRedirect: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId.acquireTokenRedirect & Double = js.native
  
  @js.native
  sealed trait acquireTokenSilent_authCode
    extends StObject
       with ApiId
  /* 864 */ val acquireTokenSilent_authCode: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId.acquireTokenSilent_authCode & Double = js.native
  
  @js.native
  sealed trait acquireTokenSilent_silentFlow
    extends StObject
       with ApiId
  /* 61 */ val acquireTokenSilent_silentFlow: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId.acquireTokenSilent_silentFlow & Double = js.native
  
  @js.native
  sealed trait handleRedirectPromise
    extends StObject
       with ApiId
  /* 865 */ val handleRedirectPromise: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId.handleRedirectPromise & Double = js.native
  
  @js.native
  sealed trait logout
    extends StObject
       with ApiId
  /* 961 */ val logout: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId.logout & Double = js.native
  
  @js.native
  sealed trait logoutPopup
    extends StObject
       with ApiId
  /* 962 */ val logoutPopup: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId.logoutPopup & Double = js.native
  
  @js.native
  sealed trait ssoSilent
    extends StObject
       with ApiId
  /* 863 */ val ssoSilent: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId.ssoSilent & Double = js.native
}
