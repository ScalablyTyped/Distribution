package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICameraGizmo
  extends StObject
     with IGizmo {
  
  /** The camera that the gizmo is attached to */
  var camera: Nullable[Camera]
  
  /** A boolean indicating if frustum lines must be rendered */
  var displayFrustum: Boolean
  
  /** The material used to render the camera gizmo */
  val material: StandardMaterial
  
  /** Event that fires each time the gizmo is clicked */
  var onClickedObservable: Observable[Camera]
}
object ICameraGizmo {
  
  inline def apply(
    _rootMesh: Mesh,
    displayFrustum: Boolean,
    dispose: () => Unit,
    gizmoLayer: UtilityLayerRenderer,
    isHovered: Boolean,
    material: StandardMaterial,
    onClickedObservable: Observable[Camera],
    scaleRatio: Double,
    setCustomMesh: Mesh => Unit,
    updateGizmoPositionToMatchAttachedMesh: Boolean,
    updateGizmoRotationToMatchAttachedMesh: Boolean,
    updateScale: Boolean
  ): ICameraGizmo = {
    val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], displayFrustum = displayFrustum.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), gizmoLayer = gizmoLayer.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any], onClickedObservable = onClickedObservable.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1(setCustomMesh), updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, camera = null, customRotationQuaternion = null)
    __obj.asInstanceOf[ICameraGizmo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICameraGizmo] (val x: Self) extends AnyVal {
    
    inline def setCamera(value: Nullable[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraNull: Self = StObject.set(x, "camera", null)
    
    inline def setDisplayFrustum(value: Boolean): Self = StObject.set(x, "displayFrustum", value.asInstanceOf[js.Any])
    
    inline def setMaterial(value: StandardMaterial): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setOnClickedObservable(value: Observable[Camera]): Self = StObject.set(x, "onClickedObservable", value.asInstanceOf[js.Any])
  }
}
