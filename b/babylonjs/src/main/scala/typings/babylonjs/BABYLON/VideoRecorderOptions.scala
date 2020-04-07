package typings.babylonjs.BABYLON

import typings.std.MediaStreamTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoRecorderOptions extends js.Object {
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
  @scala.inline
  def apply(
    fps: Double,
    mimeType: String,
    recordChunckSize: Double,
    audioTracks: js.Array[MediaStreamTrack] = null
  ): VideoRecorderOptions = {
    val __obj = js.Dynamic.literal(fps = fps.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], recordChunckSize = recordChunckSize.asInstanceOf[js.Any])
    if (audioTracks != null) __obj.updateDynamic("audioTracks")(audioTracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoRecorderOptions]
  }
}

