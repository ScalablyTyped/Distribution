package typings.babylonjs.postProcessesIndexMod

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/index", "VRMultiviewToSingleviewPostProcess")
@js.native
open class VRMultiviewToSingleviewPostProcess protected ()
  extends typings.babylonjs.postProcessesVrMultiviewToSingleviewPostProcessMod.VRMultiviewToSingleviewPostProcess {
  /**
    * Initializes a VRMultiviewToSingleview
    * @param name name of the post process
    * @param camera camera to be applied to
    * @param scaleFactor scaling factor to the size of the output texture
    */
  def this(name: String, camera: Nullable[Camera], scaleFactor: Double) = this()
}
