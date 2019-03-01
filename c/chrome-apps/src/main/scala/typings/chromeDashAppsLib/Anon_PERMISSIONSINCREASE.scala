package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PERMISSIONSINCREASE extends js.Object {
  var PERMISSIONS_INCREASE: chromeDashAppsLib.chromeDashAppsLibStrings.permissions_increase
  var UNKNOWN: chromeDashAppsLib.chromeDashAppsLibStrings.unknown
}

object Anon_PERMISSIONSINCREASE {
  @scala.inline
  def apply(
    PERMISSIONS_INCREASE: chromeDashAppsLib.chromeDashAppsLibStrings.permissions_increase,
    UNKNOWN: chromeDashAppsLib.chromeDashAppsLibStrings.unknown
  ): Anon_PERMISSIONSINCREASE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PERMISSIONS_INCREASE")(PERMISSIONS_INCREASE)
    __obj.updateDynamic("UNKNOWN")(UNKNOWN)
    __obj.asInstanceOf[Anon_PERMISSIONSINCREASE]
  }
}

