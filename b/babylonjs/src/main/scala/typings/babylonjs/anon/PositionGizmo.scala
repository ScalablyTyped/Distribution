package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionGizmo extends StObject {
  
  var boundingBoxGizmo: Boolean
  
  var positionGizmo: Boolean
  
  var rotationGizmo: Boolean
  
  var scaleGizmo: Boolean
}
object PositionGizmo {
  
  inline def apply(boundingBoxGizmo: Boolean, positionGizmo: Boolean, rotationGizmo: Boolean, scaleGizmo: Boolean): PositionGizmo = {
    val __obj = js.Dynamic.literal(boundingBoxGizmo = boundingBoxGizmo.asInstanceOf[js.Any], positionGizmo = positionGizmo.asInstanceOf[js.Any], rotationGizmo = rotationGizmo.asInstanceOf[js.Any], scaleGizmo = scaleGizmo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionGizmo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PositionGizmo] (val x: Self) extends AnyVal {
    
    inline def setBoundingBoxGizmo(value: Boolean): Self = StObject.set(x, "boundingBoxGizmo", value.asInstanceOf[js.Any])
    
    inline def setPositionGizmo(value: Boolean): Self = StObject.set(x, "positionGizmo", value.asInstanceOf[js.Any])
    
    inline def setRotationGizmo(value: Boolean): Self = StObject.set(x, "rotationGizmo", value.asInstanceOf[js.Any])
    
    inline def setScaleGizmo(value: Boolean): Self = StObject.set(x, "scaleGizmo", value.asInstanceOf[js.Any])
  }
}
