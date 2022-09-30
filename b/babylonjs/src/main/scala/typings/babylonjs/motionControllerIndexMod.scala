package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.Filename
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.webXRAbstractMotionControllerMod.IMotionControllerLayout
import typings.babylonjs.webXRAbstractMotionControllerMod.IMotionControllerProfile
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerComponentType
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandedness
import typings.babylonjs.webXRMotionControllerManagerMod.MotionControllerConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object motionControllerIndexMod {
  
  @JSImport("babylonjs/XR/motionController/index", "WebXRAbstractMotionController")
  @js.native
  abstract class WebXRAbstractMotionController protected ()
    extends typings.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController {
    /**
      * constructs a new abstract motion controller
      * @param scene the scene to which the model of the controller will be added
      * @param layout The profile layout to load
      * @param gamepadObject The gamepad object correlating to this controller
      * @param handedness handedness (left/right/none) of this controller
      * @param _doNotLoadControllerMesh set this flag to ignore the mesh loading
      * @param _controllerCache a cache holding controller models already loaded in this session
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
      /**
      * @internal
      */
    _doNotLoadControllerMesh: Boolean
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
      /**
      * @internal
      */
    _doNotLoadControllerMesh: Boolean,
      _controllerCache: js.Array[Filename]
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
      /**
      * @internal
      */
    _doNotLoadControllerMesh: Unit,
      _controllerCache: js.Array[Filename]
    ) = this()
  }
  
  @JSImport("babylonjs/XR/motionController/index", "WebXRControllerComponent")
  @js.native
  open class WebXRControllerComponent protected ()
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
    def this(
      /**
      * the id of this component
      */
    id: String,
      /**
      * the type of the component
      */
    `type`: MotionControllerComponentType,
      _buttonIndex: Unit,
      _axesIndices: js.Array[Double]
    ) = this()
  }
  /* static members */
  object WebXRControllerComponent {
    
    @JSImport("babylonjs/XR/motionController/index", "WebXRControllerComponent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * button component type
      */
    @JSImport("babylonjs/XR/motionController/index", "WebXRControllerComponent.BUTTON_TYPE")
    @js.native
    def BUTTON_TYPE: MotionControllerComponentType = js.native
    inline def BUTTON_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_TYPE")(x.asInstanceOf[js.Any])
    
    /**
      * squeeze component type
      */
    @JSImport("babylonjs/XR/motionController/index", "WebXRControllerComponent.SQUEEZE_TYPE")
    @js.native
    def SQUEEZE_TYPE: MotionControllerComponentType = js.native
    inline def SQUEEZE_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SQUEEZE_TYPE")(x.asInstanceOf[js.Any])
    
    /**
      * Thumbstick component type
      */
    @JSImport("babylonjs/XR/motionController/index", "WebXRControllerComponent.THUMBSTICK_TYPE")
    @js.native
    def THUMBSTICK_TYPE: MotionControllerComponentType = js.native
    inline def THUMBSTICK_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THUMBSTICK_TYPE")(x.asInstanceOf[js.Any])
    
    /**
      * Touchpad component type
      */
    @JSImport("babylonjs/XR/motionController/index", "WebXRControllerComponent.TOUCHPAD_TYPE")
    @js.native
    def TOUCHPAD_TYPE: MotionControllerComponentType = js.native
    inline def TOUCHPAD_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCHPAD_TYPE")(x.asInstanceOf[js.Any])
    
    /**
      * trigger component type
      */
    @JSImport("babylonjs/XR/motionController/index", "WebXRControllerComponent.TRIGGER_TYPE")
    @js.native
    def TRIGGER_TYPE: MotionControllerComponentType = js.native
    inline def TRIGGER_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRIGGER_TYPE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/XR/motionController/index", "WebXRGenericHandController")
  @js.native
  open class WebXRGenericHandController protected ()
    extends typings.babylonjs.webXRGenericHandControllerMod.WebXRGenericHandController {
    /**
      * Create a new hand controller object, without loading a controller model
      * @param scene the scene to use to create this controller
      * @param gamepadObject the corresponding gamepad object
      * @param handedness the handedness of the controller
      */
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness
    ) = this()
  }
  
  @JSImport("babylonjs/XR/motionController/index", "WebXRGenericTriggerMotionController")
  @js.native
  open class WebXRGenericTriggerMotionController protected ()
    extends typings.babylonjs.webXRGenericMotionControllerMod.WebXRGenericTriggerMotionController {
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness
    ) = this()
  }
  /* static members */
  object WebXRGenericTriggerMotionController {
    
    @JSImport("babylonjs/XR/motionController/index", "WebXRGenericTriggerMotionController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Static version of the profile id of this controller
      */
    @JSImport("babylonjs/XR/motionController/index", "WebXRGenericTriggerMotionController.ProfileId")
    @js.native
    def ProfileId: String = js.native
    inline def ProfileId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProfileId")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/XR/motionController/index", "WebXRHTCViveMotionController")
  @js.native
  open class WebXRHTCViveMotionController protected ()
    extends typings.babylonjs.webXRHTCViveMotionControllerMod.WebXRHTCViveMotionController {
    /**
      * Create a new Vive motion controller object
      * @param scene the scene to use to create this controller
      * @param gamepadObject the corresponding gamepad object
      * @param handedness the handedness of the controller
      */
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness
    ) = this()
  }
  /* static members */
  object WebXRHTCViveMotionController {
    
    @JSImport("babylonjs/XR/motionController/index", "WebXRHTCViveMotionController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The base url used to load the left and right controller models
      */
    @JSImport("babylonjs/XR/motionController/index", "WebXRHTCViveMotionController.MODEL_BASE_URL")
    @js.native
    def MODEL_BASE_URL: String = js.native
    inline def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
    
    /**
      * File name for the controller model.
      */
    @JSImport("babylonjs/XR/motionController/index", "WebXRHTCViveMotionController.MODEL_FILENAME")
    @js.native
    def MODEL_FILENAME: String = js.native
    inline def MODEL_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_FILENAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/XR/motionController/index", "WebXRMicrosoftMixedRealityController")
  @js.native
  open class WebXRMicrosoftMixedRealityController protected ()
    extends typings.babylonjs.webXRMicrosoftMixedRealityControllerMod.WebXRMicrosoftMixedRealityController {
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness
    ) = this()
  }
  /* static members */
  object WebXRMicrosoftMixedRealityController {
    
    @JSImport("babylonjs/XR/motionController/index", "WebXRMicrosoftMixedRealityController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The base url used to load the left and right controller models
      */
    @JSImport("babylonjs/XR/motionController/index", "WebXRMicrosoftMixedRealityController.MODEL_BASE_URL")
    @js.native
    def MODEL_BASE_URL: String = js.native
    inline def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
    
    /**
      * The name of the left controller model file
      */
    @JSImport("babylonjs/XR/motionController/index", "WebXRMicrosoftMixedRealityController.MODEL_LEFT_FILENAME")
    @js.native
    def MODEL_LEFT_FILENAME: String = js.native
    inline def MODEL_LEFT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_LEFT_FILENAME")(x.asInstanceOf[js.Any])
    
    /**
      * The name of the right controller model file
      */
    @JSImport("babylonjs/XR/motionController/index", "WebXRMicrosoftMixedRealityController.MODEL_RIGHT_FILENAME")
    @js.native
    def MODEL_RIGHT_FILENAME: String = js.native
    inline def MODEL_RIGHT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_RIGHT_FILENAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/XR/motionController/index", "WebXRMotionControllerManager")
  @js.native
  open class WebXRMotionControllerManager ()
    extends typings.babylonjs.webXRMotionControllerManagerMod.WebXRMotionControllerManager
  /* static members */
  object WebXRMotionControllerManager {
    
    @JSImport("babylonjs/XR/motionController/index", "WebXRMotionControllerManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The base URL of the online controller repository. Can be changed at any time.
      */
    @JSImport("babylonjs/XR/motionController/index", "WebXRMotionControllerManager.BaseRepositoryUrl")
    @js.native
    def BaseRepositoryUrl: String = js.native
    inline def BaseRepositoryUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BaseRepositoryUrl")(x.asInstanceOf[js.Any])
    
    /**
      * Clear the controller's cache (usually happens at the end of a session)
      */
    inline def ClearControllerCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearControllerCache")().asInstanceOf[Unit]
    
    /**
      * Clear the cache used for profile loading and reload when requested again
      */
    inline def ClearProfilesCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearProfilesCache")().asInstanceOf[Unit]
    
    /**
      * Register the default fallbacks.
      * This function is called automatically when this file is imported.
      */
    inline def DefaultFallbacks(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultFallbacks")().asInstanceOf[Unit]
    
    /**
      * Disable the controller cache and load the models each time a new WebXRProfileMotionController is loaded.
      * Defaults to true.
      */
    @JSImport("babylonjs/XR/motionController/index", "WebXRMotionControllerManager.DisableControllerCache")
    @js.native
    def DisableControllerCache: Boolean = js.native
    inline def DisableControllerCache_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DisableControllerCache")(x.asInstanceOf[js.Any])
    
    /**
      * Find a fallback profile if the profile was not found. There are a few predefined generic profiles.
      * @param profileId the profile to which a fallback needs to be found
      * @returns an array with corresponding fallback profiles
      */
    inline def FindFallbackWithProfileId(profileId: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("FindFallbackWithProfileId")(profileId.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
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
      * @returns A promise that fulfils with the motion controller class for this profile id or the generic standard class if none was found
      */
    inline def GetMotionControllerWithXRInput(xrInput: XRInputSource, scene: Scene): js.Promise[typings.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetMotionControllerWithXRInput")(xrInput.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController]]
    inline def GetMotionControllerWithXRInput(xrInput: XRInputSource, scene: Scene, forceProfile: String): js.Promise[typings.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetMotionControllerWithXRInput")(xrInput.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], forceProfile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController]]
    
    /**
      * Which repository gets priority - local or online
      */
    @JSImport("babylonjs/XR/motionController/index", "WebXRMotionControllerManager.PrioritizeOnlineRepository")
    @js.native
    def PrioritizeOnlineRepository: Boolean = js.native
    inline def PrioritizeOnlineRepository_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrioritizeOnlineRepository")(x.asInstanceOf[js.Any])
    
    /**
      * Register a new controller based on its profile. This function will be called by the controller classes themselves.
      *
      * If you are missing a profile, make sure it is imported in your source, otherwise it will not register.
      *
      * @param type the profile type to register
      * @param constructFunction the function to be called when loading this profile
      */
    inline def RegisterController(`type`: String, constructFunction: MotionControllerConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterController")(`type`.asInstanceOf[js.Any], constructFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Register a fallback to a specific profile.
      * @param profileId the profileId that will receive the fallbacks
      * @param fallbacks A list of fallback profiles
      */
    inline def RegisterFallbacksForProfileId(profileId: String, fallbacks: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterFallbacksForProfileId")(profileId.asInstanceOf[js.Any], fallbacks.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Will update the list of profiles available in the repository
      * @returns a promise that resolves to a map of profiles available online
      */
    inline def UpdateProfilesList(): js.Promise[StringDictionary[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("UpdateProfilesList")().asInstanceOf[js.Promise[StringDictionary[String]]]
    
    /**
      * Use the online repository, or use only locally-defined controllers
      */
    @JSImport("babylonjs/XR/motionController/index", "WebXRMotionControllerManager.UseOnlineRepository")
    @js.native
    def UseOnlineRepository: Boolean = js.native
    inline def UseOnlineRepository_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UseOnlineRepository")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/XR/motionController/index", "WebXRMotionControllerManager._AvailableControllers")
    @js.native
    def _AvailableControllers: Any = js.native
    inline def _AvailableControllers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AvailableControllers")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/XR/motionController/index", "WebXRMotionControllerManager._Fallbacks")
    @js.native
    def _Fallbacks: Any = js.native
    inline def _Fallbacks_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Fallbacks")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/XR/motionController/index", "WebXRMotionControllerManager._LoadProfileFromRepository")
    @js.native
    def _LoadProfileFromRepository: Any = js.native
    inline def _LoadProfileFromRepository_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LoadProfileFromRepository")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/XR/motionController/index", "WebXRMotionControllerManager._LoadProfilesFromAvailableControllers")
    @js.native
    def _LoadProfilesFromAvailableControllers: Any = js.native
    inline def _LoadProfilesFromAvailableControllers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LoadProfilesFromAvailableControllers")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/XR/motionController/index", "WebXRMotionControllerManager._ProfileLoadingPromises")
    @js.native
    def _ProfileLoadingPromises: Any = js.native
    inline def _ProfileLoadingPromises_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProfileLoadingPromises")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/XR/motionController/index", "WebXRMotionControllerManager._ProfilesList")
    @js.native
    def _ProfilesList: Any = js.native
    inline def _ProfilesList_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProfilesList")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/XR/motionController/index", "WebXROculusTouchMotionController")
  @js.native
  open class WebXROculusTouchMotionController protected ()
    extends typings.babylonjs.webXROculusTouchMotionControllerMod.WebXROculusTouchMotionController {
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness
    ) = this()
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness,
      _legacyMapping: Boolean
    ) = this()
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness,
      _legacyMapping: Boolean,
      _forceLegacyControllers: Boolean
    ) = this()
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness,
      _legacyMapping: Unit,
      _forceLegacyControllers: Boolean
    ) = this()
  }
  /* static members */
  object WebXROculusTouchMotionController {
    
    @JSImport("babylonjs/XR/motionController/index", "WebXROculusTouchMotionController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The base url used to load the left and right controller models
      */
    @JSImport("babylonjs/XR/motionController/index", "WebXROculusTouchMotionController.MODEL_BASE_URL")
    @js.native
    def MODEL_BASE_URL: String = js.native
    inline def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
    
    /**
      * The name of the left controller model file
      */
    @JSImport("babylonjs/XR/motionController/index", "WebXROculusTouchMotionController.MODEL_LEFT_FILENAME")
    @js.native
    def MODEL_LEFT_FILENAME: String = js.native
    inline def MODEL_LEFT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_LEFT_FILENAME")(x.asInstanceOf[js.Any])
    
    /**
      * The name of the right controller model file
      */
    @JSImport("babylonjs/XR/motionController/index", "WebXROculusTouchMotionController.MODEL_RIGHT_FILENAME")
    @js.native
    def MODEL_RIGHT_FILENAME: String = js.native
    inline def MODEL_RIGHT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_RIGHT_FILENAME")(x.asInstanceOf[js.Any])
    
    /**
      * Base Url for the Quest controller model.
      */
    @JSImport("babylonjs/XR/motionController/index", "WebXROculusTouchMotionController.QUEST_MODEL_BASE_URL")
    @js.native
    def QUEST_MODEL_BASE_URL: String = js.native
    inline def QUEST_MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUEST_MODEL_BASE_URL")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/XR/motionController/index", "WebXRProfiledMotionController")
  @js.native
  open class WebXRProfiledMotionController protected ()
    extends typings.babylonjs.webXRProfiledMotionControllerMod.WebXRProfiledMotionController {
    def this(scene: Scene, xrInput: XRInputSource, _profile: IMotionControllerProfile, _repositoryUrl: String) = this()
    def this(
      scene: Scene,
      xrInput: XRInputSource,
      _profile: IMotionControllerProfile,
      _repositoryUrl: String,
      controllerCache: js.Array[Filename]
    ) = this()
  }
}
