package typings.babylonjs.BABYLON

import typings.babylonjs.AnonFriction
import typings.babylonjs.AnonImpostorSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.IWebXRControllerPhysicsOptions")
@js.native
class IWebXRControllerPhysicsOptions () extends js.Object {
  /**
    * Should the headset get its own impostor
    */
  var enableHeadsetImpostor: js.UndefOr[Boolean] = js.native
  /**
    * Optional parameters for the headset impostor
    */
  var headsetImpostorParams: js.UndefOr[AnonFriction] = js.native
  /**
    * The physics properties of the future impostors
    */
  var physicsProperties: js.UndefOr[AnonImpostorSize] = js.native
  /**
    * the xr input to use with this pointer selection
    */
  var xrInput: WebXRInput = js.native
}

