package typings.chrome.chromeNs.identityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.identity")
@js.native
object ^ extends js.Object {
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

