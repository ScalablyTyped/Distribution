package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Radius extends StObject {
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var slicePartitions: js.UndefOr[Double] = js.undefined
  
  var stackPartitions: js.UndefOr[Double] = js.undefined
  
  var vertexFormat: js.UndefOr[typings.cesium.mod.VertexFormat] = js.undefined
}
object Radius {
  
  inline def apply(): Radius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Radius]
  }
  
  extension [Self <: Radius](x: Self) {
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSlicePartitions(value: Double): Self = StObject.set(x, "slicePartitions", value.asInstanceOf[js.Any])
    
    inline def setSlicePartitionsUndefined: Self = StObject.set(x, "slicePartitions", js.undefined)
    
    inline def setStackPartitions(value: Double): Self = StObject.set(x, "stackPartitions", value.asInstanceOf[js.Any])
    
    inline def setStackPartitionsUndefined: Self = StObject.set(x, "stackPartitions", js.undefined)
    
    inline def setVertexFormat(value: typings.cesium.mod.VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    inline def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
  }
}
