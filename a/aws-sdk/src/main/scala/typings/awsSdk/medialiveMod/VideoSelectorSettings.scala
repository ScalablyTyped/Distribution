package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoSelectorSettings extends StObject {
  
  var VideoSelectorPid: js.UndefOr[typings.awsSdk.medialiveMod.VideoSelectorPid] = js.undefined
  
  var VideoSelectorProgramId: js.UndefOr[typings.awsSdk.medialiveMod.VideoSelectorProgramId] = js.undefined
}
object VideoSelectorSettings {
  
  @scala.inline
  def apply(): VideoSelectorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSelectorSettings]
  }
  
  @scala.inline
  implicit class VideoSelectorSettingsMutableBuilder[Self <: VideoSelectorSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVideoSelectorPid(value: VideoSelectorPid): Self = StObject.set(x, "VideoSelectorPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSelectorPidUndefined: Self = StObject.set(x, "VideoSelectorPid", js.undefined)
    
    @scala.inline
    def setVideoSelectorProgramId(value: VideoSelectorProgramId): Self = StObject.set(x, "VideoSelectorProgramId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSelectorProgramIdUndefined: Self = StObject.set(x, "VideoSelectorProgramId", js.undefined)
  }
}
