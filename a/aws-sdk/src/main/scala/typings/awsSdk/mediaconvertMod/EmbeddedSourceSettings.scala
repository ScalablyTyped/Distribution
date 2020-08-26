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
  def apply(): EmbeddedSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedSourceSettings]
  }
  @scala.inline
  implicit class EmbeddedSourceSettingsOps[Self <: EmbeddedSourceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConvert608To708(value: EmbeddedConvert608To708): Self = this.set("Convert608To708", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvert608To708: Self = this.set("Convert608To708", js.undefined)
    @scala.inline
    def setSource608ChannelNumber(value: integerMin1Max4): Self = this.set("Source608ChannelNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource608ChannelNumber: Self = this.set("Source608ChannelNumber", js.undefined)
    @scala.inline
    def setSource608TrackNumber(value: integerMin1Max1): Self = this.set("Source608TrackNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource608TrackNumber: Self = this.set("Source608TrackNumber", js.undefined)
    @scala.inline
    def setTerminateCaptions(value: EmbeddedTerminateCaptions): Self = this.set("TerminateCaptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminateCaptions: Self = this.set("TerminateCaptions", js.undefined)
  }
  
}

