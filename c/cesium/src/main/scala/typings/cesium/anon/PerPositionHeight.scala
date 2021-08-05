package typings.cesium.anon

import typings.cesium.mod.VertexFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerPositionHeight extends StObject {
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var extrudedHeight: js.UndefOr[Double] = js.undefined
  
  var granularity: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var perPositionHeight: js.UndefOr[Boolean] = js.undefined
  
  var polygonHierarchy: typings.cesium.mod.PolygonHierarchy
  
  var stRotation: js.UndefOr[Double] = js.undefined
  
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}
object PerPositionHeight {
  
  inline def apply(polygonHierarchy: typings.cesium.mod.PolygonHierarchy): PerPositionHeight = {
    val __obj = js.Dynamic.literal(polygonHierarchy = polygonHierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerPositionHeight]
  }
  
  extension [Self <: PerPositionHeight](x: Self) {
    
    inline def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setExtrudedHeight(value: Double): Self = StObject.set(x, "extrudedHeight", value.asInstanceOf[js.Any])
    
    inline def setExtrudedHeightUndefined: Self = StObject.set(x, "extrudedHeight", js.undefined)
    
    inline def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPerPositionHeight(value: Boolean): Self = StObject.set(x, "perPositionHeight", value.asInstanceOf[js.Any])
    
    inline def setPerPositionHeightUndefined: Self = StObject.set(x, "perPositionHeight", js.undefined)
    
    inline def setPolygonHierarchy(value: typings.cesium.mod.PolygonHierarchy): Self = StObject.set(x, "polygonHierarchy", value.asInstanceOf[js.Any])
    
    inline def setStRotation(value: Double): Self = StObject.set(x, "stRotation", value.asInstanceOf[js.Any])
    
    inline def setStRotationUndefined: Self = StObject.set(x, "stRotation", js.undefined)
    
    inline def setVertexFormat(value: VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    inline def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
  }
}
