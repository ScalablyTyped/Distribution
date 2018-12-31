package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing an arc rotate camera inputs manager
  */
/**
  * Default Inputs manager for the ArcRotateCamera.
  * It groups all the default supported inputs for ease of use.
  * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
  */
@JSImport("babylonjs", "ArcRotateCameraInputsManager")
@js.native
class ArcRotateCameraInputsManager protected ()
  extends babylonjsLib.BABYLONNs.ArcRotateCameraInputsManager {
  /**
    * Instantiates a new ArcRotateCameraInputsManager.
    * @param camera Defines the camera the inputs belong to
    */
  def this(camera: babylonjsLib.BABYLONNs.ArcRotateCamera) = this()
}

