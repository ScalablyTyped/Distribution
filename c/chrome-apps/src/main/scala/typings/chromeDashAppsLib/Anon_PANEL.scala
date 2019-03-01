package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PANEL extends js.Object {
  var PANEL: chromeDashAppsLib.chromeDashAppsLibStrings.panel
  var SHELL: chromeDashAppsLib.chromeDashAppsLibStrings.shell
}

object Anon_PANEL {
  @scala.inline
  def apply(
    PANEL: chromeDashAppsLib.chromeDashAppsLibStrings.panel,
    SHELL: chromeDashAppsLib.chromeDashAppsLibStrings.shell
  ): Anon_PANEL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PANEL")(PANEL)
    __obj.updateDynamic("SHELL")(SHELL)
    __obj.asInstanceOf[Anon_PANEL]
  }
}

