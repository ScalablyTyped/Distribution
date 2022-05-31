package typings.babylonjs.anon

import typings.babylonjs.rotationGizmoMod.RotationGizmo
import typings.babylonjs.scaleGizmoMod.ScaleGizmo
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundingBoxGizmo extends StObject {
  
  var boundingBoxGizmo: Nullable[typings.babylonjs.boundingBoxGizmoMod.BoundingBoxGizmo]
  
  var positionGizmo: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
  
  var rotationGizmo: Nullable[RotationGizmo]
  
  var scaleGizmo: Nullable[ScaleGizmo]
}
object BoundingBoxGizmo {
  
  inline def apply(): BoundingBoxGizmo = {
    val __obj = js.Dynamic.literal(boundingBoxGizmo = null, positionGizmo = null, rotationGizmo = null, scaleGizmo = null)
    __obj.asInstanceOf[BoundingBoxGizmo]
  }
  
  extension [Self <: BoundingBoxGizmo](x: Self) {
    
    inline def setBoundingBoxGizmo(value: Nullable[typings.babylonjs.boundingBoxGizmoMod.BoundingBoxGizmo]): Self = StObject.set(x, "boundingBoxGizmo", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxGizmoNull: Self = StObject.set(x, "boundingBoxGizmo", null)
    
    inline def setPositionGizmo(value: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]): Self = StObject.set(x, "positionGizmo", value.asInstanceOf[js.Any])
    
    inline def setPositionGizmoNull: Self = StObject.set(x, "positionGizmo", null)
    
    inline def setRotationGizmo(value: Nullable[RotationGizmo]): Self = StObject.set(x, "rotationGizmo", value.asInstanceOf[js.Any])
    
    inline def setRotationGizmoNull: Self = StObject.set(x, "rotationGizmo", null)
    
    inline def setScaleGizmo(value: Nullable[ScaleGizmo]): Self = StObject.set(x, "scaleGizmo", value.asInstanceOf[js.Any])
    
    inline def setScaleGizmoNull: Self = StObject.set(x, "scaleGizmo", null)
  }
}
