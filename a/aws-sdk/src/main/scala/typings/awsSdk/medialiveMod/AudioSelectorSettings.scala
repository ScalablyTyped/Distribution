package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioSelectorSettings extends js.Object {
  
  var AudioLanguageSelection: js.UndefOr[typings.awsSdk.medialiveMod.AudioLanguageSelection] = js.native
  
  var AudioPidSelection: js.UndefOr[typings.awsSdk.medialiveMod.AudioPidSelection] = js.native
  
  var AudioTrackSelection: js.UndefOr[typings.awsSdk.medialiveMod.AudioTrackSelection] = js.native
}
object AudioSelectorSettings {
  
  @scala.inline
  def apply(): AudioSelectorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioSelectorSettings]
  }
  
  @scala.inline
  implicit class AudioSelectorSettingsOps[Self <: AudioSelectorSettings] (val x: Self) extends AnyVal {
    
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
    def setAudioLanguageSelection(value: AudioLanguageSelection): Self = this.set("AudioLanguageSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioLanguageSelection: Self = this.set("AudioLanguageSelection", js.undefined)
    
    @scala.inline
    def setAudioPidSelection(value: AudioPidSelection): Self = this.set("AudioPidSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioPidSelection: Self = this.set("AudioPidSelection", js.undefined)
    
    @scala.inline
    def setAudioTrackSelection(value: AudioTrackSelection): Self = this.set("AudioTrackSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioTrackSelection: Self = this.set("AudioTrackSelection", js.undefined)
  }
}
