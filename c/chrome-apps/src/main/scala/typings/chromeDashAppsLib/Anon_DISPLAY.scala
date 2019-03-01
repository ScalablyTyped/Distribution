package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DISPLAY extends js.Object {
  var DISPLAY: chromeDashAppsLib.chromeDashAppsLibStrings.display
  var SYSTEM: chromeDashAppsLib.chromeDashAppsLibStrings.system
}

object Anon_DISPLAY {
  @scala.inline
  def apply(
    DISPLAY: chromeDashAppsLib.chromeDashAppsLibStrings.display,
    SYSTEM: chromeDashAppsLib.chromeDashAppsLibStrings.system
  ): Anon_DISPLAY = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DISPLAY")(DISPLAY)
    __obj.updateDynamic("SYSTEM")(SYSTEM)
    __obj.asInstanceOf[Anon_DISPLAY]
  }
}

