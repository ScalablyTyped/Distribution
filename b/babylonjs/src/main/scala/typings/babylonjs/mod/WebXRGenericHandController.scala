package typings.babylonjs.mod

import typings.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandedness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXRGenericHandController")
@js.native
open class WebXRGenericHandController protected ()
  extends typings.babylonjs.legacyMod.WebXRGenericHandController {
  /**
    * Create a new hand controller object, without loading a controller model
    * @param scene the scene to use to create this controller
    * @param gamepadObject the corresponding gamepad object
    * @param handedness the handedness of the controller
    */
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handedness: MotionControllerHandedness
  ) = this()
}
