package typings.babylonjs.BABYLON

import typings.babylonjs.XRHandedness
import typings.babylonjs.anon.DisableLighting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRTeleportationOptions extends js.Object {
  
  /**
    * if provided, this scene will be used to render meshes.
    */
  var customUtilityLayerScene: js.UndefOr[Scene] = js.native
  
  /**
    * Values to configure the default target mesh
    */
  var defaultTargetMeshOptions: js.UndefOr[DisableLighting] = js.native
  
  /**
    * A list of meshes to use as floor meshes.
    * Meshes can be added and removed after initializing the feature using the
    * addFloorMesh and removeFloorMesh functions
    * If empty, rotation will still work
    */
  var floorMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.native
  
  /**
    * Should teleport work only on a specific hand?
    */
  var forceHandedness: js.UndefOr[XRHandedness] = js.native
  
  /**
    * If provided, this function will be used to generate the ray mesh instead of the lines mesh being used per default
    */
  var generateRayPathMesh: js.UndefOr[js.Function1[/* points */ js.Array[Vector3], AbstractMesh]] = js.native
  
  /**
    * Meshes that the teleportation ray cannot go through
    */
  var pickBlockerMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.native
  
  /**
    *  use this rendering group id for the meshes (optional)
    */
  var renderingGroupId: js.UndefOr[Double] = js.native
  
  /**
    * Should teleportation move only to snap points
    */
  var snapPointsOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of points to which the teleportation will snap to.
    * If the teleportation ray is in the proximity of one of those points, it will be corrected to this point.
    */
  var snapPositions: js.UndefOr[js.Array[Vector3]] = js.native
  
  /**
    * How close should the teleportation ray be in order to snap to position.
    * Default to 0.8 units (meters)
    */
  var snapToPositionRadius: js.UndefOr[Double] = js.native
  
  /**
    * Provide your own teleportation mesh instead of babylon's wonderful doughnut.
    * If you want to support rotation, make sure your mesh has a direction indicator.
    *
    * When left untouched, the default mesh will be initialized.
    */
  var teleportationTargetMesh: js.UndefOr[AbstractMesh] = js.native
  
  /**
    * If main component is used (no thumbstick), how long should the "long press" take before teleport
    */
  var timeToTeleport: js.UndefOr[Double] = js.native
  
  /**
    * Disable using the thumbstick and use the main component (usually trigger) on long press.
    * This will be automatically true if the controller doesn't have a thumbstick or touchpad.
    */
  var useMainComponentOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Should meshes created here be added to a utility layer or the main scene
    */
  var useUtilityLayer: js.UndefOr[Boolean] = js.native
  
  /**
    * Babylon XR Input class for controller
    */
  var xrInput: WebXRInput = js.native
}
object IWebXRTeleportationOptions {
  
  @scala.inline
  def apply(xrInput: WebXRInput): IWebXRTeleportationOptions = {
    val __obj = js.Dynamic.literal(xrInput = xrInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRTeleportationOptions]
  }
  
  @scala.inline
  implicit class IWebXRTeleportationOptionsOps[Self <: IWebXRTeleportationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setXrInput(value: WebXRInput): Self = this.set("xrInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUtilityLayerScene(value: Scene): Self = this.set("customUtilityLayerScene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomUtilityLayerScene: Self = this.set("customUtilityLayerScene", js.undefined)
    
    @scala.inline
    def setDefaultTargetMeshOptions(value: DisableLighting): Self = this.set("defaultTargetMeshOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTargetMeshOptions: Self = this.set("defaultTargetMeshOptions", js.undefined)
    
    @scala.inline
    def setFloorMeshesVarargs(value: AbstractMesh*): Self = this.set("floorMeshes", js.Array(value :_*))
    
    @scala.inline
    def setFloorMeshes(value: js.Array[AbstractMesh]): Self = this.set("floorMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloorMeshes: Self = this.set("floorMeshes", js.undefined)
    
    @scala.inline
    def setForceHandedness(value: XRHandedness): Self = this.set("forceHandedness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceHandedness: Self = this.set("forceHandedness", js.undefined)
    
    @scala.inline
    def setGenerateRayPathMesh(value: /* points */ js.Array[Vector3] => AbstractMesh): Self = this.set("generateRayPathMesh", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGenerateRayPathMesh: Self = this.set("generateRayPathMesh", js.undefined)
    
    @scala.inline
    def setPickBlockerMeshesVarargs(value: AbstractMesh*): Self = this.set("pickBlockerMeshes", js.Array(value :_*))
    
    @scala.inline
    def setPickBlockerMeshes(value: js.Array[AbstractMesh]): Self = this.set("pickBlockerMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickBlockerMeshes: Self = this.set("pickBlockerMeshes", js.undefined)
    
    @scala.inline
    def setRenderingGroupId(value: Double): Self = this.set("renderingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderingGroupId: Self = this.set("renderingGroupId", js.undefined)
    
    @scala.inline
    def setSnapPointsOnly(value: Boolean): Self = this.set("snapPointsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapPointsOnly: Self = this.set("snapPointsOnly", js.undefined)
    
    @scala.inline
    def setSnapPositionsVarargs(value: Vector3*): Self = this.set("snapPositions", js.Array(value :_*))
    
    @scala.inline
    def setSnapPositions(value: js.Array[Vector3]): Self = this.set("snapPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapPositions: Self = this.set("snapPositions", js.undefined)
    
    @scala.inline
    def setSnapToPositionRadius(value: Double): Self = this.set("snapToPositionRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapToPositionRadius: Self = this.set("snapToPositionRadius", js.undefined)
    
    @scala.inline
    def setTeleportationTargetMesh(value: AbstractMesh): Self = this.set("teleportationTargetMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeleportationTargetMesh: Self = this.set("teleportationTargetMesh", js.undefined)
    
    @scala.inline
    def setTimeToTeleport(value: Double): Self = this.set("timeToTeleport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeToTeleport: Self = this.set("timeToTeleport", js.undefined)
    
    @scala.inline
    def setUseMainComponentOnly(value: Boolean): Self = this.set("useMainComponentOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseMainComponentOnly: Self = this.set("useMainComponentOnly", js.undefined)
    
    @scala.inline
    def setUseUtilityLayer(value: Boolean): Self = this.set("useUtilityLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseUtilityLayer: Self = this.set("useUtilityLayer", js.undefined)
  }
}
