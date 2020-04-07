package typings.babylonjs.BABYLON

import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRExperienceHelperOptions extends WebVROptions {
  /**
    * Create a DeviceOrientationCamera to be used as your out of vr camera. (default: true)
    */
  var createDeviceOrientationCamera: js.UndefOr[Boolean] = js.undefined
  /**
    * Create a VRDeviceOrientationFreeCamera to be used for VR when no external HMD is found. (default: true)
    */
  var createFallbackVRDeviceOrientationFreeCamera: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of meshes to be used as the teleportation floor. If specified, teleportation will be enabled (default: undefined)
    */
  var floorMeshes: js.UndefOr[js.Array[Mesh]] = js.undefined
  /**
    * Uses the main button on the controller to toggle the laser casted. (default: true)
    */
  var laserToggle: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines if WebXR should be used instead of WebVR (if available)
    */
  var useXR: js.UndefOr[Boolean] = js.undefined
  /**
    * Distortion metrics for the fallback vrDeviceOrientationCamera (default: VRCameraMetrics.Default)
    */
  var vrDeviceOrientationCameraMetrics: js.UndefOr[VRCameraMetrics] = js.undefined
}

object VRExperienceHelperOptions {
  @scala.inline
  def apply(
    controllerMeshes: js.UndefOr[Boolean] = js.undefined,
    createDeviceOrientationCamera: js.UndefOr[Boolean] = js.undefined,
    createFallbackVRDeviceOrientationFreeCamera: js.UndefOr[Boolean] = js.undefined,
    customVRButton: HTMLButtonElement = null,
    defaultHeight: Int | Double = null,
    defaultLightingOnControllers: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    floorMeshes: js.Array[Mesh] = null,
    laserToggle: js.UndefOr[Boolean] = js.undefined,
    positionScale: Int | Double = null,
    rayLength: Int | Double = null,
    trackPosition: js.UndefOr[Boolean] = js.undefined,
    useCustomVRButton: js.UndefOr[Boolean] = js.undefined,
    useMultiview: js.UndefOr[Boolean] = js.undefined,
    useXR: js.UndefOr[Boolean] = js.undefined,
    vrDeviceOrientationCameraMetrics: VRCameraMetrics = null
  ): VRExperienceHelperOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(controllerMeshes)) __obj.updateDynamic("controllerMeshes")(controllerMeshes.asInstanceOf[js.Any])
    if (!js.isUndefined(createDeviceOrientationCamera)) __obj.updateDynamic("createDeviceOrientationCamera")(createDeviceOrientationCamera.asInstanceOf[js.Any])
    if (!js.isUndefined(createFallbackVRDeviceOrientationFreeCamera)) __obj.updateDynamic("createFallbackVRDeviceOrientationFreeCamera")(createFallbackVRDeviceOrientationFreeCamera.asInstanceOf[js.Any])
    if (customVRButton != null) __obj.updateDynamic("customVRButton")(customVRButton.asInstanceOf[js.Any])
    if (defaultHeight != null) __obj.updateDynamic("defaultHeight")(defaultHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultLightingOnControllers)) __obj.updateDynamic("defaultLightingOnControllers")(defaultLightingOnControllers.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (floorMeshes != null) __obj.updateDynamic("floorMeshes")(floorMeshes.asInstanceOf[js.Any])
    if (!js.isUndefined(laserToggle)) __obj.updateDynamic("laserToggle")(laserToggle.asInstanceOf[js.Any])
    if (positionScale != null) __obj.updateDynamic("positionScale")(positionScale.asInstanceOf[js.Any])
    if (rayLength != null) __obj.updateDynamic("rayLength")(rayLength.asInstanceOf[js.Any])
    if (!js.isUndefined(trackPosition)) __obj.updateDynamic("trackPosition")(trackPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(useCustomVRButton)) __obj.updateDynamic("useCustomVRButton")(useCustomVRButton.asInstanceOf[js.Any])
    if (!js.isUndefined(useMultiview)) __obj.updateDynamic("useMultiview")(useMultiview.asInstanceOf[js.Any])
    if (!js.isUndefined(useXR)) __obj.updateDynamic("useXR")(useXR.asInstanceOf[js.Any])
    if (vrDeviceOrientationCameraMetrics != null) __obj.updateDynamic("vrDeviceOrientationCameraMetrics")(vrDeviceOrientationCameraMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRExperienceHelperOptions]
  }
}

