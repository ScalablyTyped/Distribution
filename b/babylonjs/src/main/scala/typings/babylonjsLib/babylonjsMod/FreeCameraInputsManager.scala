package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a free camera inputs manager
  */
/**
  * Default Inputs manager for the FreeCamera.
  * It groups all the default supported inputs for ease of use.
  * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
  */
@JSImport("babylonjs", "FreeCameraInputsManager")
@js.native
class FreeCameraInputsManager protected ()
  extends babylonjsLib.BABYLONNs.FreeCameraInputsManager {
  /**
    * Instantiates a new FreeCameraInputsManager.
    * @param camera Defines the camera the inputs belong to
    */
  def this(camera: babylonjsLib.BABYLONNs.FreeCamera) = this()
}

