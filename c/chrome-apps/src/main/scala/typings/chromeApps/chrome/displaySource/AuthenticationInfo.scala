package typings.chromeApps.chrome.displaySource

import typings.chromeApps.AnonPBC
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.PBC
import typings.chromeApps.chromeAppsStrings.PIN
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationInfo extends js.Object {
  /**
    * Authentication data (e.g. PIN value).
    */
  var data: js.UndefOr[String] = js.undefined
  /**
    * Authentication method.
    * @see AuthenticationMethod
    */
  var method: js.UndefOr[ToStringLiteral[AnonPBC, PBC | PIN, Exclude[PBC | PIN, PBC | PIN]]] = js.undefined
}

object AuthenticationInfo {
  @scala.inline
  def apply(
    data: String = null,
    method: ToStringLiteral[AnonPBC, PBC | PIN, Exclude[PBC | PIN, PBC | PIN]] = null
  ): AuthenticationInfo = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationInfo]
  }
}

