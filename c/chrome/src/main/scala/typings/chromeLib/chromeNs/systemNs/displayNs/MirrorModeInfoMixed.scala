package typings
package chromeLib.chromeNs.systemNs.displayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MirrorModeInfoMixed extends MirrorModeInfo {
  /** The ids of the mirroring destination displays. */
  var mirroringDestinationIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var mirroringSourceId: js.UndefOr[java.lang.String] = js.undefined
  @JSName("mode")
  var mode_MirrorModeInfoMixed: chromeLib.chromeLibStrings.mixed
}

object MirrorModeInfoMixed {
  @scala.inline
  def apply(
    mode: chromeLib.chromeLibStrings.mixed,
    mirroringDestinationIds: js.Array[java.lang.String] = null,
    mirroringSourceId: java.lang.String = null
  ): MirrorModeInfoMixed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mode")(mode)
    if (mirroringDestinationIds != null) __obj.updateDynamic("mirroringDestinationIds")(mirroringDestinationIds)
    if (mirroringSourceId != null) __obj.updateDynamic("mirroringSourceId")(mirroringSourceId)
    __obj.asInstanceOf[MirrorModeInfoMixed]
  }
}

