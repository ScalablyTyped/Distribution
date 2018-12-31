package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Requiredplatformversion extends js.Object {
  /**
    * If the key is specified and its value is true, it allows the app to
    * be always updated regardless of whether the underlying platform is
    * compliant or not. If the value is false or the key is not specified,
    * the required platform version is respected and the app update is
    * deferred until the underlying platform becomes compliant.
    */
  var always_update: js.UndefOr[scala.Boolean] = js.undefined
  var required_platform_version: js.UndefOr[java.lang.String] = js.undefined
}

