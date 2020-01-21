package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmbeddedSourceSettings extends js.Object {
  /**
    * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
    */
  var Convert608To708: js.UndefOr[EmbeddedConvert608To708] = js.native
  /**
    * Specifies the 608/708 channel number within the video track from which to extract captions. Unused for passthrough.
    */
  var Source608ChannelNumber: js.UndefOr[integerMin1Max4] = js.native
  /**
    * Specifies the video track index used for extracting captions. The system only supports one input video track, so this should always be set to '1'.
    */
  var Source608TrackNumber: js.UndefOr[integerMin1Max1] = js.native
  /**
    * By default, the service terminates any unterminated captions at the end of each input. If you want the caption to continue onto your next input, disable this setting.
    */
  var TerminateCaptions: js.UndefOr[EmbeddedTerminateCaptions] = js.native
}

object EmbeddedSourceSettings {
  @scala.inline
  def apply(
    Convert608To708: EmbeddedConvert608To708 = null,
    Source608ChannelNumber: Int | Double = null,
    Source608TrackNumber: Int | Double = null,
    TerminateCaptions: EmbeddedTerminateCaptions = null
  ): EmbeddedSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (Convert608To708 != null) __obj.updateDynamic("Convert608To708")(Convert608To708.asInstanceOf[js.Any])
    if (Source608ChannelNumber != null) __obj.updateDynamic("Source608ChannelNumber")(Source608ChannelNumber.asInstanceOf[js.Any])
    if (Source608TrackNumber != null) __obj.updateDynamic("Source608TrackNumber")(Source608TrackNumber.asInstanceOf[js.Any])
    if (TerminateCaptions != null) __obj.updateDynamic("TerminateCaptions")(TerminateCaptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedSourceSettings]
  }
}

