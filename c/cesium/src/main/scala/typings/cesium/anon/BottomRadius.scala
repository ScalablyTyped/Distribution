package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomRadius extends StObject {
  
  var bottomRadius: Double
  
  var length: Double
  
  var slices: js.UndefOr[Double] = js.undefined
  
  var topRadius: Double
  
  var vertexFormat: js.UndefOr[typings.cesium.mod.VertexFormat] = js.undefined
}
object BottomRadius {
  
  inline def apply(bottomRadius: Double, length: Double, topRadius: Double): BottomRadius = {
    val __obj = js.Dynamic.literal(bottomRadius = bottomRadius.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], topRadius = topRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomRadius]
  }
  
  extension [Self <: BottomRadius](x: Self) {
    
    inline def setBottomRadius(value: Double): Self = StObject.set(x, "bottomRadius", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setSlices(value: Double): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
    
    inline def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
    
    inline def setTopRadius(value: Double): Self = StObject.set(x, "topRadius", value.asInstanceOf[js.Any])
    
    inline def setVertexFormat(value: typings.cesium.mod.VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    inline def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
  }
}
