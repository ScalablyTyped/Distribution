package typings.babylonjs.anon

import typings.std.MediaStreamTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.VideoRecorderOptions> */
trait PartialVideoRecorderOptio extends StObject {
  
  var audioTracks: js.UndefOr[js.Array[MediaStreamTrack]] = js.undefined
  
  var fps: js.UndefOr[Double] = js.undefined
  
  var mimeType: js.UndefOr[String] = js.undefined
  
  var recordChunckSize: js.UndefOr[Double] = js.undefined
}
object PartialVideoRecorderOptio {
  
  inline def apply(): PartialVideoRecorderOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialVideoRecorderOptio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialVideoRecorderOptio] (val x: Self) extends AnyVal {
    
    inline def setAudioTracks(value: js.Array[MediaStreamTrack]): Self = StObject.set(x, "audioTracks", value.asInstanceOf[js.Any])
    
    inline def setAudioTracksUndefined: Self = StObject.set(x, "audioTracks", js.undefined)
    
    inline def setAudioTracksVarargs(value: MediaStreamTrack*): Self = StObject.set(x, "audioTracks", js.Array(value*))
    
    inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    inline def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setRecordChunckSize(value: Double): Self = StObject.set(x, "recordChunckSize", value.asInstanceOf[js.Any])
    
    inline def setRecordChunckSizeUndefined: Self = StObject.set(x, "recordChunckSize", js.undefined)
  }
}
