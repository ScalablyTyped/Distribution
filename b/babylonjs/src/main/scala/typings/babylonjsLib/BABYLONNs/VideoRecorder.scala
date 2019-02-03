package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This can helps recording videos from BabylonJS.
  * This is based on the available WebRTC functionalities of the browser.
  *
  * @see http://doc.babylonjs.com/how_to/render_scene_on_a_video
  */
@JSGlobal("BABYLON.VideoRecorder")
@js.native
class VideoRecorder protected () extends js.Object {
  /**
    * Create a new VideoCapture object which can help converting what you see in Babylon to
    * a video file.
    * @param engine Defines the BabylonJS Engine you wish to record
    * @param options Defines options that can be used to customized the capture
    */
  def this(engine: Engine) = this()
  def this(engine: Engine, options: Nullable[VideoRecorderOptions]) = this()
  var _canvas: js.Any = js.native
  var _fileName: js.Any = js.native
  var _handleDataAvailable: js.Any = js.native
  var _handleError: js.Any = js.native
  var _handleStop: js.Any = js.native
  var _mediaRecorder: js.Any = js.native
  val _options: js.Any = js.native
  var _recordedChunks: js.Any = js.native
  var _reject: js.Any = js.native
  var _resolve: js.Any = js.native
  /**
    * True wether a recording is already in progress.
    */
  val isRecording: scala.Boolean = js.native
  /**
    * Releases internal resources used during the recording.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Starts recording the canvas for a max duration specified in parameters.
    * @param fileName Defines the name of the file to be downloaded when the recording stop. If null no automatic download will start and you can rely on the promise to get the data back.
    * @param maxDuration Defines the maximum recording time in seconds.
    * It default to 7 seconds. A value of zero will not stop automatically, you would need to call stopRecording manually.
    * @return a promise callback at the end of the recording with the video data in Blob.
    */
  def startRecording(): js.Promise[stdLib.Blob] = js.native
  def startRecording(fileName: Nullable[java.lang.String]): js.Promise[stdLib.Blob] = js.native
  def startRecording(fileName: Nullable[java.lang.String], maxDuration: scala.Double): js.Promise[stdLib.Blob] = js.native
  /**
    * Stops the current recording before the default capture timeout passed in the startRecording
    * functions.
    */
  def stopRecording(): scala.Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.VideoRecorder")
@js.native
object VideoRecorder extends js.Object {
  val _defaultOptions: js.Any = js.native
  /**
    * Returns wehther or not the VideoRecorder is available in your browser.
    * @param engine Defines the Babylon Engine to check the support for
    * @returns true if supported otherwise false
    */
  def IsSupported(engine: babylonjsLib.BABYLONNs.Engine): scala.Boolean = js.native
}

