package typings.babylonjs.mod

import typings.babylonjs.xRMotionControllerWebXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.xRMotionControllerWebXRAbstractMotionControllerMod.MotionControllerHandedness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXRGenericTriggerMotionController")
@js.native
open class WebXRGenericTriggerMotionController protected ()
  extends typings.babylonjs.legacyLegacyMod.WebXRGenericTriggerMotionController {
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handedness: MotionControllerHandedness
  ) = this()
}
/* static members */
object WebXRGenericTriggerMotionController {
  
  @JSImport("babylonjs", "WebXRGenericTriggerMotionController")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Static version of the profile id of this controller
    */
  @JSImport("babylonjs", "WebXRGenericTriggerMotionController.ProfileId")
  @js.native
  def ProfileId: String = js.native
  inline def ProfileId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProfileId")(x.asInstanceOf[js.Any])
}
