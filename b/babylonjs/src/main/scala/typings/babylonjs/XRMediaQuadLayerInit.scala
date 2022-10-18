package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRMediaQuadLayerInit
  extends StObject
     with XRMediaLayerInit {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var transform: js.UndefOr[XRRigidTransform] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object XRMediaQuadLayerInit {
  
  inline def apply(space: XRSpace): XRMediaQuadLayerInit = {
    val __obj = js.Dynamic.literal(space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRMediaQuadLayerInit]
  }
  
  extension [Self <: XRMediaQuadLayerInit](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setTransform(value: XRRigidTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
