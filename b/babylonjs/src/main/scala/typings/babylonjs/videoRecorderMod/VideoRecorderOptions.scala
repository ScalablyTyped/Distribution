package typings.babylonjs.videoRecorderMod

import typings.std.MediaStreamTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoRecorderOptions extends js.Object {
  
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
  implicit class VideoRecorderOptionsOps[Self <: VideoRecorderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFps(value: Double): Self = this.set("fps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordChunckSize(value: Double): Self = this.set("recordChunckSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioTracksVarargs(value: MediaStreamTrack*): Self = this.set("audioTracks", js.Array(value :_*))
    
    @scala.inline
    def setAudioTracks(value: js.Array[MediaStreamTrack]): Self = this.set("audioTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioTracks: Self = this.set("audioTracks", js.undefined)
  }
}
