package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Friction
import typings.babylonjs.anon.ImpostorSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebXRControllerPhysicsOptions extends js.Object {
  /**
    * Should the headset get its own impostor
    */
  var enableHeadsetImpostor: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional parameters for the headset impostor
    */
  var headsetImpostorParams: js.UndefOr[Friction] = js.undefined
  /**
    * The physics properties of the future impostors
    */
  var physicsProperties: js.UndefOr[ImpostorSize] = js.undefined
  /**
    * the xr input to use with this pointer selection
    */
  var xrInput: WebXRInput
}

object IWebXRControllerPhysicsOptions {
  @scala.inline
  def apply(
    xrInput: WebXRInput,
    enableHeadsetImpostor: js.UndefOr[Boolean] = js.undefined,
    headsetImpostorParams: Friction = null,
    physicsProperties: ImpostorSize = null
  ): IWebXRControllerPhysicsOptions = {
    val __obj = js.Dynamic.literal(xrInput = xrInput.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHeadsetImpostor)) __obj.updateDynamic("enableHeadsetImpostor")(enableHeadsetImpostor.get.asInstanceOf[js.Any])
    if (headsetImpostorParams != null) __obj.updateDynamic("headsetImpostorParams")(headsetImpostorParams.asInstanceOf[js.Any])
    if (physicsProperties != null) __obj.updateDynamic("physicsProperties")(physicsProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRControllerPhysicsOptions]
  }
}

