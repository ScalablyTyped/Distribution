package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandedness
import typings.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/motionController/webXROculusTouchMotionController", JSImport.Namespace)
@js.native
object webXROculusTouchMotionControllerMod extends js.Object {
  
  @js.native
  class WebXROculusTouchMotionController protected () extends WebXRAbstractMotionController {
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness
    ) = this()
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness,
      legacyMapping: Boolean
    ) = this()
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness,
      legacyMapping: js.UndefOr[scala.Nothing],
      _forceLegacyControllers: Boolean
    ) = this()
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness,
      legacyMapping: Boolean,
      _forceLegacyControllers: Boolean
    ) = this()
    
    var _forceLegacyControllers: js.Any = js.native
    
    /**
      * Is this the new type of oculus touch. At the moment both have the same profile and it is impossible to differentiate
      * between the touch and touch 2.
      */
    var _isQuest: js.Any = js.native
    
    var _modelRootNode: js.Any = js.native
    
    /* protected */ def _updateModel(): Unit = js.native
  }
  /* static members */
  @js.native
  object WebXROculusTouchMotionController extends js.Object {
    
    /**
      * The base url used to load the left and right controller models
      */
    var MODEL_BASE_URL: String = js.native
    
    /**
      * The name of the left controller model file
      */
    var MODEL_LEFT_FILENAME: String = js.native
    
    /**
      * The name of the right controller model file
      */
    var MODEL_RIGHT_FILENAME: String = js.native
    
    /**
      * Base Url for the Quest controller model.
      */
    var QUEST_MODEL_BASE_URL: String = js.native
  }
}
