package typings.babylonjs.webXRInputSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebXRControllerOptions extends js.Object {
  /**
    * Should the controller mesh be animated when a user interacts with it
    * The pressed buttons / thumbstick and touchpad animations will be disabled
    */
  var disableMotionControllerAnimation: js.UndefOr[Boolean] = js.undefined
  /**
    * Do not load the controller mesh, in case a different mesh needs to be loaded.
    */
  var doNotLoadControllerMesh: js.UndefOr[Boolean] = js.undefined
  /**
    * Force a specific controller type for this controller.
    * This can be used when creating your own profile or when testing different controllers
    */
  var forceControllerProfile: js.UndefOr[String] = js.undefined
}

object IWebXRControllerOptions {
  @scala.inline
  def apply(
    disableMotionControllerAnimation: js.UndefOr[Boolean] = js.undefined,
    doNotLoadControllerMesh: js.UndefOr[Boolean] = js.undefined,
    forceControllerProfile: String = null
  ): IWebXRControllerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableMotionControllerAnimation)) __obj.updateDynamic("disableMotionControllerAnimation")(disableMotionControllerAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotLoadControllerMesh)) __obj.updateDynamic("doNotLoadControllerMesh")(doNotLoadControllerMesh.asInstanceOf[js.Any])
    if (forceControllerProfile != null) __obj.updateDynamic("forceControllerProfile")(forceControllerProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRControllerOptions]
  }
}

