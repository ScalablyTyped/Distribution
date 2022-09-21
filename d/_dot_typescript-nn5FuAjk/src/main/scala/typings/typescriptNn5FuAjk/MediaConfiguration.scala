package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaConfiguration extends StObject {
  
  var audio: js.UndefOr[AudioConfiguration] = js.undefined
  
  var video: js.UndefOr[VideoConfiguration] = js.undefined
}
object MediaConfiguration {
  
  inline def apply(): MediaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaConfiguration]
  }
  
  extension [Self <: MediaConfiguration](x: Self) {
    
    inline def setAudio(value: AudioConfiguration): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setVideo(value: VideoConfiguration): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
