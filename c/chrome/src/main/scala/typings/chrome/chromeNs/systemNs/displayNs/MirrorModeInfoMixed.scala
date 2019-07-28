package typings.chrome.chromeNs.systemNs.displayNs

import typings.chrome.chromeStrings.mixed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MirrorModeInfoMixed extends MirrorModeInfo {
  /** The ids of the mirroring destination displays. */
  var mirroringDestinationIds: js.UndefOr[js.Array[String]] = js.undefined
  var mirroringSourceId: js.UndefOr[String] = js.undefined
  @JSName("mode")
  var mode_MirrorModeInfoMixed: mixed
}

object MirrorModeInfoMixed {
  @scala.inline
  def apply(mode: mixed, mirroringDestinationIds: js.Array[String] = null, mirroringSourceId: String = null): MirrorModeInfoMixed = {
    val __obj = js.Dynamic.literal(mode = mode)
    if (mirroringDestinationIds != null) __obj.updateDynamic("mirroringDestinationIds")(mirroringDestinationIds)
    if (mirroringSourceId != null) __obj.updateDynamic("mirroringSourceId")(mirroringSourceId)
    __obj.asInstanceOf[MirrorModeInfoMixed]
  }
}

