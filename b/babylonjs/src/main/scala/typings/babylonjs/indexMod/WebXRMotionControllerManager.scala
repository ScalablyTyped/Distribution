package typings.babylonjs.indexMod

import typings.babylonjs.XRInputSource
import typings.babylonjs.webXRMotionControllerManagerMod.MotionControllerConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "WebXRMotionControllerManager")
@js.native
class WebXRMotionControllerManager ()
  extends typings.babylonjs.xRIndexMod.WebXRMotionControllerManager

/* static members */
@JSImport("babylonjs/index", "WebXRMotionControllerManager")
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
  def GetMotionControllerWithXRInput(xrInput: XRInputSource, scene: typings.babylonjs.sceneMod.Scene): js.Promise[typings.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController] = js.native
  def GetMotionControllerWithXRInput(xrInput: XRInputSource, scene: typings.babylonjs.sceneMod.Scene, forceProfile: String): js.Promise[typings.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController] = js.native
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
  def UpdateProfilesList(): js.Promise[org.scalablytyped.runtime.StringDictionary[String]] = js.native
}

