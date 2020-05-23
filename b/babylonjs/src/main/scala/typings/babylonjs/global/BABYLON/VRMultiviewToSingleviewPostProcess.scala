package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.VRMultiviewToSingleviewPostProcess")
@js.native
class VRMultiviewToSingleviewPostProcess protected ()
  extends typings.babylonjs.BABYLON.PostProcess {
  /**
    * Initializes a VRMultiviewToSingleview
    * @param name name of the post process
    * @param camera camera to be applied to
    * @param scaleFactor scaling factor to the size of the output texture
    */
  def this(name: String, camera: typings.babylonjs.BABYLON.Camera, scaleFactor: Double) = this()
}

