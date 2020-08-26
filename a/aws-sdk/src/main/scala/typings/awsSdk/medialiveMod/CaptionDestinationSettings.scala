package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionDestinationSettings extends js.Object {
  var AribDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.AribDestinationSettings] = js.native
  var BurnInDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.BurnInDestinationSettings] = js.native
  var DvbSubDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.DvbSubDestinationSettings] = js.native
  var EbuTtDDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.EbuTtDDestinationSettings] = js.native
  var EmbeddedDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.EmbeddedDestinationSettings] = js.native
  var EmbeddedPlusScte20DestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.EmbeddedPlusScte20DestinationSettings] = js.native
  var RtmpCaptionInfoDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.RtmpCaptionInfoDestinationSettings] = js.native
  var Scte20PlusEmbeddedDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.Scte20PlusEmbeddedDestinationSettings] = js.native
  var Scte27DestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.Scte27DestinationSettings] = js.native
  var SmpteTtDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.SmpteTtDestinationSettings] = js.native
  var TeletextDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.TeletextDestinationSettings] = js.native
  var TtmlDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.TtmlDestinationSettings] = js.native
  var WebvttDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.WebvttDestinationSettings] = js.native
}

object CaptionDestinationSettings {
  @scala.inline
  def apply(): CaptionDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionDestinationSettings]
  }
  @scala.inline
  implicit class CaptionDestinationSettingsOps[Self <: CaptionDestinationSettings] (val x: Self) extends AnyVal {
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
    def setAribDestinationSettings(value: AribDestinationSettings): Self = this.set("AribDestinationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAribDestinationSettings: Self = this.set("AribDestinationSettings", js.undefined)
    @scala.inline
    def setBurnInDestinationSettings(value: BurnInDestinationSettings): Self = this.set("BurnInDestinationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBurnInDestinationSettings: Self = this.set("BurnInDestinationSettings", js.undefined)
    @scala.inline
    def setDvbSubDestinationSettings(value: DvbSubDestinationSettings): Self = this.set("DvbSubDestinationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDvbSubDestinationSettings: Self = this.set("DvbSubDestinationSettings", js.undefined)
    @scala.inline
    def setEbuTtDDestinationSettings(value: EbuTtDDestinationSettings): Self = this.set("EbuTtDDestinationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbuTtDDestinationSettings: Self = this.set("EbuTtDDestinationSettings", js.undefined)
    @scala.inline
    def setEmbeddedDestinationSettings(value: EmbeddedDestinationSettings): Self = this.set("EmbeddedDestinationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbeddedDestinationSettings: Self = this.set("EmbeddedDestinationSettings", js.undefined)
    @scala.inline
    def setEmbeddedPlusScte20DestinationSettings(value: EmbeddedPlusScte20DestinationSettings): Self = this.set("EmbeddedPlusScte20DestinationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbeddedPlusScte20DestinationSettings: Self = this.set("EmbeddedPlusScte20DestinationSettings", js.undefined)
    @scala.inline
    def setRtmpCaptionInfoDestinationSettings(value: RtmpCaptionInfoDestinationSettings): Self = this.set("RtmpCaptionInfoDestinationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtmpCaptionInfoDestinationSettings: Self = this.set("RtmpCaptionInfoDestinationSettings", js.undefined)
    @scala.inline
    def setScte20PlusEmbeddedDestinationSettings(value: Scte20PlusEmbeddedDestinationSettings): Self = this.set("Scte20PlusEmbeddedDestinationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScte20PlusEmbeddedDestinationSettings: Self = this.set("Scte20PlusEmbeddedDestinationSettings", js.undefined)
    @scala.inline
    def setScte27DestinationSettings(value: Scte27DestinationSettings): Self = this.set("Scte27DestinationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScte27DestinationSettings: Self = this.set("Scte27DestinationSettings", js.undefined)
    @scala.inline
    def setSmpteTtDestinationSettings(value: SmpteTtDestinationSettings): Self = this.set("SmpteTtDestinationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmpteTtDestinationSettings: Self = this.set("SmpteTtDestinationSettings", js.undefined)
    @scala.inline
    def setTeletextDestinationSettings(value: TeletextDestinationSettings): Self = this.set("TeletextDestinationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeletextDestinationSettings: Self = this.set("TeletextDestinationSettings", js.undefined)
    @scala.inline
    def setTtmlDestinationSettings(value: TtmlDestinationSettings): Self = this.set("TtmlDestinationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtmlDestinationSettings: Self = this.set("TtmlDestinationSettings", js.undefined)
    @scala.inline
    def setWebvttDestinationSettings(value: WebvttDestinationSettings): Self = this.set("WebvttDestinationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebvttDestinationSettings: Self = this.set("WebvttDestinationSettings", js.undefined)
  }
  
}

