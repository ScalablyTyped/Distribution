package typings.chrome.anon

import typings.chrome.chrome.identity.AccountInfo
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
  
  def getAccounts(callback: js.Function1[/* accounts */ js.Array[AccountInfo], Unit]): Unit = js.native
  
  def getAuthToken(details: TokenDetails): Unit = js.native
  def getAuthToken(details: TokenDetails, callback: js.Function1[/* token */ String, Unit]): Unit = js.native
  
  def getProfileUserInfo(callback: js.Function1[/* userInfo */ UserInfo, Unit]): Unit = js.native
  
  def getRedirectURL(): String = js.native
  def getRedirectURL(path: String): String = js.native
  
  def launchWebAuthFlow(details: WebAuthFlowOptions, callback: js.Function1[/* responseUrl */ js.UndefOr[String], Unit]): Unit = js.native
  
  var onSignInChanged: SignInChangeEvent = js.native
  
  def removeCachedAuthToken(details: TokenInformation): Unit = js.native
  def removeCachedAuthToken(details: TokenInformation, callback: js.Function0[Unit]): Unit = js.native
}
