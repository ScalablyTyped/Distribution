package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This can helps recording videos from BabylonJS.
     * This is based on the available WebRTC functionalities of the browser.
     *
     * @see http://doc.babylonjs.com/how_to/render_scene_on_a_video
     */
@JSImport("babylonjs", "VideoRecorder")
@js.native
class VideoRecorder protected ()
  extends babylonjsLib.BABYLONNs.VideoRecorder {
  /**
           * Create a new VideoCapture object which can help converting what you see in Babylon to
           * a video file.
           * @param engine Defines the BabylonJS Engine you wish to record
           * @param options Defines options that can be used to customized the capture
           */
  def this(engine: babylonjsLib.BABYLONNs.Engine) = this()
  /**
           * Create a new VideoCapture object which can help converting what you see in Babylon to
           * a video file.
           * @param engine Defines the BabylonJS Engine you wish to record
           * @param options Defines options that can be used to customized the capture
           */
  def this(engine: babylonjsLib.BABYLONNs.Engine, options: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.VideoRecorderOptions]) = this()
}

/**
     * This can helps recording videos from BabylonJS.
     * This is based on the available WebRTC functionalities of the browser.
     *
     * @see http://doc.babylonjs.com/how_to/render_scene_on_a_video
     */
@JSImport("babylonjs", "VideoRecorder")
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

