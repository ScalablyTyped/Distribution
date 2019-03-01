package typings
package chromeLib.chromeNs.systemNs.displayNs

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
  var mode: js.UndefOr[
    chromeLib.chromeLibStrings.off | chromeLib.chromeLibStrings.normal | chromeLib.chromeLibStrings.mixed
  ] = js.undefined
}

object MirrorModeInfo {
  @scala.inline
  def apply(
    mode: chromeLib.chromeLibStrings.off | chromeLib.chromeLibStrings.normal | chromeLib.chromeLibStrings.mixed = null
  ): MirrorModeInfo = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MirrorModeInfo]
  }
}

