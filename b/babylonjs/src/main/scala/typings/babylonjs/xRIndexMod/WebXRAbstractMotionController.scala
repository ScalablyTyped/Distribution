package typings.babylonjs.xRIndexMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.webXRAbstractMotionControllerMod.IMotionControllerLayout
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandedness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRAbstractMotionController")
@js.native
abstract class WebXRAbstractMotionController protected ()
  extends typings.babylonjs.motionControllerIndexMod.WebXRAbstractMotionController {
  /**
    * constructs a new abstract motion controller
    * @param scene the scene to which the model of the controller will be added
    * @param layout The profile layout to load
    * @param gamepadObject The gamepad object correlating to this controller
    * @param handedness handedness (left/right/none) of this controller
    * @param _doNotLoadControllerMesh set this flag to ignore the mesh loading
    */
  def this(
    scene: Scene,
    layout: IMotionControllerLayout,
    /**
    * The gamepad object correlating to this controller
    */
  gamepadObject: IMinimalMotionControllerObject,
    /**
    * handedness (left/right/none) of this controller
    */
  handedness: MotionControllerHandedness
  ) = this()
  def this(
    scene: Scene,
    layout: IMotionControllerLayout,
    /**
    * The gamepad object correlating to this controller
    */
  gamepadObject: IMinimalMotionControllerObject,
    /**
    * handedness (left/right/none) of this controller
    */
  handedness: MotionControllerHandedness,
    _doNotLoadControllerMesh: Boolean
  ) = this()
}
