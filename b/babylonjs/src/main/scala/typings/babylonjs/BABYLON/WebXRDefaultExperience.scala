package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebXRDefaultExperience extends js.Object {
  /**
    * Base experience
    */
  var baseExperience: WebXRExperienceHelper
  /**
    * Enables ui for entering/exiting xr
    */
  var enterExitUI: WebXREnterExitUI
  /**
    * Input experience extension
    */
  var input: WebXRInput
  /**
    * Enables laser pointer and selection
    */
  var pointerSelection: WebXRControllerPointerSelection
  /**
    * Default target xr should render to
    */
  var renderTarget: WebXRRenderTarget
  /**
    * Enables teleportation
    */
  var teleportation: WebXRMotionControllerTeleportation
  /**
    * DIsposes of the experience helper
    */
  def dispose(): Unit
}

object WebXRDefaultExperience {
  @scala.inline
  def apply(
    baseExperience: WebXRExperienceHelper,
    dispose: () => Unit,
    enterExitUI: WebXREnterExitUI,
    input: WebXRInput,
    pointerSelection: WebXRControllerPointerSelection,
    renderTarget: WebXRRenderTarget,
    teleportation: WebXRMotionControllerTeleportation
  ): WebXRDefaultExperience = {
    val __obj = js.Dynamic.literal(baseExperience = baseExperience.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), enterExitUI = enterExitUI.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], pointerSelection = pointerSelection.asInstanceOf[js.Any], renderTarget = renderTarget.asInstanceOf[js.Any], teleportation = teleportation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebXRDefaultExperience]
  }
}

