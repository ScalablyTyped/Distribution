package typings.babylonjs.mod

import typings.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "WebXRGenericTriggerMotionController")
@js.native
class WebXRGenericTriggerMotionController protected ()
  extends typings.babylonjs.legacyMod.WebXRGenericTriggerMotionController {
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handness: MotionControllerHandness
  ) = this()
}

/* static members */
@JSImport("babylonjs", "WebXRGenericTriggerMotionController")
@js.native
object WebXRGenericTriggerMotionController extends js.Object {
  /**
    * Static version of the profile id of this controller
    */
  var ProfileId: String = js.native
}

