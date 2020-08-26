package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scte20SourceSettings extends js.Object {
  /**
    * If upconvert, 608 data is both passed through via the "608 compatibility bytes" fields of the 708 wrapper as well as translated into 708. 708 data present in the source content will be discarded.
    */
  var Convert608To708: js.UndefOr[Scte20Convert608To708] = js.native
  /**
    * Specifies the 608/708 channel number within the video track from which to extract captions. Unused for passthrough.
    */
  var Source608ChannelNumber: js.UndefOr[integerMin1Max4] = js.native
}

object Scte20SourceSettings {
  @scala.inline
  def apply(): Scte20SourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scte20SourceSettings]
  }
  @scala.inline
  implicit class Scte20SourceSettingsOps[Self <: Scte20SourceSettings] (val x: Self) extends AnyVal {
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
    def setConvert608To708(value: Scte20Convert608To708): Self = this.set("Convert608To708", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvert608To708: Self = this.set("Convert608To708", js.undefined)
    @scala.inline
    def setSource608ChannelNumber(value: integerMin1Max4): Self = this.set("Source608ChannelNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource608ChannelNumber: Self = this.set("Source608ChannelNumber", js.undefined)
  }
  
}

