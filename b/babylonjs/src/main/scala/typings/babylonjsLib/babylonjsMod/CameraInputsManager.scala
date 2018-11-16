package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This represents the input manager used within a camera.
     * It helps dealing with all the different kind of input attached to a camera.
     * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
     */
@JSImport("babylonjs", "CameraInputsManager")
@js.native
class CameraInputsManager[TCamera /* <: babylonjsLib.BABYLONNs.Camera */] protected ()
  extends babylonjsLib.BABYLONNs.CameraInputsManager[TCamera] {
  /**
           * Instantiate a new Camera Input Manager.
           * @param camera Defines the camera the input manager blongs to
           */
  def this(camera: TCamera) = this()
}

