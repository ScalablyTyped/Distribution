package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.RotationGizmo
import typings.babylonjs.BABYLON.ScaleGizmo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionGizmo extends StObject {
  
  var boundingBoxGizmo: Nullable[typings.babylonjs.BABYLON.BoundingBoxGizmo]
  
  var positionGizmo: Nullable[typings.babylonjs.BABYLON.PositionGizmo]
  
  var rotationGizmo: Nullable[RotationGizmo]
  
  var scaleGizmo: Nullable[ScaleGizmo]
}
object PositionGizmo {
  
  inline def apply(): PositionGizmo = {
    val __obj = js.Dynamic.literal(boundingBoxGizmo = null, positionGizmo = null, rotationGizmo = null, scaleGizmo = null)
    __obj.asInstanceOf[PositionGizmo]
  }
  
  extension [Self <: PositionGizmo](x: Self) {
    
    inline def setBoundingBoxGizmo(value: Nullable[typings.babylonjs.BABYLON.BoundingBoxGizmo]): Self = StObject.set(x, "boundingBoxGizmo", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxGizmoNull: Self = StObject.set(x, "boundingBoxGizmo", null)
    
    inline def setPositionGizmo(value: Nullable[typings.babylonjs.BABYLON.PositionGizmo]): Self = StObject.set(x, "positionGizmo", value.asInstanceOf[js.Any])
    
    inline def setPositionGizmoNull: Self = StObject.set(x, "positionGizmo", null)
    
    inline def setRotationGizmo(value: Nullable[RotationGizmo]): Self = StObject.set(x, "rotationGizmo", value.asInstanceOf[js.Any])
    
    inline def setRotationGizmoNull: Self = StObject.set(x, "rotationGizmo", null)
    
    inline def setScaleGizmo(value: Nullable[ScaleGizmo]): Self = StObject.set(x, "scaleGizmo", value.asInstanceOf[js.Any])
    
    inline def setScaleGizmoNull: Self = StObject.set(x, "scaleGizmo", null)
  }
}
