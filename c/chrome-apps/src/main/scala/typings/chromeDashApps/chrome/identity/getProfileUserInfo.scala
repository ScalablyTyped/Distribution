package typings.chromeDashApps.chrome.identity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.identity.getProfileUserInfo")
@js.native
object getProfileUserInfo extends js.Object {
  /**
    * Retrieves email address and obfuscated gaia id of the user signed into a profile.
    * This API is different from identity.getAccounts in two ways.
    * The information returned is available offline, and it only applies to the primary account for the profile.
    * @since Chrome 37.
    */
  def apply(callback: js.Function1[/* userInfo */ UserInfo, Unit]): Unit = js.native
}

