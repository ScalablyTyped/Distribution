package typings.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioVideo extends StObject {
  
  var audio: js.UndefOr[Double] = js.undefined
  
  var video: js.UndefOr[Double] = js.undefined
}
object AudioVideo {
  
  inline def apply(): AudioVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioVideo]
  }
  
  extension [Self <: AudioVideo](x: Self) {
    
    inline def setAudio(value: Double): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setVideo(value: Double): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
