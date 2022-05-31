package typings.babylonjs.BABYLON

import typings.std.MediaStreamTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoRecorderOptions extends StObject {
  
  /** The audio tracks to attach to the recording. */
  var audioTracks: js.UndefOr[js.Array[MediaStreamTrack]] = js.undefined
  
  /** Defines the FPS the video should be recorded at. */
  var fps: Double
  
  /** Defines the mime type of the video. */
  var mimeType: String
  
  /** Defines the chunk size for the recording data. */
  var recordChunckSize: Double
}
object VideoRecorderOptions {
  
  inline def apply(fps: Double, mimeType: String, recordChunckSize: Double): VideoRecorderOptions = {
    val __obj = js.Dynamic.literal(fps = fps.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], recordChunckSize = recordChunckSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoRecorderOptions]
  }
  
  extension [Self <: VideoRecorderOptions](x: Self) {
    
    inline def setAudioTracks(value: js.Array[MediaStreamTrack]): Self = StObject.set(x, "audioTracks", value.asInstanceOf[js.Any])
    
    inline def setAudioTracksUndefined: Self = StObject.set(x, "audioTracks", js.undefined)
    
    inline def setAudioTracksVarargs(value: MediaStreamTrack*): Self = StObject.set(x, "audioTracks", js.Array(value :_*))
    
    inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setRecordChunckSize(value: Double): Self = StObject.set(x, "recordChunckSize", value.asInstanceOf[js.Any])
  }
}
