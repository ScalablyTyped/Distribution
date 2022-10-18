package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRMediaCylinderLayerInit
  extends StObject
     with XRMediaLayerInit {
  
  var aspectRatio: js.UndefOr[Double] = js.undefined
  
  var centralAngle: js.UndefOr[Double] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var transform: js.UndefOr[XRRigidTransform] = js.undefined
}
object XRMediaCylinderLayerInit {
  
  inline def apply(space: XRSpace): XRMediaCylinderLayerInit = {
    val __obj = js.Dynamic.literal(space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRMediaCylinderLayerInit]
  }
  
  extension [Self <: XRMediaCylinderLayerInit](x: Self) {
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setCentralAngle(value: Double): Self = StObject.set(x, "centralAngle", value.asInstanceOf[js.Any])
    
    inline def setCentralAngleUndefined: Self = StObject.set(x, "centralAngle", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setTransform(value: XRRigidTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
