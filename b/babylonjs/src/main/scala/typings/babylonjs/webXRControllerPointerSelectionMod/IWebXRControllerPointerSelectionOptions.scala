package typings.babylonjs.webXRControllerPointerSelectionMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRInputMod.WebXRInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebXRControllerPointerSelectionOptions extends js.Object {
  /**
    * if provided, this scene will be used to render meshes.
    */
  var customUtilityLayerScene: js.UndefOr[Scene] = js.undefined
  /**
    * Disable the pointer up event when the xr controller in screen and gaze mode is disposed (meaning - when the user removed the finger from the screen)
    * If not disabled, the last picked point will be used to execute a pointer up event
    * If disabled, pointer up event will be triggered right after the pointer down event.
    * Used in screen and gaze target ray mode only
    */
  var disablePointerUpOnTouchOut: Boolean
  /**
    * For gaze mode (time to select instead of press)
    */
  var forceGazeMode: Boolean
  /**
    * Factor to be applied to the pointer-moved function in the gaze mode. How sensitive should the gaze mode be when checking if the pointer moved
    * to start a new countdown to the pointer down event.
    * Defaults to 1.
    */
  var gazeModePointerMovedFactor: js.UndefOr[Double] = js.undefined
  /**
    * Different button type to use instead of the main component
    */
  var overrideButtonId: js.UndefOr[String] = js.undefined
  /**
    *  use this rendering group id for the meshes (optional)
    */
  var renderingGroupId: js.UndefOr[Double] = js.undefined
  /**
    * The amount of time in milliseconds it takes between pick found something to a pointer down event.
    * Used in gaze modes. Tracked pointer uses the trigger, screen uses touch events
    * 3000 means 3 seconds between pointing at something and selecting it
    */
  var timeToSelect: js.UndefOr[Double] = js.undefined
  /**
    * Should meshes created here be added to a utility layer or the main scene
    */
  var useUtilityLayer: js.UndefOr[Boolean] = js.undefined
  /**
    * the xr input to use with this pointer selection
    */
  var xrInput: WebXRInput
}

object IWebXRControllerPointerSelectionOptions {
  @scala.inline
  def apply(
    disablePointerUpOnTouchOut: Boolean,
    forceGazeMode: Boolean,
    xrInput: WebXRInput,
    customUtilityLayerScene: Scene = null,
    gazeModePointerMovedFactor: Int | Double = null,
    overrideButtonId: String = null,
    renderingGroupId: Int | Double = null,
    timeToSelect: Int | Double = null,
    useUtilityLayer: js.UndefOr[Boolean] = js.undefined
  ): IWebXRControllerPointerSelectionOptions = {
    val __obj = js.Dynamic.literal(disablePointerUpOnTouchOut = disablePointerUpOnTouchOut.asInstanceOf[js.Any], forceGazeMode = forceGazeMode.asInstanceOf[js.Any], xrInput = xrInput.asInstanceOf[js.Any])
    if (customUtilityLayerScene != null) __obj.updateDynamic("customUtilityLayerScene")(customUtilityLayerScene.asInstanceOf[js.Any])
    if (gazeModePointerMovedFactor != null) __obj.updateDynamic("gazeModePointerMovedFactor")(gazeModePointerMovedFactor.asInstanceOf[js.Any])
    if (overrideButtonId != null) __obj.updateDynamic("overrideButtonId")(overrideButtonId.asInstanceOf[js.Any])
    if (renderingGroupId != null) __obj.updateDynamic("renderingGroupId")(renderingGroupId.asInstanceOf[js.Any])
    if (timeToSelect != null) __obj.updateDynamic("timeToSelect")(timeToSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(useUtilityLayer)) __obj.updateDynamic("useUtilityLayer")(useUtilityLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRControllerPointerSelectionOptions]
  }
}

