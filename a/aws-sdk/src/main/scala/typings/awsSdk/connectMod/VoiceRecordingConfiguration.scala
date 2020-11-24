package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceRecordingConfiguration extends js.Object {
  
  /**
    * Identifies which track is being recorded.
    */
  var VoiceRecordingTrack: js.UndefOr[typings.awsSdk.connectMod.VoiceRecordingTrack] = js.native
}
object VoiceRecordingConfiguration {
  
  @scala.inline
  def apply(): VoiceRecordingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceRecordingConfiguration]
  }
  
  @scala.inline
  implicit class VoiceRecordingConfigurationOps[Self <: VoiceRecordingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVoiceRecordingTrack(value: VoiceRecordingTrack): Self = this.set("VoiceRecordingTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoiceRecordingTrack: Self = this.set("VoiceRecordingTrack", js.undefined)
  }
}
