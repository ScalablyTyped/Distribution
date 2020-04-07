package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRAbstractMotionControllerMod.IMotionControllerProfile
import typings.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/XR/motionController/webXRProfiledMotionController", JSImport.Namespace)
@js.native
object webXRProfiledMotionControllerMod extends js.Object {
  @js.native
  class WebXRProfiledMotionController protected () extends WebXRAbstractMotionController {
    def this(scene: Scene, xrInput: XRInputSource, _profile: IMotionControllerProfile, _repositoryUrl: String) = this()
    var _buttonMeshMapping: js.Any = js.native
    var _repositoryUrl: js.Any = js.native
    var _touchDots: js.Any = js.native
  }
  
}

