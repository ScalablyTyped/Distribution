package typings.babylonjs.xRIndexMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/XR/index", "WebXRGenericTriggerMotionController")
@js.native
class WebXRGenericTriggerMotionController protected ()
  extends typings.babylonjs.motionControllerIndexMod.WebXRGenericTriggerMotionController {
  def this(scene: Scene, gamepadObject: IMinimalMotionControllerObject, handness: MotionControllerHandness) = this()
}

/* static members */
@JSImport("babylonjs/XR/index", "WebXRGenericTriggerMotionController")
@js.native
object WebXRGenericTriggerMotionController extends js.Object {
  /**
    * Static version of the profile id of this controller
    */
  var ProfileId: String = js.native
}

