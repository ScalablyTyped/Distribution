package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolygonHierarchyPolygonHierarchy extends StObject {
  
  var polygonHierarchy: typings.cesium.mod.PolygonHierarchy
}
object PolygonHierarchyPolygonHierarchy {
  
  inline def apply(polygonHierarchy: typings.cesium.mod.PolygonHierarchy): PolygonHierarchyPolygonHierarchy = {
    val __obj = js.Dynamic.literal(polygonHierarchy = polygonHierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonHierarchyPolygonHierarchy]
  }
  
  extension [Self <: PolygonHierarchyPolygonHierarchy](x: Self) {
    
    inline def setPolygonHierarchy(value: typings.cesium.mod.PolygonHierarchy): Self = StObject.set(x, "polygonHierarchy", value.asInstanceOf[js.Any])
  }
}
