package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceRecordingConfiguration extends StObject {
  
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
  implicit class VoiceRecordingConfigurationMutableBuilder[Self <: VoiceRecordingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceRecordingTrack(value: VoiceRecordingTrack): Self = StObject.set(x, "VoiceRecordingTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceRecordingTrackUndefined: Self = StObject.set(x, "VoiceRecordingTrack", js.undefined)
  }
}
