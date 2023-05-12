package typings.cesiumEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcTypeEllipsoid extends StObject {
  
  var arcType: js.UndefOr[typings.cesiumEngine.mod.ArcType] = js.undefined
  
  var ellipsoid: js.UndefOr[typings.cesiumEngine.mod.Ellipsoid] = js.undefined
  
  var granularity: js.UndefOr[Double] = js.undefined
  
  var polygonHierarchy: typings.cesiumEngine.mod.PolygonHierarchy
}
object ArcTypeEllipsoid {
  
  inline def apply(polygonHierarchy: typings.cesiumEngine.mod.PolygonHierarchy): ArcTypeEllipsoid = {
    val __obj = js.Dynamic.literal(polygonHierarchy = polygonHierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcTypeEllipsoid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArcTypeEllipsoid] (val x: Self) extends AnyVal {
    
    inline def setArcType(value: typings.cesiumEngine.mod.ArcType): Self = StObject.set(x, "arcType", value.asInstanceOf[js.Any])
    
    inline def setArcTypeUndefined: Self = StObject.set(x, "arcType", js.undefined)
    
    inline def setEllipsoid(value: typings.cesiumEngine.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    inline def setPolygonHierarchy(value: typings.cesiumEngine.mod.PolygonHierarchy): Self = StObject.set(x, "polygonHierarchy", value.asInstanceOf[js.Any])
  }
}
