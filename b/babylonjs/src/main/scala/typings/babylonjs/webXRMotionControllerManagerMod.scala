package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRMotionControllerManagerMod {
  
  @JSImport("babylonjs/XR/motionController/webXRMotionControllerManager", "WebXRMotionControllerManager")
  @js.native
  open class WebXRMotionControllerManager () extends StObject
  /* static members */
  object WebXRMotionControllerManager {
    
    @JSImport("babylonjs/XR/motionController/webXRMotionControllerManager", "WebXRMotionControllerManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The base URL of the online controller repository. Can be changed at any time.
      */
    @JSImport("babylonjs/XR/motionController/webXRMotionControllerManager", "WebXRMotionControllerManager.BaseRepositoryUrl")
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
    @JSImport("babylonjs/XR/motionController/webXRMotionControllerManager", "WebXRMotionControllerManager.DisableControllerCache")
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
    inline def GetMotionControllerWithXRInput(xrInput: XRInputSource, scene: Scene): js.Promise[WebXRAbstractMotionController] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetMotionControllerWithXRInput")(xrInput.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebXRAbstractMotionController]]
    inline def GetMotionControllerWithXRInput(xrInput: XRInputSource, scene: Scene, forceProfile: String): js.Promise[WebXRAbstractMotionController] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetMotionControllerWithXRInput")(xrInput.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], forceProfile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebXRAbstractMotionController]]
    
    /**
      * Which repository gets priority - local or online
      */
    @JSImport("babylonjs/XR/motionController/webXRMotionControllerManager", "WebXRMotionControllerManager.PrioritizeOnlineRepository")
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
    @JSImport("babylonjs/XR/motionController/webXRMotionControllerManager", "WebXRMotionControllerManager.UseOnlineRepository")
    @js.native
    def UseOnlineRepository: Boolean = js.native
    inline def UseOnlineRepository_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UseOnlineRepository")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/XR/motionController/webXRMotionControllerManager", "WebXRMotionControllerManager._AvailableControllers")
    @js.native
    def _AvailableControllers: Any = js.native
    inline def _AvailableControllers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AvailableControllers")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/XR/motionController/webXRMotionControllerManager", "WebXRMotionControllerManager._Fallbacks")
    @js.native
    def _Fallbacks: Any = js.native
    inline def _Fallbacks_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Fallbacks")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/XR/motionController/webXRMotionControllerManager", "WebXRMotionControllerManager._LoadProfileFromRepository")
    @js.native
    def _LoadProfileFromRepository: Any = js.native
    inline def _LoadProfileFromRepository_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LoadProfileFromRepository")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/XR/motionController/webXRMotionControllerManager", "WebXRMotionControllerManager._LoadProfilesFromAvailableControllers")
    @js.native
    def _LoadProfilesFromAvailableControllers: Any = js.native
    inline def _LoadProfilesFromAvailableControllers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LoadProfilesFromAvailableControllers")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/XR/motionController/webXRMotionControllerManager", "WebXRMotionControllerManager._ProfileLoadingPromises")
    @js.native
    def _ProfileLoadingPromises: Any = js.native
    inline def _ProfileLoadingPromises_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProfileLoadingPromises")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/XR/motionController/webXRMotionControllerManager", "WebXRMotionControllerManager._ProfilesList")
    @js.native
    def _ProfilesList: Any = js.native
    inline def _ProfilesList_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProfilesList")(x.asInstanceOf[js.Any])
  }
  
  type MotionControllerConstructor = js.Function2[/* xrInput */ XRInputSource, /* scene */ Scene, WebXRAbstractMotionController]
}
