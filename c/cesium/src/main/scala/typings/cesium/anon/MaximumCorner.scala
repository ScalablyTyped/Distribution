package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.VertexFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaximumCorner extends StObject {
  
  var maximumCorner: Cartesian3
  
  var minimumCorner: Cartesian3
  
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}
object MaximumCorner {
  
  inline def apply(maximumCorner: Cartesian3, minimumCorner: Cartesian3): MaximumCorner = {
    val __obj = js.Dynamic.literal(maximumCorner = maximumCorner.asInstanceOf[js.Any], minimumCorner = minimumCorner.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumCorner]
  }
  
  extension [Self <: MaximumCorner](x: Self) {
    
    inline def setMaximumCorner(value: Cartesian3): Self = StObject.set(x, "maximumCorner", value.asInstanceOf[js.Any])
    
    inline def setMinimumCorner(value: Cartesian3): Self = StObject.set(x, "minimumCorner", value.asInstanceOf[js.Any])
    
    inline def setVertexFormat(value: VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    inline def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
  }
}
