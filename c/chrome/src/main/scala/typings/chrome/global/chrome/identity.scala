package typings.chrome.global.chrome

import typings.chrome.chrome.identity.AccountInfo
import typings.chrome.chrome.identity.SignInChangeEvent
import typings.chrome.chrome.identity.TokenDetails
import typings.chrome.chrome.identity.TokenInformation
import typings.chrome.chrome.identity.UserInfo
import typings.chrome.chrome.identity.WebAuthFlowOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Identity
////////////////////
/**
  * Use the chrome.identity API to get OAuth2 access tokens.
  * Permissions:  "identity"
  * @since Chrome 29.
  */
object identity {
  
  @JSGlobal("chrome.identity")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAccounts(callback: js.Function1[/* accounts */ js.Array[AccountInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccounts")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getAuthToken(details: TokenDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthToken")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getAuthToken(details: TokenDetails, callback: js.Function1[/* token */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getAuthToken")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getProfileUserInfo(callback: js.Function1[/* userInfo */ UserInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getProfileUserInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getRedirectURL(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectURL")().asInstanceOf[String]
  inline def getRedirectURL(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectURL")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def launchWebAuthFlow(details: WebAuthFlowOptions, callback: js.Function1[/* responseUrl */ js.UndefOr[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("launchWebAuthFlow")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.identity.onSignInChanged")
  @js.native
  def onSignInChanged: SignInChangeEvent = js.native
  inline def onSignInChanged_=(x: SignInChangeEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSignInChanged")(x.asInstanceOf[js.Any])
  
  inline def removeCachedAuthToken(details: TokenInformation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCachedAuthToken")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeCachedAuthToken(details: TokenInformation, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCachedAuthToken")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
