package typings.babylonjs.BABYLON

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoRecorder extends js.Object {
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
    * Releases internal resources used during the recording.
    */
  def dispose(): Unit = js.native
  /**
    * True when a recording is already in progress.
    */
  def isRecording: Boolean = js.native
  /**
    * Starts recording the canvas for a max duration specified in parameters.
    * @param fileName Defines the name of the file to be downloaded when the recording stop.
    * If null no automatic download will start and you can rely on the promise to get the data back.
    * @param maxDuration Defines the maximum recording time in seconds.
    * It defaults to 7 seconds. A value of zero will not stop automatically, you would need to call stopRecording manually.
    * @return A promise callback at the end of the recording with the video data in Blob.
    */
  def startRecording(): js.Promise[Blob] = js.native
  def startRecording(fileName: Nullable[String]): js.Promise[Blob] = js.native
  def startRecording(fileName: Nullable[String], maxDuration: Double): js.Promise[Blob] = js.native
  /**
    * Stops the current recording before the default capture timeout passed in the startRecording function.
    */
  def stopRecording(): Unit = js.native
}

