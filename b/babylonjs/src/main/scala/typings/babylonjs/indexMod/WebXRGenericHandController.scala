package typings.babylonjs.indexMod

import typings.babylonjs.xRMotionControllerWebXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.xRMotionControllerWebXRAbstractMotionControllerMod.MotionControllerHandedness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXRGenericHandController")
@js.native
open class WebXRGenericHandController protected ()
  extends typings.babylonjs.xRIndexMod.WebXRGenericHandController {
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
