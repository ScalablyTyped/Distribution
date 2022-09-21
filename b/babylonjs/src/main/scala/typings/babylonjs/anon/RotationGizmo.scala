package typings.babylonjs.anon

import typings.babylonjs.BABYLON.IBoundingBoxGizmo
import typings.babylonjs.BABYLON.IPositionGizmo
import typings.babylonjs.BABYLON.IRotationGizmo
import typings.babylonjs.BABYLON.IScaleGizmo
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationGizmo extends StObject {
  
  var boundingBoxGizmo: Nullable[IBoundingBoxGizmo]
  
  var positionGizmo: Nullable[IPositionGizmo]
  
  var rotationGizmo: Nullable[IRotationGizmo]
  
  var scaleGizmo: Nullable[IScaleGizmo]
}
object RotationGizmo {
  
  inline def apply(): RotationGizmo = {
    val __obj = js.Dynamic.literal(boundingBoxGizmo = null, positionGizmo = null, rotationGizmo = null, scaleGizmo = null)
    __obj.asInstanceOf[RotationGizmo]
  }
  
  extension [Self <: RotationGizmo](x: Self) {
    
    inline def setBoundingBoxGizmo(value: Nullable[IBoundingBoxGizmo]): Self = StObject.set(x, "boundingBoxGizmo", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxGizmoNull: Self = StObject.set(x, "boundingBoxGizmo", null)
    
    inline def setPositionGizmo(value: Nullable[IPositionGizmo]): Self = StObject.set(x, "positionGizmo", value.asInstanceOf[js.Any])
    
    inline def setPositionGizmoNull: Self = StObject.set(x, "positionGizmo", null)
    
    inline def setRotationGizmo(value: Nullable[IRotationGizmo]): Self = StObject.set(x, "rotationGizmo", value.asInstanceOf[js.Any])
    
    inline def setRotationGizmoNull: Self = StObject.set(x, "rotationGizmo", null)
    
    inline def setScaleGizmo(value: Nullable[IScaleGizmo]): Self = StObject.set(x, "scaleGizmo", value.asInstanceOf[js.Any])
    
    inline def setScaleGizmoNull: Self = StObject.set(x, "scaleGizmo", null)
  }
}
