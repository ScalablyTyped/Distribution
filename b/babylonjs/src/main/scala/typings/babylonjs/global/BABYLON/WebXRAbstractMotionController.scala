package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IMinimalMotionControllerObject
import typings.babylonjs.BABYLON.IMotionControllerLayout
import typings.babylonjs.BABYLON.MotionControllerHandness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRAbstractMotionController")
@js.native
abstract class WebXRAbstractMotionController protected ()
  extends typings.babylonjs.BABYLON.WebXRAbstractMotionController {
  /**
    * constructs a new abstract motion controller
    * @param scene the scene to which the model of the controller will be added
    * @param layout The profile layout to load
    * @param gamepadObject The gamepad object correlating to this controller
    * @param handness handness (left/right/none) of this controller
    * @param _doNotLoadControllerMesh set this flag to ignore the mesh loading
    */
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    layout: IMotionControllerLayout,
    /**
    * The gamepad object correlating to this controller
    */
  gamepadObject: IMinimalMotionControllerObject,
    /**
    * handness (left/right/none) of this controller
    */
  handness: MotionControllerHandness
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    layout: IMotionControllerLayout,
    /**
    * The gamepad object correlating to this controller
    */
  gamepadObject: IMinimalMotionControllerObject,
    /**
    * handness (left/right/none) of this controller
    */
  handness: MotionControllerHandness,
    _doNotLoadControllerMesh: Boolean
  ) = this()
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

