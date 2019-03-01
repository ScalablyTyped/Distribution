package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to modify the vr experience helper's behavior.
  */
trait VRExperienceHelperOptions extends WebVROptions {
  /**
    * Create a DeviceOrientationCamera to be used as your out of vr camera. (default: true)
    */
  var createDeviceOrientationCamera: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Create a VRDeviceOrientationFreeCamera to be used for VR when no external HMD is found. (default: true)
    */
  var createFallbackVRDeviceOrientationFreeCamera: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A list of meshes to be used as the teleportation floor. If specified, teleportation will be enabled (default: undefined)
    */
  var floorMeshes: js.UndefOr[js.Array[Mesh]] = js.undefined
  /**
    * Uses the main button on the controller to toggle the laser casted. (default: true)
    */
  var laserToggle: js.UndefOr[scala.Boolean] = js.undefined
}

object VRExperienceHelperOptions {
  @scala.inline
  def apply(
    controllerMeshes: js.UndefOr[scala.Boolean] = js.undefined,
    createDeviceOrientationCamera: js.UndefOr[scala.Boolean] = js.undefined,
    createFallbackVRDeviceOrientationFreeCamera: js.UndefOr[scala.Boolean] = js.undefined,
    customVRButton: stdLib.HTMLButtonElement = null,
    defaultHeight: scala.Int | scala.Double = null,
    defaultLightingOnControllers: js.UndefOr[scala.Boolean] = js.undefined,
    displayName: java.lang.String = null,
    floorMeshes: js.Array[Mesh] = null,
    laserToggle: js.UndefOr[scala.Boolean] = js.undefined,
    positionScale: scala.Int | scala.Double = null,
    rayLength: scala.Int | scala.Double = null,
    trackPosition: js.UndefOr[scala.Boolean] = js.undefined,
    useCustomVRButton: js.UndefOr[scala.Boolean] = js.undefined
  ): VRExperienceHelperOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(controllerMeshes)) __obj.updateDynamic("controllerMeshes")(controllerMeshes)
    if (!js.isUndefined(createDeviceOrientationCamera)) __obj.updateDynamic("createDeviceOrientationCamera")(createDeviceOrientationCamera)
    if (!js.isUndefined(createFallbackVRDeviceOrientationFreeCamera)) __obj.updateDynamic("createFallbackVRDeviceOrientationFreeCamera")(createFallbackVRDeviceOrientationFreeCamera)
    if (customVRButton != null) __obj.updateDynamic("customVRButton")(customVRButton)
    if (defaultHeight != null) __obj.updateDynamic("defaultHeight")(defaultHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultLightingOnControllers)) __obj.updateDynamic("defaultLightingOnControllers")(defaultLightingOnControllers)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (floorMeshes != null) __obj.updateDynamic("floorMeshes")(floorMeshes)
    if (!js.isUndefined(laserToggle)) __obj.updateDynamic("laserToggle")(laserToggle)
    if (positionScale != null) __obj.updateDynamic("positionScale")(positionScale.asInstanceOf[js.Any])
    if (rayLength != null) __obj.updateDynamic("rayLength")(rayLength.asInstanceOf[js.Any])
    if (!js.isUndefined(trackPosition)) __obj.updateDynamic("trackPosition")(trackPosition)
    if (!js.isUndefined(useCustomVRButton)) __obj.updateDynamic("useCustomVRButton")(useCustomVRButton)
    __obj.asInstanceOf[VRExperienceHelperOptions]
  }
}

