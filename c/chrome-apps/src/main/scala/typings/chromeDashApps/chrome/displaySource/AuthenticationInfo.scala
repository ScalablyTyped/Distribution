package typings.chromeDashApps.chrome.displaySource

import typings.chromeDashApps.Anon_PBC
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chromeDashAppsStrings.PBC
import typings.chromeDashApps.chromeDashAppsStrings.PIN
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
  var method: js.UndefOr[ToStringLiteral[Anon_PBC, String, Exclude[String, PBC | PIN]]] = js.undefined
}

object AuthenticationInfo {
  @scala.inline
  def apply(data: String = null, method: ToStringLiteral[Anon_PBC, String, Exclude[String, PBC | PIN]] = null): AuthenticationInfo = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationInfo]
  }
}

