package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "CameraInputsManager")
@js.native
class CameraInputsManager[TCamera /* <: typings.babylonjs.cameraMod.Camera */] protected ()
  extends typings.babylonjs.legacyMod.CameraInputsManager[TCamera] {
  /**
    * Instantiate a new Camera Input Manager.
    * @param camera Defines the camera the input manager blongs to
    */
  def this(camera: TCamera) = this()
}

