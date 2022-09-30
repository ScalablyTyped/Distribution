package typings.babylonjs.anon

import typings.babylonjs.XRHandedness
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.pickingInfoMod.PickingInfo
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRInputMod.WebXRInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.babylonjs/XR/features/WebXRControllerTeleportation.IWebXRTeleportationOptions> */
trait PartialIWebXRTeleportatio extends StObject {
  
  var customUtilityLayerScene: js.UndefOr[Scene] = js.undefined
  
  var defaultTargetMeshOptions: js.UndefOr[DisableAnimation] = js.undefined
  
  var floorMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.undefined
  
  var forceHandedness: js.UndefOr[XRHandedness] = js.undefined
  
  var generateRayPathMesh: js.UndefOr[
    js.Function2[/* points */ js.Array[Vector3], /* pickingInfo */ PickingInfo, AbstractMesh]
  ] = js.undefined
  
  var pickBlockerMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.undefined
  
  var renderingGroupId: js.UndefOr[Double] = js.undefined
  
  var snapPointsOnly: js.UndefOr[Boolean] = js.undefined
  
  var snapPositions: js.UndefOr[js.Array[Vector3]] = js.undefined
  
  var snapToPositionRadius: js.UndefOr[Double] = js.undefined
  
  var teleportationTargetMesh: js.UndefOr[AbstractMesh] = js.undefined
  
  var timeToTeleport: js.UndefOr[Double] = js.undefined
  
  var useMainComponentOnly: js.UndefOr[Boolean] = js.undefined
  
  var useUtilityLayer: js.UndefOr[Boolean] = js.undefined
  
  var xrInput: js.UndefOr[WebXRInput] = js.undefined
}
object PartialIWebXRTeleportatio {
  
  inline def apply(): PartialIWebXRTeleportatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIWebXRTeleportatio]
  }
  
  extension [Self <: PartialIWebXRTeleportatio](x: Self) {
    
    inline def setCustomUtilityLayerScene(value: Scene): Self = StObject.set(x, "customUtilityLayerScene", value.asInstanceOf[js.Any])
    
    inline def setCustomUtilityLayerSceneUndefined: Self = StObject.set(x, "customUtilityLayerScene", js.undefined)
    
    inline def setDefaultTargetMeshOptions(value: DisableAnimation): Self = StObject.set(x, "defaultTargetMeshOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultTargetMeshOptionsUndefined: Self = StObject.set(x, "defaultTargetMeshOptions", js.undefined)
    
    inline def setFloorMeshes(value: js.Array[AbstractMesh]): Self = StObject.set(x, "floorMeshes", value.asInstanceOf[js.Any])
    
    inline def setFloorMeshesUndefined: Self = StObject.set(x, "floorMeshes", js.undefined)
    
    inline def setFloorMeshesVarargs(value: AbstractMesh*): Self = StObject.set(x, "floorMeshes", js.Array(value*))
    
    inline def setForceHandedness(value: XRHandedness): Self = StObject.set(x, "forceHandedness", value.asInstanceOf[js.Any])
    
    inline def setForceHandednessUndefined: Self = StObject.set(x, "forceHandedness", js.undefined)
    
    inline def setGenerateRayPathMesh(value: (/* points */ js.Array[Vector3], /* pickingInfo */ PickingInfo) => AbstractMesh): Self = StObject.set(x, "generateRayPathMesh", js.Any.fromFunction2(value))
    
    inline def setGenerateRayPathMeshUndefined: Self = StObject.set(x, "generateRayPathMesh", js.undefined)
    
    inline def setPickBlockerMeshes(value: js.Array[AbstractMesh]): Self = StObject.set(x, "pickBlockerMeshes", value.asInstanceOf[js.Any])
    
    inline def setPickBlockerMeshesUndefined: Self = StObject.set(x, "pickBlockerMeshes", js.undefined)
    
    inline def setPickBlockerMeshesVarargs(value: AbstractMesh*): Self = StObject.set(x, "pickBlockerMeshes", js.Array(value*))
    
    inline def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
    
    inline def setRenderingGroupIdUndefined: Self = StObject.set(x, "renderingGroupId", js.undefined)
    
    inline def setSnapPointsOnly(value: Boolean): Self = StObject.set(x, "snapPointsOnly", value.asInstanceOf[js.Any])
    
    inline def setSnapPointsOnlyUndefined: Self = StObject.set(x, "snapPointsOnly", js.undefined)
    
    inline def setSnapPositions(value: js.Array[Vector3]): Self = StObject.set(x, "snapPositions", value.asInstanceOf[js.Any])
    
    inline def setSnapPositionsUndefined: Self = StObject.set(x, "snapPositions", js.undefined)
    
    inline def setSnapPositionsVarargs(value: Vector3*): Self = StObject.set(x, "snapPositions", js.Array(value*))
    
    inline def setSnapToPositionRadius(value: Double): Self = StObject.set(x, "snapToPositionRadius", value.asInstanceOf[js.Any])
    
    inline def setSnapToPositionRadiusUndefined: Self = StObject.set(x, "snapToPositionRadius", js.undefined)
    
    inline def setTeleportationTargetMesh(value: AbstractMesh): Self = StObject.set(x, "teleportationTargetMesh", value.asInstanceOf[js.Any])
    
    inline def setTeleportationTargetMeshUndefined: Self = StObject.set(x, "teleportationTargetMesh", js.undefined)
    
    inline def setTimeToTeleport(value: Double): Self = StObject.set(x, "timeToTeleport", value.asInstanceOf[js.Any])
    
    inline def setTimeToTeleportUndefined: Self = StObject.set(x, "timeToTeleport", js.undefined)
    
    inline def setUseMainComponentOnly(value: Boolean): Self = StObject.set(x, "useMainComponentOnly", value.asInstanceOf[js.Any])
    
    inline def setUseMainComponentOnlyUndefined: Self = StObject.set(x, "useMainComponentOnly", js.undefined)
    
    inline def setUseUtilityLayer(value: Boolean): Self = StObject.set(x, "useUtilityLayer", value.asInstanceOf[js.Any])
    
    inline def setUseUtilityLayerUndefined: Self = StObject.set(x, "useUtilityLayer", js.undefined)
    
    inline def setXrInput(value: WebXRInput): Self = StObject.set(x, "xrInput", value.asInstanceOf[js.Any])
    
    inline def setXrInputUndefined: Self = StObject.set(x, "xrInput", js.undefined)
  }
}
