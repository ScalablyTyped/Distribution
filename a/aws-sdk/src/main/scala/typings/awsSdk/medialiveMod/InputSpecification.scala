package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSpecification extends js.Object {
  /**
    * Input codec
    */
  var Codec: js.UndefOr[InputCodec] = js.native
  /**
    * Maximum input bitrate, categorized coarsely
    */
  var MaximumBitrate: js.UndefOr[InputMaximumBitrate] = js.native
  /**
    * Input resolution, categorized coarsely
    */
  var Resolution: js.UndefOr[InputResolution] = js.native
}

object InputSpecification {
  @scala.inline
  def apply(
    Codec: InputCodec = null,
    MaximumBitrate: InputMaximumBitrate = null,
    Resolution: InputResolution = null
  ): InputSpecification = {
    val __obj = js.Dynamic.literal()
    if (Codec != null) __obj.updateDynamic("Codec")(Codec.asInstanceOf[js.Any])
    if (MaximumBitrate != null) __obj.updateDynamic("MaximumBitrate")(MaximumBitrate.asInstanceOf[js.Any])
    if (Resolution != null) __obj.updateDynamic("Resolution")(Resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSpecification]
  }
}

