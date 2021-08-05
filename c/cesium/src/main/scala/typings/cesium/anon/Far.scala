package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Far extends StObject {
  
  var aspectRatio: Double
  
  var far: js.UndefOr[Double] = js.undefined
  
  var fov: Double
  
  var near: js.UndefOr[Double] = js.undefined
  
  var xOffset: js.UndefOr[Double] = js.undefined
  
  var yOffset: js.UndefOr[Double] = js.undefined
}
object Far {
  
  inline def apply(aspectRatio: Double, fov: Double): Far = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], fov = fov.asInstanceOf[js.Any])
    __obj.asInstanceOf[Far]
  }
  
  extension [Self <: Far](x: Self) {
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setFar(value: Double): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
    
    inline def setFarUndefined: Self = StObject.set(x, "far", js.undefined)
    
    inline def setFov(value: Double): Self = StObject.set(x, "fov", value.asInstanceOf[js.Any])
    
    inline def setNear(value: Double): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
    
    inline def setNearUndefined: Self = StObject.set(x, "near", js.undefined)
    
    inline def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
    
    inline def setXOffsetUndefined: Self = StObject.set(x, "xOffset", js.undefined)
    
    inline def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    
    inline def setYOffsetUndefined: Self = StObject.set(x, "yOffset", js.undefined)
  }
}
