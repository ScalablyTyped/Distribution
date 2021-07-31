package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SccDestinationSettings extends StObject {
  
  /**
    * Set Framerate (SccDestinationFramerate) to make sure that the captions and the video are synchronized in the output. Specify a frame rate that matches the frame rate of the associated video. If the video frame rate is 29.97, choose 29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the video has video_insertion=true and drop_frame_timecode=true; otherwise, choose 29.97 non-dropframe (FRAMERATE_29_97_NON_DROPFRAME).
    */
  var Framerate: js.UndefOr[SccDestinationFramerate] = js.undefined
}
object SccDestinationSettings {
  
  @scala.inline
  def apply(): SccDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SccDestinationSettings]
  }
  
  @scala.inline
  implicit class SccDestinationSettingsMutableBuilder[Self <: SccDestinationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFramerate(value: SccDestinationFramerate): Self = StObject.set(x, "Framerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateUndefined: Self = StObject.set(x, "Framerate", js.undefined)
  }
}
