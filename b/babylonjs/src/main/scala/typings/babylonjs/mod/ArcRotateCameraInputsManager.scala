package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing an arc rotate camera inputs manager
  */
@JSImport("babylonjs", "ArcRotateCameraInputsManager")
@js.native
class ArcRotateCameraInputsManager protected ()
  extends typings.babylonjs.legacyMod.ArcRotateCameraInputsManager {
  /**
    * Instantiates a new ArcRotateCameraInputsManager.
    * @param camera Defines the camera the inputs belong to
    */
  def this(camera: typings.babylonjs.arcRotateCameraMod.ArcRotateCamera) = this()
}

