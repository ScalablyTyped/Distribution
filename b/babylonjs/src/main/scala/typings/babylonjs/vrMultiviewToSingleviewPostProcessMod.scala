package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.postProcessMod.PostProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/vrMultiviewToSingleviewPostProcess", JSImport.Namespace)
@js.native
object vrMultiviewToSingleviewPostProcessMod extends js.Object {
  
  @js.native
  class VRMultiviewToSingleviewPostProcess protected () extends PostProcess {
    /**
      * Initializes a VRMultiviewToSingleview
      * @param name name of the post process
      * @param camera camera to be applied to
      * @param scaleFactor scaling factor to the size of the output texture
      */
    def this(name: String, camera: Camera, scaleFactor: Double) = this()
  }
}
