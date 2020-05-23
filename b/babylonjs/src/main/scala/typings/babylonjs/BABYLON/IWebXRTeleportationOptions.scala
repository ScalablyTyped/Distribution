package typings.babylonjs.BABYLON

import typings.babylonjs.anon.DisableLighting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebXRTeleportationOptions extends js.Object {
  /**
    * if provided, this scene will be used to render meshes.
    */
  var customUtilityLayerScene: js.UndefOr[Scene] = js.undefined
  /**
    * Values to configure the default target mesh
    */
  var defaultTargetMeshOptions: js.UndefOr[DisableLighting] = js.undefined
  /**
    * A list of meshes to use as floor meshes.
    * Meshes can be added and removed after initializing the feature using the
    * addFloorMesh and removeFloorMesh functions
    * If empty, rotation will still work
    */
  var floorMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.undefined
  /**
    *  use this rendering group id for the meshes (optional)
    */
  var renderingGroupId: js.UndefOr[Double] = js.undefined
  /**
    * Should teleportation move only to snap points
    */
  var snapPointsOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of points to which the teleportation will snap to.
    * If the teleportation ray is in the proximity of one of those points, it will be corrected to this point.
    */
  var snapPositions: js.UndefOr[js.Array[Vector3]] = js.undefined
  /**
    * How close should the teleportation ray be in order to snap to position.
    * Default to 0.8 units (meters)
    */
  var snapToPositionRadius: js.UndefOr[Double] = js.undefined
  /**
    * Provide your own teleportation mesh instead of babylon's wonderful doughnut.
    * If you want to support rotation, make sure your mesh has a direction indicator.
    *
    * When left untouched, the default mesh will be initialized.
    */
  var teleportationTargetMesh: js.UndefOr[AbstractMesh] = js.undefined
  /**
    * If main component is used (no thumbstick), how long should the "long press" take before teleport
    */
  var timeToTeleport: js.UndefOr[Double] = js.undefined
  /**
    * Disable using the thumbstick and use the main component (usually trigger) on long press.
    * This will be automatically true if the controller doesn't have a thumbstick or touchpad.
    */
  var useMainComponentOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Should meshes created here be added to a utility layer or the main scene
    */
  var useUtilityLayer: js.UndefOr[Boolean] = js.undefined
  /**
    * Babylon XR Input class for controller
    */
  var xrInput: WebXRInput
}

object IWebXRTeleportationOptions {
  @scala.inline
  def apply(
    xrInput: WebXRInput,
    customUtilityLayerScene: Scene = null,
    defaultTargetMeshOptions: DisableLighting = null,
    floorMeshes: js.Array[AbstractMesh] = null,
    renderingGroupId: js.UndefOr[Double] = js.undefined,
    snapPointsOnly: js.UndefOr[Boolean] = js.undefined,
    snapPositions: js.Array[Vector3] = null,
    snapToPositionRadius: js.UndefOr[Double] = js.undefined,
    teleportationTargetMesh: AbstractMesh = null,
    timeToTeleport: js.UndefOr[Double] = js.undefined,
    useMainComponentOnly: js.UndefOr[Boolean] = js.undefined,
    useUtilityLayer: js.UndefOr[Boolean] = js.undefined
  ): IWebXRTeleportationOptions = {
    val __obj = js.Dynamic.literal(xrInput = xrInput.asInstanceOf[js.Any])
    if (customUtilityLayerScene != null) __obj.updateDynamic("customUtilityLayerScene")(customUtilityLayerScene.asInstanceOf[js.Any])
    if (defaultTargetMeshOptions != null) __obj.updateDynamic("defaultTargetMeshOptions")(defaultTargetMeshOptions.asInstanceOf[js.Any])
    if (floorMeshes != null) __obj.updateDynamic("floorMeshes")(floorMeshes.asInstanceOf[js.Any])
    if (!js.isUndefined(renderingGroupId)) __obj.updateDynamic("renderingGroupId")(renderingGroupId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapPointsOnly)) __obj.updateDynamic("snapPointsOnly")(snapPointsOnly.get.asInstanceOf[js.Any])
    if (snapPositions != null) __obj.updateDynamic("snapPositions")(snapPositions.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToPositionRadius)) __obj.updateDynamic("snapToPositionRadius")(snapToPositionRadius.get.asInstanceOf[js.Any])
    if (teleportationTargetMesh != null) __obj.updateDynamic("teleportationTargetMesh")(teleportationTargetMesh.asInstanceOf[js.Any])
    if (!js.isUndefined(timeToTeleport)) __obj.updateDynamic("timeToTeleport")(timeToTeleport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useMainComponentOnly)) __obj.updateDynamic("useMainComponentOnly")(useMainComponentOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useUtilityLayer)) __obj.updateDynamic("useUtilityLayer")(useUtilityLayer.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRTeleportationOptions]
  }
}

