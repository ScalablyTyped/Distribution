package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing a free camera inputs manager
  */
@JSImport("babylonjs/Legacy/legacy", "FreeCameraInputsManager")
@js.native
class FreeCameraInputsManager protected ()
  extends typings.babylonjs.indexMod.FreeCameraInputsManager {
  /**
    * Instantiates a new FreeCameraInputsManager.
    * @param camera Defines the camera the inputs belong to
    */
  def this(camera: typings.babylonjs.freeCameraMod.FreeCamera) = this()
}
