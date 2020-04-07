package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.videoRecorderMod.VideoRecorderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "VideoRecorder")
@js.native
class VideoRecorder protected ()
  extends typings.babylonjs.legacyMod.VideoRecorder {
  /**
    * Create a new VideoCapture object which can help converting what you see in Babylon to a video file.
    * @param engine Defines the BabylonJS Engine you wish to record.
    * @param options Defines options that can be used to customize the capture.
    */
  def this(engine: typings.babylonjs.engineMod.Engine) = this()
  def this(engine: typings.babylonjs.engineMod.Engine, options: Nullable[VideoRecorderOptions]) = this()
}

/* static members */
@JSImport("babylonjs", "VideoRecorder")
@js.native
object VideoRecorder extends js.Object {
  val _defaultOptions: js.Any = js.native
  /**
    * Returns whether or not the VideoRecorder is available in your browser.
    * @param engine Defines the Babylon Engine.
    * @returns true if supported otherwise false.
    */
  def IsSupported(engine: typings.babylonjs.engineMod.Engine): Boolean = js.native
}

