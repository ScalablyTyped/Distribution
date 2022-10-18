package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessesVrMultiviewToSingleviewPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/vrMultiviewToSingleviewPostProcess", "VRMultiviewToSingleviewPostProcess")
  @js.native
  open class VRMultiviewToSingleviewPostProcess protected () extends PostProcess {
    /**
      * Initializes a VRMultiviewToSingleview
      * @param name name of the post process
      * @param camera camera to be applied to
      * @param scaleFactor scaling factor to the size of the output texture
      */
    def this(name: String, camera: Nullable[Camera], scaleFactor: Double) = this()
  }
}
