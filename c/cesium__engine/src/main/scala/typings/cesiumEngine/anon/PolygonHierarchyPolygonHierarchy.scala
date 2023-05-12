package typings.cesiumEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolygonHierarchyPolygonHierarchy extends StObject {
  
  var polygonHierarchy: typings.cesiumEngine.mod.PolygonHierarchy
}
object PolygonHierarchyPolygonHierarchy {
  
  inline def apply(polygonHierarchy: typings.cesiumEngine.mod.PolygonHierarchy): PolygonHierarchyPolygonHierarchy = {
    val __obj = js.Dynamic.literal(polygonHierarchy = polygonHierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonHierarchyPolygonHierarchy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolygonHierarchyPolygonHierarchy] (val x: Self) extends AnyVal {
    
    inline def setPolygonHierarchy(value: typings.cesiumEngine.mod.PolygonHierarchy): Self = StObject.set(x, "polygonHierarchy", value.asInstanceOf[js.Any])
  }
}
