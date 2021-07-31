package typings.cesium.anon

import typings.cesium.mod.VertexFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolygonHierarchy extends StObject {
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var extrudedHeight: js.UndefOr[Double] = js.undefined
  
  var granularity: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var perPositionHeight: js.UndefOr[Boolean] = js.undefined
  
  var polygonHierarchy: js.Any
  
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}
object PolygonHierarchy {
  
  @scala.inline
  def apply(polygonHierarchy: js.Any): PolygonHierarchy = {
    val __obj = js.Dynamic.literal(polygonHierarchy = polygonHierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonHierarchy]
  }
  
  @scala.inline
  implicit class PolygonHierarchyMutableBuilder[Self <: PolygonHierarchy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setExtrudedHeight(value: Double): Self = StObject.set(x, "extrudedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrudedHeightUndefined: Self = StObject.set(x, "extrudedHeight", js.undefined)
    
    @scala.inline
    def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPerPositionHeight(value: Boolean): Self = StObject.set(x, "perPositionHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerPositionHeightUndefined: Self = StObject.set(x, "perPositionHeight", js.undefined)
    
    @scala.inline
    def setPolygonHierarchy(value: js.Any): Self = StObject.set(x, "polygonHierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexFormat(value: VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
  }
}
