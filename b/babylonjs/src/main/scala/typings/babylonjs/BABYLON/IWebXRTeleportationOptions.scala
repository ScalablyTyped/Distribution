package typings.babylonjs.BABYLON

import typings.babylonjs.XRHandedness
import typings.babylonjs.anon.DisableLighting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRTeleportationOptions extends StObject {
  
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
  implicit class IWebXRTeleportationOptionsMutableBuilder[Self <: IWebXRTeleportationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomUtilityLayerScene(value: Scene): Self = StObject.set(x, "customUtilityLayerScene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUtilityLayerSceneUndefined: Self = StObject.set(x, "customUtilityLayerScene", js.undefined)
    
    @scala.inline
    def setDefaultTargetMeshOptions(value: DisableLighting): Self = StObject.set(x, "defaultTargetMeshOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTargetMeshOptionsUndefined: Self = StObject.set(x, "defaultTargetMeshOptions", js.undefined)
    
    @scala.inline
    def setFloorMeshes(value: js.Array[AbstractMesh]): Self = StObject.set(x, "floorMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloorMeshesUndefined: Self = StObject.set(x, "floorMeshes", js.undefined)
    
    @scala.inline
    def setFloorMeshesVarargs(value: AbstractMesh*): Self = StObject.set(x, "floorMeshes", js.Array(value :_*))
    
    @scala.inline
    def setForceHandedness(value: XRHandedness): Self = StObject.set(x, "forceHandedness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceHandednessUndefined: Self = StObject.set(x, "forceHandedness", js.undefined)
    
    @scala.inline
    def setGenerateRayPathMesh(value: /* points */ js.Array[Vector3] => AbstractMesh): Self = StObject.set(x, "generateRayPathMesh", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGenerateRayPathMeshUndefined: Self = StObject.set(x, "generateRayPathMesh", js.undefined)
    
    @scala.inline
    def setPickBlockerMeshes(value: js.Array[AbstractMesh]): Self = StObject.set(x, "pickBlockerMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickBlockerMeshesUndefined: Self = StObject.set(x, "pickBlockerMeshes", js.undefined)
    
    @scala.inline
    def setPickBlockerMeshesVarargs(value: AbstractMesh*): Self = StObject.set(x, "pickBlockerMeshes", js.Array(value :_*))
    
    @scala.inline
    def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingGroupIdUndefined: Self = StObject.set(x, "renderingGroupId", js.undefined)
    
    @scala.inline
    def setSnapPointsOnly(value: Boolean): Self = StObject.set(x, "snapPointsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapPointsOnlyUndefined: Self = StObject.set(x, "snapPointsOnly", js.undefined)
    
    @scala.inline
    def setSnapPositions(value: js.Array[Vector3]): Self = StObject.set(x, "snapPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapPositionsUndefined: Self = StObject.set(x, "snapPositions", js.undefined)
    
    @scala.inline
    def setSnapPositionsVarargs(value: Vector3*): Self = StObject.set(x, "snapPositions", js.Array(value :_*))
    
    @scala.inline
    def setSnapToPositionRadius(value: Double): Self = StObject.set(x, "snapToPositionRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToPositionRadiusUndefined: Self = StObject.set(x, "snapToPositionRadius", js.undefined)
    
    @scala.inline
    def setTeleportationTargetMesh(value: AbstractMesh): Self = StObject.set(x, "teleportationTargetMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeleportationTargetMeshUndefined: Self = StObject.set(x, "teleportationTargetMesh", js.undefined)
    
    @scala.inline
    def setTimeToTeleport(value: Double): Self = StObject.set(x, "timeToTeleport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToTeleportUndefined: Self = StObject.set(x, "timeToTeleport", js.undefined)
    
    @scala.inline
    def setUseMainComponentOnly(value: Boolean): Self = StObject.set(x, "useMainComponentOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMainComponentOnlyUndefined: Self = StObject.set(x, "useMainComponentOnly", js.undefined)
    
    @scala.inline
    def setUseUtilityLayer(value: Boolean): Self = StObject.set(x, "useUtilityLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseUtilityLayerUndefined: Self = StObject.set(x, "useUtilityLayer", js.undefined)
    
    @scala.inline
    def setXrInput(value: WebXRInput): Self = StObject.set(x, "xrInput", value.asInstanceOf[js.Any])
  }
}
