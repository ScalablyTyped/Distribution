package typings
package chromeDashAppsLib.chromeNs.displaySourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationInfo extends js.Object {
  /**
    * Authentication data (e.g. PIN value).
    */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Authentication method.
    * @see AuthenticationMethod
    */
  var method: js.UndefOr[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_PBC, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.PBC | chromeDashAppsLib.chromeDashAppsLibStrings.PIN
      ]
    ]
  ] = js.undefined
}

object AuthenticationInfo {
  @scala.inline
  def apply(
    data: java.lang.String = null,
    method: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_PBC, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.PBC | chromeDashAppsLib.chromeDashAppsLibStrings.PIN
      ]
    ] = null
  ): AuthenticationInfo = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationInfo]
  }
}

