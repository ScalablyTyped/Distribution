package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.VideoRecorderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.VideoRecorder")
@js.native
class VideoRecorder protected ()
  extends typings.babylonjs.BABYLON.VideoRecorder {
  /**
    * Create a new VideoCapture object which can help converting what you see in Babylon to a video file.
    * @param engine Defines the BabylonJS Engine you wish to record.
    * @param options Defines options that can be used to customize the capture.
    */
  def this(engine: typings.babylonjs.BABYLON.Engine) = this()
  def this(engine: typings.babylonjs.BABYLON.Engine, options: Nullable[VideoRecorderOptions]) = this()
}

/* static members */
@JSGlobal("BABYLON.VideoRecorder")
@js.native
object VideoRecorder extends js.Object {
  val _defaultOptions: js.Any = js.native
  /**
    * Returns whether or not the VideoRecorder is available in your browser.
    * @param engine Defines the Babylon Engine.
    * @returns true if supported otherwise false.
    */
  def IsSupported(engine: typings.babylonjs.BABYLON.Engine): Boolean = js.native
}

