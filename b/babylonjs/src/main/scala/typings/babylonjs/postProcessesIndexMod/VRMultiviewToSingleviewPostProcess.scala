package typings.babylonjs.postProcessesIndexMod

import typings.babylonjs.cameraMod.Camera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/PostProcesses/index", "VRMultiviewToSingleviewPostProcess")
@js.native
class VRMultiviewToSingleviewPostProcess protected ()
  extends typings.babylonjs.vrMultiviewToSingleviewPostProcessMod.VRMultiviewToSingleviewPostProcess {
  /**
    * Initializes a VRMultiviewToSingleview
    * @param name name of the post process
    * @param camera camera to be applied to
    * @param scaleFactor scaling factor to the size of the output texture
    */
  def this(name: String, camera: Camera, scaleFactor: Double) = this()
}

