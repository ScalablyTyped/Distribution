package typings.babylonjs.xRIndexMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandedness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRMicrosoftMixedRealityController")
@js.native
open class WebXRMicrosoftMixedRealityController protected ()
  extends typings.babylonjs.motionControllerIndexMod.WebXRMicrosoftMixedRealityController {
  def this(
    scene: Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handedness: MotionControllerHandedness
  ) = this()
}
/* static members */
object WebXRMicrosoftMixedRealityController {
  
  @JSImport("babylonjs/XR/index", "WebXRMicrosoftMixedRealityController")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The base url used to load the left and right controller models
    */
  @JSImport("babylonjs/XR/index", "WebXRMicrosoftMixedRealityController.MODEL_BASE_URL")
  @js.native
  def MODEL_BASE_URL: String = js.native
  inline def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
  
  /**
    * The name of the left controller model file
    */
  @JSImport("babylonjs/XR/index", "WebXRMicrosoftMixedRealityController.MODEL_LEFT_FILENAME")
  @js.native
  def MODEL_LEFT_FILENAME: String = js.native
  inline def MODEL_LEFT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_LEFT_FILENAME")(x.asInstanceOf[js.Any])
  
  /**
    * The name of the right controller model file
    */
  @JSImport("babylonjs/XR/index", "WebXRMicrosoftMixedRealityController.MODEL_RIGHT_FILENAME")
  @js.native
  def MODEL_RIGHT_FILENAME: String = js.native
  inline def MODEL_RIGHT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_RIGHT_FILENAME")(x.asInstanceOf[js.Any])
}
