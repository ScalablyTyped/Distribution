package typings.babylonjs.BABYLON

import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebVROptions extends js.Object {
  /**
    * Should the native controller meshes be initialized. (default: true)
    */
  var controllerMeshes: js.UndefOr[Boolean] = js.undefined
  /**
    * If you'd like to provide your own button to the VRHelper. (default: standard babylon vr button)
    */
  var customVRButton: js.UndefOr[HTMLButtonElement] = js.undefined
  /**
    * To change the default offset from the ground to account for user's height in meters. Will be scaled by positionScale. (default: 1.7)
    */
  var defaultHeight: js.UndefOr[Double] = js.undefined
  /**
    * Creating a default HemiLight only on controllers. (default: true)
    */
  var defaultLightingOnControllers: js.UndefOr[Boolean] = js.undefined
  /**
    * If there are more than one VRDisplays, this will choose the display matching this name. (default: pick first vrDisplay)
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * Sets the scale of the vrDevice in babylon space. (default: 1)
    */
  var positionScale: js.UndefOr[Double] = js.undefined
  /**
    * To change the length of the ray for gaze/controllers. Will be scaled by positionScale. (default: 100)
    */
  var rayLength: js.UndefOr[Double] = js.undefined
  /**
    * Sets if the webVR camera should be tracked to the vrDevice. (default: true)
    */
  var trackPosition: js.UndefOr[Boolean] = js.undefined
  /**
    * If you don't want to use the default VR button of the helper. (default: false)
    */
  var useCustomVRButton: js.UndefOr[Boolean] = js.undefined
  /**
    * If multiview should be used if availible (default: false)
    */
  var useMultiview: js.UndefOr[Boolean] = js.undefined
}

object WebVROptions {
  @scala.inline
  def apply(
    controllerMeshes: js.UndefOr[Boolean] = js.undefined,
    customVRButton: HTMLButtonElement = null,
    defaultHeight: Int | Double = null,
    defaultLightingOnControllers: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    positionScale: Int | Double = null,
    rayLength: Int | Double = null,
    trackPosition: js.UndefOr[Boolean] = js.undefined,
    useCustomVRButton: js.UndefOr[Boolean] = js.undefined,
    useMultiview: js.UndefOr[Boolean] = js.undefined
  ): WebVROptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(controllerMeshes)) __obj.updateDynamic("controllerMeshes")(controllerMeshes.asInstanceOf[js.Any])
    if (customVRButton != null) __obj.updateDynamic("customVRButton")(customVRButton.asInstanceOf[js.Any])
    if (defaultHeight != null) __obj.updateDynamic("defaultHeight")(defaultHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultLightingOnControllers)) __obj.updateDynamic("defaultLightingOnControllers")(defaultLightingOnControllers.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (positionScale != null) __obj.updateDynamic("positionScale")(positionScale.asInstanceOf[js.Any])
    if (rayLength != null) __obj.updateDynamic("rayLength")(rayLength.asInstanceOf[js.Any])
    if (!js.isUndefined(trackPosition)) __obj.updateDynamic("trackPosition")(trackPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(useCustomVRButton)) __obj.updateDynamic("useCustomVRButton")(useCustomVRButton.asInstanceOf[js.Any])
    if (!js.isUndefined(useMultiview)) __obj.updateDynamic("useMultiview")(useMultiview.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebVROptions]
  }
}

