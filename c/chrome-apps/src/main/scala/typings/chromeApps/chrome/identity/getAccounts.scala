package typings.chromeApps.chrome.identity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.identity.getAccounts")
@js.native
object getAccounts extends js.Object {
  /**
    * @requires(dev) **Dev channel only.**
    * @description
    * Retrieves a list of AccountInfo objects describing the accounts present on the profile.
    * getAccounts is only supported on dev channel.
    */
  def apply(callback: js.Function1[/* accounts */ js.Array[AccountInfo], Unit]): Unit = js.native
}

