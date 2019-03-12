package typings
package chromeLib.chromeNs.identityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.identity")
@js.native
object ^ extends js.Object {
  var onSignInChanged: SignInChangeEvent = js.native
  def getAccounts(callback: js.Function1[/* accounts */ js.Array[AccountInfo], scala.Unit]): scala.Unit = js.native
  def getAuthToken(details: TokenDetails): scala.Unit = js.native
  def getAuthToken(details: TokenDetails, callback: js.Function1[/* token */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getProfileUserInfo(callback: js.Function1[/* userInfo */ UserInfo, scala.Unit]): scala.Unit = js.native
  def getRedirectURL(): java.lang.String = js.native
  def getRedirectURL(path: java.lang.String): java.lang.String = js.native
  def launchWebAuthFlow(
    details: WebAuthFlowOptions,
    callback: js.Function1[/* responseUrl */ js.UndefOr[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def removeCachedAuthToken(details: TokenInformation): scala.Unit = js.native
  def removeCachedAuthToken(details: TokenInformation, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

