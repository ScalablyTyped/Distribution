package typings.chrome.global.chrome

import typings.chrome.chrome.identity.AccountInfo
import typings.chrome.chrome.identity.SignInChangeEvent
import typings.chrome.chrome.identity.TokenDetails
import typings.chrome.chrome.identity.TokenInformation
import typings.chrome.chrome.identity.UserInfo
import typings.chrome.chrome.identity.WebAuthFlowOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @JSGlobal("chrome.identity.getAccounts")
  @js.native
  def getAccounts(callback: js.Function1[/* accounts */ js.Array[AccountInfo], Unit]): Unit = js.native
  
  @JSGlobal("chrome.identity.getAuthToken")
  @js.native
  def getAuthToken(details: TokenDetails): Unit = js.native
  @JSGlobal("chrome.identity.getAuthToken")
  @js.native
  def getAuthToken(details: TokenDetails, callback: js.Function1[/* token */ String, Unit]): Unit = js.native
  
  @JSGlobal("chrome.identity.getProfileUserInfo")
  @js.native
  def getProfileUserInfo(callback: js.Function1[/* userInfo */ UserInfo, Unit]): Unit = js.native
  
  @JSGlobal("chrome.identity.getRedirectURL")
  @js.native
  def getRedirectURL(): String = js.native
  @JSGlobal("chrome.identity.getRedirectURL")
  @js.native
  def getRedirectURL(path: String): String = js.native
  
  @JSGlobal("chrome.identity.launchWebAuthFlow")
  @js.native
  def launchWebAuthFlow(details: WebAuthFlowOptions, callback: js.Function1[/* responseUrl */ js.UndefOr[String], Unit]): Unit = js.native
  
  @JSGlobal("chrome.identity.onSignInChanged")
  @js.native
  def onSignInChanged: SignInChangeEvent = js.native
  @scala.inline
  def onSignInChanged_=(x: SignInChangeEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSignInChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.identity.removeCachedAuthToken")
  @js.native
  def removeCachedAuthToken(details: TokenInformation): Unit = js.native
  @JSGlobal("chrome.identity.removeCachedAuthToken")
  @js.native
  def removeCachedAuthToken(details: TokenInformation, callback: js.Function0[Unit]): Unit = js.native
}
