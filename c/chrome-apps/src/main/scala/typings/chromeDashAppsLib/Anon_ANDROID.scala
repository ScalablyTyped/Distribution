package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ANDROID extends js.Object {
  var ANDROID: chromeDashAppsLib.chromeDashAppsLibStrings.android
  var CROS: chromeDashAppsLib.chromeDashAppsLibStrings.cros
  var LINUX: chromeDashAppsLib.chromeDashAppsLibStrings.linux
  var MAC: chromeDashAppsLib.chromeDashAppsLibStrings.mac
  var OPENBSD: chromeDashAppsLib.chromeDashAppsLibStrings.openbsd
  var WIN: chromeDashAppsLib.chromeDashAppsLibStrings.win
}

object Anon_ANDROID {
  @scala.inline
  def apply(
    ANDROID: chromeDashAppsLib.chromeDashAppsLibStrings.android,
    CROS: chromeDashAppsLib.chromeDashAppsLibStrings.cros,
    LINUX: chromeDashAppsLib.chromeDashAppsLibStrings.linux,
    MAC: chromeDashAppsLib.chromeDashAppsLibStrings.mac,
    OPENBSD: chromeDashAppsLib.chromeDashAppsLibStrings.openbsd,
    WIN: chromeDashAppsLib.chromeDashAppsLibStrings.win
  ): Anon_ANDROID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ANDROID")(ANDROID)
    __obj.updateDynamic("CROS")(CROS)
    __obj.updateDynamic("LINUX")(LINUX)
    __obj.updateDynamic("MAC")(MAC)
    __obj.updateDynamic("OPENBSD")(OPENBSD)
    __obj.updateDynamic("WIN")(WIN)
    __obj.asInstanceOf[Anon_ANDROID]
  }
}

