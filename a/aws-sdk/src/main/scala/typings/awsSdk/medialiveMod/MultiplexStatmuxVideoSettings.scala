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
  def apply(MaximumBitrate: Int | Double = null, MinimumBitrate: Int | Double = null): MultiplexStatmuxVideoSettings = {
    val __obj = js.Dynamic.literal()
    if (MaximumBitrate != null) __obj.updateDynamic("MaximumBitrate")(MaximumBitrate.asInstanceOf[js.Any])
    if (MinimumBitrate != null) __obj.updateDynamic("MinimumBitrate")(MinimumBitrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexStatmuxVideoSettings]
  }
}

