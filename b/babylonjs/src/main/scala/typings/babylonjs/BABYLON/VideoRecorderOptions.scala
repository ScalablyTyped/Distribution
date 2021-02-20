package typings.babylonjs.BABYLON

import typings.std.MediaStreamTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoRecorderOptions extends StObject {
  
  /** The audio tracks to attach to the recording. */
  var audioTracks: js.UndefOr[js.Array[MediaStreamTrack]] = js.native
  
  /** Defines the FPS the video should be recorded at. */
  var fps: Double = js.native
  
  /** Defines the mime type of the video. */
  var mimeType: String = js.native
  
  /** Defines the chunk size for the recording data. */
  var recordChunckSize: Double = js.native
}
object VideoRecorderOptions {
  
  @scala.inline
  def apply(fps: Double, mimeType: String, recordChunckSize: Double): VideoRecorderOptions = {
    val __obj = js.Dynamic.literal(fps = fps.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], recordChunckSize = recordChunckSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoRecorderOptions]
  }
  
  @scala.inline
  implicit class VideoRecorderOptionsMutableBuilder[Self <: VideoRecorderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioTracks(value: js.Array[MediaStreamTrack]): Self = StObject.set(x, "audioTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioTracksUndefined: Self = StObject.set(x, "audioTracks", js.undefined)
    
    @scala.inline
    def setAudioTracksVarargs(value: MediaStreamTrack*): Self = StObject.set(x, "audioTracks", js.Array(value :_*))
    
    @scala.inline
    def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordChunckSize(value: Double): Self = StObject.set(x, "recordChunckSize", value.asInstanceOf[js.Any])
  }
}
