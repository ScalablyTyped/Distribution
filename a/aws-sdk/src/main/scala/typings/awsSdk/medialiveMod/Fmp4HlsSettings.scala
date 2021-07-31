package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fmp4HlsSettings extends StObject {
  
  /**
    * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are associated to the video, separate by ','.
    */
  var AudioRenditionSets: js.UndefOr[string] = js.undefined
  
  /**
    * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  var NielsenId3Behavior: js.UndefOr[Fmp4NielsenId3Behavior] = js.undefined
  
  /**
    * When set to passthrough, timed metadata is passed through from input to output.
    */
  var TimedMetadataBehavior: js.UndefOr[Fmp4TimedMetadataBehavior] = js.undefined
}
object Fmp4HlsSettings {
  
  @scala.inline
  def apply(): Fmp4HlsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fmp4HlsSettings]
  }
  
  @scala.inline
  implicit class Fmp4HlsSettingsMutableBuilder[Self <: Fmp4HlsSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioRenditionSets(value: string): Self = StObject.set(x, "AudioRenditionSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioRenditionSetsUndefined: Self = StObject.set(x, "AudioRenditionSets", js.undefined)
    
    @scala.inline
    def setNielsenId3Behavior(value: Fmp4NielsenId3Behavior): Self = StObject.set(x, "NielsenId3Behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNielsenId3BehaviorUndefined: Self = StObject.set(x, "NielsenId3Behavior", js.undefined)
    
    @scala.inline
    def setTimedMetadataBehavior(value: Fmp4TimedMetadataBehavior): Self = StObject.set(x, "TimedMetadataBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedMetadataBehaviorUndefined: Self = StObject.set(x, "TimedMetadataBehavior", js.undefined)
  }
}
