package typings.dashjs.anon

import typings.dashjs.mod.TrackSwitchMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Video extends StObject {
  
  var audio: js.UndefOr[TrackSwitchMode] = js.undefined
  
  var video: js.UndefOr[TrackSwitchMode] = js.undefined
}
object Video {
  
  inline def apply(): Video = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Video]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Video] (val x: Self) extends AnyVal {
    
    inline def setAudio(value: TrackSwitchMode): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setVideo(value: TrackSwitchMode): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
