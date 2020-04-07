package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a free camera inputs manager
  */
@JSImport("babylonjs", "FreeCameraInputsManager")
@js.native
class FreeCameraInputsManager protected ()
  extends typings.babylonjs.legacyMod.FreeCameraInputsManager {
  /**
    * Instantiates a new FreeCameraInputsManager.
    * @param camera Defines the camera the inputs belong to
    */
  def this(camera: typings.babylonjs.freeCameraMod.FreeCamera) = this()
}

