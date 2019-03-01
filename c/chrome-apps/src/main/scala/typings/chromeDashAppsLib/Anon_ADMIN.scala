package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ADMIN extends js.Object {
  var ADMIN: chromeDashAppsLib.chromeDashAppsLibStrings.admin
  var DEVELOPMENT: chromeDashAppsLib.chromeDashAppsLibStrings.development
  var NORMAL: chromeDashAppsLib.chromeDashAppsLibStrings.normal
  var OTHER: chromeDashAppsLib.chromeDashAppsLibStrings.other
  var SIDELOAD: chromeDashAppsLib.chromeDashAppsLibStrings.sideload
}

object Anon_ADMIN {
  @scala.inline
  def apply(
    ADMIN: chromeDashAppsLib.chromeDashAppsLibStrings.admin,
    DEVELOPMENT: chromeDashAppsLib.chromeDashAppsLibStrings.development,
    NORMAL: chromeDashAppsLib.chromeDashAppsLibStrings.normal,
    OTHER: chromeDashAppsLib.chromeDashAppsLibStrings.other,
    SIDELOAD: chromeDashAppsLib.chromeDashAppsLibStrings.sideload
  ): Anon_ADMIN = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ADMIN")(ADMIN)
    __obj.updateDynamic("DEVELOPMENT")(DEVELOPMENT)
    __obj.updateDynamic("NORMAL")(NORMAL)
    __obj.updateDynamic("OTHER")(OTHER)
    __obj.updateDynamic("SIDELOAD")(SIDELOAD)
    __obj.asInstanceOf[Anon_ADMIN]
  }
}

