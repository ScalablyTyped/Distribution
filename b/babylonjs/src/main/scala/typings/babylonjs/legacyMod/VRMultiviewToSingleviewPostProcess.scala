package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "VRMultiviewToSingleviewPostProcess")
@js.native
class VRMultiviewToSingleviewPostProcess protected ()
  extends typings.babylonjs.indexMod.VRMultiviewToSingleviewPostProcess {
  /**
    * Initializes a VRMultiviewToSingleview
    * @param name name of the post process
    * @param camera camera to be applied to
    * @param scaleFactor scaling factor to the size of the output texture
    */
  def this(name: String, camera: typings.babylonjs.cameraMod.Camera, scaleFactor: Double) = this()
}

