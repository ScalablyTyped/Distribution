package typings.chrome

import typings.chrome.chromeNs.identityNs.AccountInfo
import typings.chrome.chromeNs.identityNs.SignInChangeEvent
import typings.chrome.chromeNs.identityNs.TokenDetails
import typings.chrome.chromeNs.identityNs.TokenInformation
import typings.chrome.chromeNs.identityNs.UserInfo
import typings.chrome.chromeNs.identityNs.WebAuthFlowOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofidentity extends js.Object {
  var onSignInChanged: SignInChangeEvent = js.native
  def getAccounts(callback: js.Function1[/* accounts */ js.Array[AccountInfo], Unit]): Unit = js.native
  def getAuthToken(details: TokenDetails): Unit = js.native
  def getAuthToken(details: TokenDetails, callback: js.Function1[/* token */ String, Unit]): Unit = js.native
  def getProfileUserInfo(callback: js.Function1[/* userInfo */ UserInfo, Unit]): Unit = js.native
  def getRedirectURL(): String = js.native
  def getRedirectURL(path: String): String = js.native
  def launchWebAuthFlow(details: WebAuthFlowOptions, callback: js.Function1[/* responseUrl */ js.UndefOr[String], Unit]): Unit = js.native
  def removeCachedAuthToken(details: TokenInformation): Unit = js.native
  def removeCachedAuthToken(details: TokenInformation, callback: js.Function0[Unit]): Unit = js.native
}

