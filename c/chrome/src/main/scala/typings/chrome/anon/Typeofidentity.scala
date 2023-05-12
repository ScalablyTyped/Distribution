package typings.chrome.anon

import typings.chrome.chrome.identity.AccountInfo
import typings.chrome.chrome.identity.GetAuthTokenResult
import typings.chrome.chrome.identity.ProfileDetails
import typings.chrome.chrome.identity.SignInChangeEvent
import typings.chrome.chrome.identity.TokenDetails
import typings.chrome.chrome.identity.TokenInformation
import typings.chrome.chrome.identity.UserInfo
import typings.chrome.chrome.identity.WebAuthFlowOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofidentity extends StObject {
  
  def clearAllCachedAuthTokens(): js.Promise[Unit] = js.native
  def clearAllCachedAuthTokens(callback: js.Function0[Unit]): Unit = js.native
  
  def getAccounts(): js.Promise[js.Array[AccountInfo]] = js.native
  def getAccounts(callback: js.Function1[/* accounts */ js.Array[AccountInfo], Unit]): Unit = js.native
  
  def getAuthToken(details: TokenDetails): js.Promise[GetAuthTokenResult] = js.native
  def getAuthToken(
    details: TokenDetails,
    callback: js.Function2[
      /* token */ js.UndefOr[String], 
      /* grantedScopes */ js.UndefOr[js.Array[String]], 
      Unit
    ]
  ): Unit = js.native
  
  def getProfileUserInfo(callback: js.Function1[/* userInfo */ UserInfo, Unit]): Unit = js.native
  def getProfileUserInfo(details: ProfileDetails): js.Promise[UserInfo] = js.native
  def getProfileUserInfo(details: ProfileDetails, callback: js.Function1[/* userInfo */ UserInfo, Unit]): Unit = js.native
  
  def getRedirectURL(): String = js.native
  def getRedirectURL(path: String): String = js.native
  
  def launchWebAuthFlow(details: WebAuthFlowOptions): js.Promise[js.UndefOr[String]] = js.native
  def launchWebAuthFlow(details: WebAuthFlowOptions, callback: js.Function1[/* responseUrl */ js.UndefOr[String], Unit]): Unit = js.native
  
  var onSignInChanged: SignInChangeEvent = js.native
  
  def removeCachedAuthToken(details: TokenInformation): js.Promise[Unit] = js.native
  def removeCachedAuthToken(details: TokenInformation, callback: js.Function0[Unit]): Unit = js.native
}
