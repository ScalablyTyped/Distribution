package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsSettings extends js.Object {
  var AudioOnlyHlsSettings: js.UndefOr[typings.awsSdk.medialiveMod.AudioOnlyHlsSettings] = js.native
  var Fmp4HlsSettings: js.UndefOr[typings.awsSdk.medialiveMod.Fmp4HlsSettings] = js.native
  var StandardHlsSettings: js.UndefOr[typings.awsSdk.medialiveMod.StandardHlsSettings] = js.native
}

object HlsSettings {
  @scala.inline
  def apply(): HlsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsSettings]
  }
  @scala.inline
  implicit class HlsSettingsOps[Self <: HlsSettings] (val x: Self) extends AnyVal {
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
    def setAudioOnlyHlsSettings(value: AudioOnlyHlsSettings): Self = this.set("AudioOnlyHlsSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioOnlyHlsSettings: Self = this.set("AudioOnlyHlsSettings", js.undefined)
    @scala.inline
    def setFmp4HlsSettings(value: Fmp4HlsSettings): Self = this.set("Fmp4HlsSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFmp4HlsSettings: Self = this.set("Fmp4HlsSettings", js.undefined)
    @scala.inline
    def setStandardHlsSettings(value: StandardHlsSettings): Self = this.set("StandardHlsSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardHlsSettings: Self = this.set("StandardHlsSettings", js.undefined)
  }
  
}

