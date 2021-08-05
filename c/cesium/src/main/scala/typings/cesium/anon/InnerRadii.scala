package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.VertexFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InnerRadii extends StObject {
  
  var innerRadii: js.UndefOr[Cartesian3] = js.undefined
  
  var maximumClock: js.UndefOr[Double] = js.undefined
  
  var maximumCone: js.UndefOr[Double] = js.undefined
  
  var minimumClock: js.UndefOr[Double] = js.undefined
  
  var minimumCone: js.UndefOr[Double] = js.undefined
  
  var radii: js.UndefOr[Cartesian3] = js.undefined
  
  var slicePartitions: js.UndefOr[Double] = js.undefined
  
  var stackPartitions: js.UndefOr[Double] = js.undefined
  
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}
object InnerRadii {
  
  inline def apply(): InnerRadii = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InnerRadii]
  }
  
  extension [Self <: InnerRadii](x: Self) {
    
    inline def setInnerRadii(value: Cartesian3): Self = StObject.set(x, "innerRadii", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiiUndefined: Self = StObject.set(x, "innerRadii", js.undefined)
    
    inline def setMaximumClock(value: Double): Self = StObject.set(x, "maximumClock", value.asInstanceOf[js.Any])
    
    inline def setMaximumClockUndefined: Self = StObject.set(x, "maximumClock", js.undefined)
    
    inline def setMaximumCone(value: Double): Self = StObject.set(x, "maximumCone", value.asInstanceOf[js.Any])
    
    inline def setMaximumConeUndefined: Self = StObject.set(x, "maximumCone", js.undefined)
    
    inline def setMinimumClock(value: Double): Self = StObject.set(x, "minimumClock", value.asInstanceOf[js.Any])
    
    inline def setMinimumClockUndefined: Self = StObject.set(x, "minimumClock", js.undefined)
    
    inline def setMinimumCone(value: Double): Self = StObject.set(x, "minimumCone", value.asInstanceOf[js.Any])
    
    inline def setMinimumConeUndefined: Self = StObject.set(x, "minimumCone", js.undefined)
    
    inline def setRadii(value: Cartesian3): Self = StObject.set(x, "radii", value.asInstanceOf[js.Any])
    
    inline def setRadiiUndefined: Self = StObject.set(x, "radii", js.undefined)
    
    inline def setSlicePartitions(value: Double): Self = StObject.set(x, "slicePartitions", value.asInstanceOf[js.Any])
    
    inline def setSlicePartitionsUndefined: Self = StObject.set(x, "slicePartitions", js.undefined)
    
    inline def setStackPartitions(value: Double): Self = StObject.set(x, "stackPartitions", value.asInstanceOf[js.Any])
    
    inline def setStackPartitionsUndefined: Self = StObject.set(x, "stackPartitions", js.undefined)
    
    inline def setVertexFormat(value: VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    inline def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
  }
}
