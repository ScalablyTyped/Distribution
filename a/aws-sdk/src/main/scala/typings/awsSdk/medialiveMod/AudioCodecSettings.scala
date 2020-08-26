package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioCodecSettings extends js.Object {
  var AacSettings: js.UndefOr[typings.awsSdk.medialiveMod.AacSettings] = js.native
  var Ac3Settings: js.UndefOr[typings.awsSdk.medialiveMod.Ac3Settings] = js.native
  var Eac3Settings: js.UndefOr[typings.awsSdk.medialiveMod.Eac3Settings] = js.native
  var Mp2Settings: js.UndefOr[typings.awsSdk.medialiveMod.Mp2Settings] = js.native
  var PassThroughSettings: js.UndefOr[typings.awsSdk.medialiveMod.PassThroughSettings] = js.native
}

object AudioCodecSettings {
  @scala.inline
  def apply(): AudioCodecSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioCodecSettings]
  }
  @scala.inline
  implicit class AudioCodecSettingsOps[Self <: AudioCodecSettings] (val x: Self) extends AnyVal {
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
    def setAacSettings(value: AacSettings): Self = this.set("AacSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAacSettings: Self = this.set("AacSettings", js.undefined)
    @scala.inline
    def setAc3Settings(value: Ac3Settings): Self = this.set("Ac3Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAc3Settings: Self = this.set("Ac3Settings", js.undefined)
    @scala.inline
    def setEac3Settings(value: Eac3Settings): Self = this.set("Eac3Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEac3Settings: Self = this.set("Eac3Settings", js.undefined)
    @scala.inline
    def setMp2Settings(value: Mp2Settings): Self = this.set("Mp2Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMp2Settings: Self = this.set("Mp2Settings", js.undefined)
    @scala.inline
    def setPassThroughSettings(value: PassThroughSettings): Self = this.set("PassThroughSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassThroughSettings: Self = this.set("PassThroughSettings", js.undefined)
  }
  
}

