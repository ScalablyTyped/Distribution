package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexStatmuxVideoSettings extends js.Object {
  /**
    * Maximum statmux bitrate.
    */
  var MaximumBitrate: js.UndefOr[integerMin100000Max100000000] = js.native
  /**
    * Minimum statmux bitrate.
    */
  var MinimumBitrate: js.UndefOr[integerMin100000Max100000000] = js.native
}

object MultiplexStatmuxVideoSettings {
  @scala.inline
  def apply(
    MaximumBitrate: js.UndefOr[integerMin100000Max100000000] = js.undefined,
    MinimumBitrate: js.UndefOr[integerMin100000Max100000000] = js.undefined
  ): MultiplexStatmuxVideoSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaximumBitrate)) __obj.updateDynamic("MaximumBitrate")(MaximumBitrate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinimumBitrate)) __obj.updateDynamic("MinimumBitrate")(MinimumBitrate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexStatmuxVideoSettings]
  }
}

