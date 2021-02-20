package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.MotionControllerConstructor
import typings.babylonjs.XRInputSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRMotionControllerManager")
@js.native
class WebXRMotionControllerManager ()
  extends typings.babylonjs.BABYLON.WebXRMotionControllerManager
/* static members */
object WebXRMotionControllerManager {
  
  @JSGlobal("BABYLON.WebXRMotionControllerManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The base URL of the online controller repository. Can be changed at any time.
    */
  @JSGlobal("BABYLON.WebXRMotionControllerManager.BaseRepositoryUrl")
  @js.native
  def BaseRepositoryUrl: String = js.native
  @scala.inline
  def BaseRepositoryUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BaseRepositoryUrl")(x.asInstanceOf[js.Any])
  
  /**
    * Clear the cache used for profile loading and reload when requested again
    */
  @JSGlobal("BABYLON.WebXRMotionControllerManager.ClearProfilesCache")
  @js.native
  def ClearProfilesCache(): Unit = js.native
  
  /**
    * Register the default fallbacks.
    * This function is called automatically when this file is imported.
    */
  @JSGlobal("BABYLON.WebXRMotionControllerManager.DefaultFallbacks")
  @js.native
  def DefaultFallbacks(): Unit = js.native
  
  /**
    * Find a fallback profile if the profile was not found. There are a few predefined generic profiles.
    * @param profileId the profile to which a fallback needs to be found
    * @return an array with corresponding fallback profiles
    */
  @JSGlobal("BABYLON.WebXRMotionControllerManager.FindFallbackWithProfileId")
  @js.native
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
  @JSGlobal("BABYLON.WebXRMotionControllerManager.GetMotionControllerWithXRInput")
  @js.native
  def GetMotionControllerWithXRInput(xrInput: XRInputSource, scene: typings.babylonjs.BABYLON.Scene): js.Promise[typings.babylonjs.BABYLON.WebXRAbstractMotionController] = js.native
  @JSGlobal("BABYLON.WebXRMotionControllerManager.GetMotionControllerWithXRInput")
  @js.native
  def GetMotionControllerWithXRInput(xrInput: XRInputSource, scene: typings.babylonjs.BABYLON.Scene, forceProfile: String): js.Promise[typings.babylonjs.BABYLON.WebXRAbstractMotionController] = js.native
  
  /**
    * Which repository gets priority - local or online
    */
  @JSGlobal("BABYLON.WebXRMotionControllerManager.PrioritizeOnlineRepository")
  @js.native
  def PrioritizeOnlineRepository: Boolean = js.native
  @scala.inline
  def PrioritizeOnlineRepository_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrioritizeOnlineRepository")(x.asInstanceOf[js.Any])
  
  /**
    * Register a new controller based on its profile. This function will be called by the controller classes themselves.
    *
    * If you are missing a profile, make sure it is imported in your source, otherwise it will not register.
    *
    * @param type the profile type to register
    * @param constructFunction the function to be called when loading this profile
    */
  @JSGlobal("BABYLON.WebXRMotionControllerManager.RegisterController")
  @js.native
  def RegisterController(`type`: String, constructFunction: MotionControllerConstructor): Unit = js.native
  
  /**
    * Register a fallback to a specific profile.
    * @param profileId the profileId that will receive the fallbacks
    * @param fallbacks A list of fallback profiles
    */
  @JSGlobal("BABYLON.WebXRMotionControllerManager.RegisterFallbacksForProfileId")
  @js.native
  def RegisterFallbacksForProfileId(profileId: String, fallbacks: js.Array[String]): Unit = js.native
  
  /**
    * Will update the list of profiles available in the repository
    * @return a promise that resolves to a map of profiles available online
    */
  @JSGlobal("BABYLON.WebXRMotionControllerManager.UpdateProfilesList")
  @js.native
  def UpdateProfilesList(): js.Promise[org.scalablytyped.runtime.StringDictionary[String]] = js.native
  
  /**
    * Use the online repository, or use only locally-defined controllers
    */
  @JSGlobal("BABYLON.WebXRMotionControllerManager.UseOnlineRepository")
  @js.native
  def UseOnlineRepository: Boolean = js.native
  @scala.inline
  def UseOnlineRepository_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UseOnlineRepository")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebXRMotionControllerManager._AvailableControllers")
  @js.native
  def _AvailableControllers: js.Any = js.native
  @scala.inline
  def _AvailableControllers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AvailableControllers")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebXRMotionControllerManager._Fallbacks")
  @js.native
  def _Fallbacks: js.Any = js.native
  @scala.inline
  def _Fallbacks_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Fallbacks")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebXRMotionControllerManager._LoadProfileFromRepository")
  @js.native
  def _LoadProfileFromRepository: js.Any = js.native
  @scala.inline
  def _LoadProfileFromRepository_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LoadProfileFromRepository")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebXRMotionControllerManager._LoadProfilesFromAvailableControllers")
  @js.native
  def _LoadProfilesFromAvailableControllers: js.Any = js.native
  @scala.inline
  def _LoadProfilesFromAvailableControllers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LoadProfilesFromAvailableControllers")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebXRMotionControllerManager._ProfileLoadingPromises")
  @js.native
  def _ProfileLoadingPromises: js.Any = js.native
  @scala.inline
  def _ProfileLoadingPromises_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProfileLoadingPromises")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebXRMotionControllerManager._ProfilesList")
  @js.native
  def _ProfilesList: js.Any = js.native
  @scala.inline
  def _ProfilesList_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProfilesList")(x.asInstanceOf[js.Any])
}
