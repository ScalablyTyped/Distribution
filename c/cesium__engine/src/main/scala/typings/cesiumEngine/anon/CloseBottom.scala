package typings.cesiumEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseBottom extends StObject {
  
  var arcType: js.UndefOr[typings.cesiumEngine.mod.ArcType] = js.undefined
  
  var closeBottom: js.UndefOr[Boolean] = js.undefined
  
  var closeTop: js.UndefOr[Boolean] = js.undefined
  
  var ellipsoid: js.UndefOr[typings.cesiumEngine.mod.Ellipsoid] = js.undefined
  
  var extrudedHeight: js.UndefOr[Double] = js.undefined
  
  var granularity: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var perPositionHeight: js.UndefOr[Boolean] = js.undefined
  
  var polygonHierarchy: typings.cesiumEngine.mod.PolygonHierarchy
  
  var stRotation: js.UndefOr[Double] = js.undefined
  
  var textureCoordinates: js.UndefOr[typings.cesiumEngine.mod.PolygonHierarchy] = js.undefined
  
  var vertexFormat: js.UndefOr[typings.cesiumEngine.mod.VertexFormat] = js.undefined
}
object CloseBottom {
  
  inline def apply(polygonHierarchy: typings.cesiumEngine.mod.PolygonHierarchy): CloseBottom = {
    val __obj = js.Dynamic.literal(polygonHierarchy = polygonHierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseBottom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseBottom] (val x: Self) extends AnyVal {
    
    inline def setArcType(value: typings.cesiumEngine.mod.ArcType): Self = StObject.set(x, "arcType", value.asInstanceOf[js.Any])
    
    inline def setArcTypeUndefined: Self = StObject.set(x, "arcType", js.undefined)
    
    inline def setCloseBottom(value: Boolean): Self = StObject.set(x, "closeBottom", value.asInstanceOf[js.Any])
    
    inline def setCloseBottomUndefined: Self = StObject.set(x, "closeBottom", js.undefined)
    
    inline def setCloseTop(value: Boolean): Self = StObject.set(x, "closeTop", value.asInstanceOf[js.Any])
    
    inline def setCloseTopUndefined: Self = StObject.set(x, "closeTop", js.undefined)
    
    inline def setEllipsoid(value: typings.cesiumEngine.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setExtrudedHeight(value: Double): Self = StObject.set(x, "extrudedHeight", value.asInstanceOf[js.Any])
    
    inline def setExtrudedHeightUndefined: Self = StObject.set(x, "extrudedHeight", js.undefined)
    
    inline def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPerPositionHeight(value: Boolean): Self = StObject.set(x, "perPositionHeight", value.asInstanceOf[js.Any])
    
    inline def setPerPositionHeightUndefined: Self = StObject.set(x, "perPositionHeight", js.undefined)
    
    inline def setPolygonHierarchy(value: typings.cesiumEngine.mod.PolygonHierarchy): Self = StObject.set(x, "polygonHierarchy", value.asInstanceOf[js.Any])
    
    inline def setStRotation(value: Double): Self = StObject.set(x, "stRotation", value.asInstanceOf[js.Any])
    
    inline def setStRotationUndefined: Self = StObject.set(x, "stRotation", js.undefined)
    
    inline def setTextureCoordinates(value: typings.cesiumEngine.mod.PolygonHierarchy): Self = StObject.set(x, "textureCoordinates", value.asInstanceOf[js.Any])
    
    inline def setTextureCoordinatesUndefined: Self = StObject.set(x, "textureCoordinates", js.undefined)
    
    inline def setVertexFormat(value: typings.cesiumEngine.mod.VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    inline def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
  }
}
