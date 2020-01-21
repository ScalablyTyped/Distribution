package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmbeddedDestinationSettings extends js.Object {
  /**
    * Ignore this setting unless your input captions are SCC format and your output captions are embedded in the video stream. Specify a CC number for each captions channel in this output. If you have two channels, choose CC numbers that aren't in the same field. For example, choose 1 and 3. For more information, see https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
    */
  var Destination608ChannelNumber: js.UndefOr[integerMin1Max4] = js.native
  /**
    * Ignore this setting unless your input captions are SCC format and you want both 608 and 708 captions embedded in your output stream. Optionally, specify the 708 service number for each output captions channel. Choose a different number for each channel. To use this setting, also set Force 608 to 708 upconvert (Convert608To708) to Upconvert (UPCONVERT) in your input captions selector settings. If you choose to upconvert but don't specify a 708 service number, MediaConvert uses the number that you specify for CC channel number (destination608ChannelNumber) for the 708 service number. For more information, see https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
    */
  var Destination708ServiceNumber: js.UndefOr[integerMin1Max6] = js.native
}

object EmbeddedDestinationSettings {
  @scala.inline
  def apply(Destination608ChannelNumber: Int | Double = null, Destination708ServiceNumber: Int | Double = null): EmbeddedDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (Destination608ChannelNumber != null) __obj.updateDynamic("Destination608ChannelNumber")(Destination608ChannelNumber.asInstanceOf[js.Any])
    if (Destination708ServiceNumber != null) __obj.updateDynamic("Destination708ServiceNumber")(Destination708ServiceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedDestinationSettings]
  }
}

