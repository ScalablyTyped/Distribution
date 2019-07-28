package typings.chrome.chromeNs.systemNs.displayNs

import typings.chrome.chromeStrings.mixed
import typings.chrome.chromeStrings.normal
import typings.chrome.chromeStrings.off
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

