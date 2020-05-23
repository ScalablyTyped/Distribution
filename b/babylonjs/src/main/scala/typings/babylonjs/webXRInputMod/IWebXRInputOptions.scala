package typings.babylonjs.webXRInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebXRInputOptions extends js.Object {
  /**
    * A custom URL for the controllers repository
    */
  var customControllersRepositoryURL: js.UndefOr[String] = js.undefined
  /**
    * Should the controller model's components not move according to the user input
    */
  var disableControllerAnimation: js.UndefOr[Boolean] = js.undefined
  /**
    * Do not send a request to the controller repository to load the profile.
    *
    * Instead, use the controllers available in babylon itself.
    */
  var disableOnlineControllerRepository: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true no model will be automatically loaded
    */
  var doNotLoadControllerMeshes: js.UndefOr[Boolean] = js.undefined
  /**
    * If set, this profile will be used for all controllers loaded (for example "microsoft-mixed-reality")
    * If not found, the xr input profile data will be used.
    * Profiles are defined here - https://github.com/immersive-web/webxr-input-profiles/
    */
  var forceInputProfile: js.UndefOr[String] = js.undefined
}

object IWebXRInputOptions {
  @scala.inline
  def apply(
    customControllersRepositoryURL: String = null,
    disableControllerAnimation: js.UndefOr[Boolean] = js.undefined,
    disableOnlineControllerRepository: js.UndefOr[Boolean] = js.undefined,
    doNotLoadControllerMeshes: js.UndefOr[Boolean] = js.undefined,
    forceInputProfile: String = null
  ): IWebXRInputOptions = {
    val __obj = js.Dynamic.literal()
    if (customControllersRepositoryURL != null) __obj.updateDynamic("customControllersRepositoryURL")(customControllersRepositoryURL.asInstanceOf[js.Any])
    if (!js.isUndefined(disableControllerAnimation)) __obj.updateDynamic("disableControllerAnimation")(disableControllerAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableOnlineControllerRepository)) __obj.updateDynamic("disableOnlineControllerRepository")(disableOnlineControllerRepository.get.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotLoadControllerMeshes)) __obj.updateDynamic("doNotLoadControllerMeshes")(doNotLoadControllerMeshes.get.asInstanceOf[js.Any])
    if (forceInputProfile != null) __obj.updateDynamic("forceInputProfile")(forceInputProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRInputOptions]
  }
}

