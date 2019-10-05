package typings.chromeDashApps.chrome.system.display

import typings.chromeDashApps.chromeDashAppsStrings.mixed
import typings.chromeDashApps.chromeDashAppsStrings.normal
import typings.chromeDashApps.chromeDashAppsStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MirrorModeInfo extends js.Object {
  /**
    * The mirror mode that should be set.
    * **off**
    * Use the default mode (extended or unified desktop).
    * **normal**
    * The default source display will be mirrored to all other displays.
    * **mixed**
    * The specified source display will be mirrored to the provided destination displays. All other connected displays will be extended.
    */
  var mode: js.UndefOr[off | normal | mixed] = js.undefined
}

object MirrorModeInfo {
  @scala.inline
  def apply(mode: off | normal | mixed = null): MirrorModeInfo = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MirrorModeInfo]
  }
}

