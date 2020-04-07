package typings.babylonjs.legacyMod

import typings.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "WebXRGenericTriggerMotionController")
@js.native
class WebXRGenericTriggerMotionController protected ()
  extends typings.babylonjs.indexMod.WebXRGenericTriggerMotionController {
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handness: MotionControllerHandness
  ) = this()
}

/* static members */
@JSImport("babylonjs/Legacy/legacy", "WebXRGenericTriggerMotionController")
@js.native
object WebXRGenericTriggerMotionController extends js.Object {
  /**
    * Static version of the profile id of this controller
    */
  var ProfileId: String = js.native
}

