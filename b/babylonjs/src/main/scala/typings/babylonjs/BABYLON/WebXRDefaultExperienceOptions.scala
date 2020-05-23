package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebXRDefaultExperienceOptions extends js.Object {
  /**
    * Enable or disable default UI to enter XR
    */
  var disableDefaultUI: js.UndefOr[Boolean] = js.undefined
  /**
    * Should teleportation not initialize. defaults to false.
    */
  var disableTeleportation: js.UndefOr[Boolean] = js.undefined
  /**
    * Floor meshes that will be used for teleport
    */
  var floorMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.undefined
  /**
    * If set to true, the first frame will not be used to reset position
    * The first frame is mainly used when copying transformation from the old camera
    * Mainly used in AR
    */
  var ignoreNativeCameraTransformation: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable the controller mesh-loading. Can be used if you want to load your own meshes
    */
  var inputOptions: js.UndefOr[IWebXRInputOptions] = js.undefined
  /**
    * optional configuration for the output canvas
    */
  var outputCanvasOptions: js.UndefOr[WebXRManagedOutputCanvasOptions] = js.undefined
  /**
    * optional UI options. This can be used among other to change session mode and reference space type
    */
  var uiOptions: js.UndefOr[WebXREnterExitUIOptions] = js.undefined
  /**
    * When loading teleportation and pointer select, use stable versions instead of latest.
    */
  var useStablePlugins: js.UndefOr[Boolean] = js.undefined
}

object WebXRDefaultExperienceOptions {
  @scala.inline
  def apply(
    disableDefaultUI: js.UndefOr[Boolean] = js.undefined,
    disableTeleportation: js.UndefOr[Boolean] = js.undefined,
    floorMeshes: js.Array[AbstractMesh] = null,
    ignoreNativeCameraTransformation: js.UndefOr[Boolean] = js.undefined,
    inputOptions: IWebXRInputOptions = null,
    outputCanvasOptions: WebXRManagedOutputCanvasOptions = null,
    uiOptions: WebXREnterExitUIOptions = null,
    useStablePlugins: js.UndefOr[Boolean] = js.undefined
  ): WebXRDefaultExperienceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableDefaultUI)) __obj.updateDynamic("disableDefaultUI")(disableDefaultUI.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTeleportation)) __obj.updateDynamic("disableTeleportation")(disableTeleportation.get.asInstanceOf[js.Any])
    if (floorMeshes != null) __obj.updateDynamic("floorMeshes")(floorMeshes.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreNativeCameraTransformation)) __obj.updateDynamic("ignoreNativeCameraTransformation")(ignoreNativeCameraTransformation.get.asInstanceOf[js.Any])
    if (inputOptions != null) __obj.updateDynamic("inputOptions")(inputOptions.asInstanceOf[js.Any])
    if (outputCanvasOptions != null) __obj.updateDynamic("outputCanvasOptions")(outputCanvasOptions.asInstanceOf[js.Any])
    if (uiOptions != null) __obj.updateDynamic("uiOptions")(uiOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(useStablePlugins)) __obj.updateDynamic("useStablePlugins")(useStablePlugins.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebXRDefaultExperienceOptions]
  }
}

