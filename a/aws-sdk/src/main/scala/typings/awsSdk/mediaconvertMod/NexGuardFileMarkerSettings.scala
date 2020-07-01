package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NexGuardFileMarkerSettings extends js.Object {
  /**
    * Use the base64 license string that Nagra provides you. Enter it directly in your JSON job specification or in the console. Required when you include Nagra NexGuard File Marker watermarking (NexGuardWatermarkingSettings) in your job.
    */
  var License: js.UndefOr[stringMin1Max100000] = js.native
  /**
    * Specify the payload ID that you want associated with this output. Valid values vary depending on your Nagra NexGuard forensic watermarking workflow. Required when you include Nagra NexGuard File Marker watermarking (NexGuardWatermarkingSettings) in your job. For PreRelease Content (NGPR/G2), specify an integer from 1 through 4,194,303. You must generate a unique ID for each asset you watermark, and keep a record of which ID you have assigned to each asset. Neither Nagra nor MediaConvert keep track of the relationship between output files and your IDs. For OTT Streaming, create two adaptive bitrate (ABR) stacks for each asset. Do this by setting up two output groups. For one output group, set the value of Payload ID (payload) to 0 in every output. For the other output group, set Payload ID (payload) to 1 in every output.
    */
  var Payload: js.UndefOr[integerMin0Max4194303] = js.native
  /**
    * Enter one of the watermarking preset strings that Nagra provides you. Required when you include Nagra NexGuard File Marker watermarking (NexGuardWatermarkingSettings) in your job.
    */
  var Preset: js.UndefOr[stringMin1Max256] = js.native
  /**
    * Optional. Ignore this setting unless Nagra support directs you to specify a value. When you don't specify a value here, the Nagra NexGuard library uses its default value.
    */
  var Strength: js.UndefOr[WatermarkingStrength] = js.native
}

object NexGuardFileMarkerSettings {
  @scala.inline
  def apply(
    License: stringMin1Max100000 = null,
    Payload: js.UndefOr[integerMin0Max4194303] = js.undefined,
    Preset: stringMin1Max256 = null,
    Strength: WatermarkingStrength = null
  ): NexGuardFileMarkerSettings = {
    val __obj = js.Dynamic.literal()
    if (License != null) __obj.updateDynamic("License")(License.asInstanceOf[js.Any])
    if (!js.isUndefined(Payload)) __obj.updateDynamic("Payload")(Payload.get.asInstanceOf[js.Any])
    if (Preset != null) __obj.updateDynamic("Preset")(Preset.asInstanceOf[js.Any])
    if (Strength != null) __obj.updateDynamic("Strength")(Strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[NexGuardFileMarkerSettings]
  }
}

