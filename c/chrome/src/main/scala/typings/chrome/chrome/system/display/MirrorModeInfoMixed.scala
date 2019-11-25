package typings.chrome.chrome.system.display

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
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (mirroringDestinationIds != null) __obj.updateDynamic("mirroringDestinationIds")(mirroringDestinationIds.asInstanceOf[js.Any])
    if (mirroringSourceId != null) __obj.updateDynamic("mirroringSourceId")(mirroringSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MirrorModeInfoMixed]
  }
}

