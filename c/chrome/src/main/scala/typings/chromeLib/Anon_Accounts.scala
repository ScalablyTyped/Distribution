package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Accounts extends js.Object {
  var onSignInChanged: chromeLib.chromeNs.identityNs.SignInChangeEvent = js.native
  def getAccounts(
    callback: js.Function1[/* accounts */ js.Array[chromeLib.chromeNs.identityNs.AccountInfo], scala.Unit]
  ): scala.Unit = js.native
  def getAuthToken(details: chromeLib.chromeNs.identityNs.TokenDetails): scala.Unit = js.native
  def getAuthToken(
    details: chromeLib.chromeNs.identityNs.TokenDetails,
    callback: js.Function1[/* token */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getProfileUserInfo(callback: js.Function1[/* userInfo */ chromeLib.chromeNs.identityNs.UserInfo, scala.Unit]): scala.Unit = js.native
  def getRedirectURL(): java.lang.String = js.native
  def getRedirectURL(path: java.lang.String): java.lang.String = js.native
  def launchWebAuthFlow(
    details: chromeLib.chromeNs.identityNs.WebAuthFlowOptions,
    callback: js.Function1[/* responseUrl */ js.UndefOr[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def removeCachedAuthToken(details: chromeLib.chromeNs.identityNs.TokenInformation): scala.Unit = js.native
  def removeCachedAuthToken(details: chromeLib.chromeNs.identityNs.TokenInformation, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

