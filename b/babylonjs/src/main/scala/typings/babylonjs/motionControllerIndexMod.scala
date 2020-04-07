package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.webXRAbstractMotionControllerMod.IMotionControllerLayout
import typings.babylonjs.webXRAbstractMotionControllerMod.IMotionControllerProfile
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerComponentType
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandness
import typings.babylonjs.webXRMotionControllerManagerMod.MotionControllerConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/XR/motionController/index", JSImport.Namespace)
@js.native
object motionControllerIndexMod extends js.Object {
  @js.native
  abstract class WebXRAbstractMotionController protected ()
    extends typings.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController {
    /**
      * constructs a new abstract motion controller
      * @param scene the scene to which the model of the controller will be added
      * @param layout The profile layout to load
      * @param gamepadObject The gamepad object correlating to this controller
      * @param handness handness (left/right/none) of this controller
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
      * handness (left/right/none) of this controller
      */
    handness: MotionControllerHandness
    ) = this()
    def this(
      scene: Scene,
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
  }
  
  @js.native
  class WebXRControllerComponent protected ()
    extends typings.babylonjs.webXRControllerComponentMod.WebXRControllerComponent {
    /**
      * Creates a new component for a motion controller.
      * It is created by the motion controller itself
      *
      * @param id the id of this component
      * @param type the type of the component
      * @param _buttonIndex index in the buttons array of the gamepad
      * @param _axesIndices indices of the values in the axes array of the gamepad
      */
    def this(
      /**
      * the id of this component
      */
    id: String,
      /**
      * the type of the component
      */
    `type`: MotionControllerComponentType
    ) = this()
    def this(
      /**
      * the id of this component
      */
    id: String,
      /**
      * the type of the component
      */
    `type`: MotionControllerComponentType,
      _buttonIndex: Double
    ) = this()
    def this(
      /**
      * the id of this component
      */
    id: String,
      /**
      * the type of the component
      */
    `type`: MotionControllerComponentType,
      _buttonIndex: Double,
      _axesIndices: js.Array[Double]
    ) = this()
  }
  
  @js.native
  class WebXRGenericTriggerMotionController protected ()
    extends typings.babylonjs.webXRGenericMotionControllerMod.WebXRGenericTriggerMotionController {
    def this(scene: Scene, gamepadObject: IMinimalMotionControllerObject, handness: MotionControllerHandness) = this()
  }
  
  @js.native
  class WebXRHTCViveMotionController protected ()
    extends typings.babylonjs.webXRHTCViveMotionControllerMod.WebXRHTCViveMotionController {
    /**
      * Create a new Vive motion controller object
      * @param scene the scene to use to create this controller
      * @param gamepadObject the corresponding gamepad object
      * @param handness the handness of the controller
      */
    def this(scene: Scene, gamepadObject: IMinimalMotionControllerObject, handness: MotionControllerHandness) = this()
  }
  
  @js.native
  class WebXRMicrosoftMixedRealityController protected ()
    extends typings.babylonjs.webXRMicrosoftMixedRealityControllerMod.WebXRMicrosoftMixedRealityController {
    def this(scene: Scene, gamepadObject: IMinimalMotionControllerObject, handness: MotionControllerHandness) = this()
  }
  
  @js.native
  class WebXRMotionControllerManager ()
    extends typings.babylonjs.webXRMotionControllerManagerMod.WebXRMotionControllerManager
  
  @js.native
  class WebXROculusTouchMotionController protected ()
    extends typings.babylonjs.webXROculusTouchMotionControllerMod.WebXROculusTouchMotionController {
    def this(scene: Scene, gamepadObject: IMinimalMotionControllerObject, handness: MotionControllerHandness) = this()
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handness: MotionControllerHandness,
      legacyMapping: Boolean
    ) = this()
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handness: MotionControllerHandness,
      legacyMapping: Boolean,
      _forceLegacyControllers: Boolean
    ) = this()
  }
  
  @js.native
  class WebXRProfiledMotionController protected ()
    extends typings.babylonjs.webXRProfiledMotionControllerMod.WebXRProfiledMotionController {
    def this(scene: Scene, xrInput: XRInputSource, _profile: IMotionControllerProfile, _repositoryUrl: String) = this()
  }
  
  /* static members */
  @js.native
  object WebXRControllerComponent extends js.Object {
    /**
      * button component type
      */
    var BUTTON_TYPE: MotionControllerComponentType = js.native
    /**
      * squeeze component type
      */
    var SQUEEZE_TYPE: MotionControllerComponentType = js.native
    /**
      * Thumbstick component type
      */
    var THUMBSTICK_TYPE: MotionControllerComponentType = js.native
    /**
      * Touchpad component type
      */
    var TOUCHPAD_TYPE: MotionControllerComponentType = js.native
    /**
      * trigger component type
      */
    var TRIGGER_TYPE: MotionControllerComponentType = js.native
  }
  
  /* static members */
  @js.native
  object WebXRGenericTriggerMotionController extends js.Object {
    /**
      * Static version of the profile id of this controller
      */
    var ProfileId: String = js.native
  }
  
  /* static members */
  @js.native
  object WebXRHTCViveMotionController extends js.Object {
    /**
      * The base url used to load the left and right controller models
      */
    var MODEL_BASE_URL: String = js.native
    /**
      * File name for the controller model.
      */
    var MODEL_FILENAME: String = js.native
  }
  
  /* static members */
  @js.native
  object WebXRMicrosoftMixedRealityController extends js.Object {
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
  }
  
  /* static members */
  @js.native
  object WebXRMotionControllerManager extends js.Object {
    /**
      * The base URL of the online controller repository. Can be changed at any time.
      */
    var BaseRepositoryUrl: String = js.native
    /**
      * Which repository gets priority - local or online
      */
    var PrioritizeOnlineRepository: Boolean = js.native
    /**
      * Use the online repository, or use only locally-defined controllers
      */
    var UseOnlineRepository: Boolean = js.native
    var _AvailableControllers: js.Any = js.native
    var _Fallbacks: js.Any = js.native
    var _LoadProfileFromRepository: js.Any = js.native
    var _LoadProfilesFromAvailableControllers: js.Any = js.native
    var _ProfileLoadingPromises: js.Any = js.native
    var _ProfilesList: js.Any = js.native
    /**
      * Clear the cache used for profile loading and reload when requested again
      */
    def ClearProfilesCache(): Unit = js.native
    /**
      * Register the default fallbacks.
      * This function is called automatically when this file is imported.
      */
    def DefaultFallbacks(): Unit = js.native
    /**
      * Find a fallback profile if the profile was not found. There are a few predefined generic profiles.
      * @param profileId the profile to which a fallback needs to be found
      * @return an array with corresponding fallback profiles
      */
    def FindFallbackWithProfileId(profileId: String): js.Array[String] = js.native
    /**
      * When acquiring a new xrInput object (usually by the WebXRInput class), match it with the correct profile.
      * The order of search:
      *
      * 1) Iterate the profiles array of the xr input and try finding a corresponding motion controller
      * 2) (If not found) search in the gamepad id and try using it (legacy versions only)
      * 3) search for registered fallbacks (should be redundant, nonetheless it makes sense to check)
      * 4) return the generic trigger controller if none were found
      *
      * @param xrInput the xrInput to which a new controller is initialized
      * @param scene the scene to which the model will be added
      * @param forceProfile force a certain profile for this controller
      * @return A promise that fulfils with the motion controller class for this profile id or the generic standard class if none was found
      */
    def GetMotionControllerWithXRInput(xrInput: XRInputSource, scene: Scene): js.Promise[typings.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController] = js.native
    def GetMotionControllerWithXRInput(xrInput: XRInputSource, scene: Scene, forceProfile: String): js.Promise[typings.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController] = js.native
    /**
      * Register a new controller based on its profile. This function will be called by the controller classes themselves.
      *
      * If you are missing a profile, make sure it is imported in your source, otherwise it will not register.
      *
      * @param type the profile type to register
      * @param constructFunction the function to be called when loading this profile
      */
    def RegisterController(`type`: String, constructFunction: MotionControllerConstructor): Unit = js.native
    /**
      * Register a fallback to a specific profile.
      * @param profileId the profileId that will receive the fallbacks
      * @param fallbacks A list of fallback profiles
      */
    def RegisterFallbacksForProfileId(profileId: String, fallbacks: js.Array[String]): Unit = js.native
    /**
      * Will update the list of profiles available in the repository
      * @return a promise that resolves to a map of profiles available online
      */
    def UpdateProfilesList(): js.Promise[StringDictionary[String]] = js.native
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

