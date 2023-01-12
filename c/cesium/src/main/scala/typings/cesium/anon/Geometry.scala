package typings.cesium.anon

import typings.cesium.mod.GeometryFactory
import typings.cesium.mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometry extends StObject {
  
  var attributes: js.UndefOr[Any] = js.undefined
  
  var geometry: typings.cesium.mod.Geometry | GeometryFactory
  
  var id: js.UndefOr[Any] = js.undefined
  
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
}
object Geometry {
  
  inline def apply(geometry: typings.cesium.mod.Geometry | GeometryFactory): Geometry = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Geometry] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setGeometry(value: typings.cesium.mod.Geometry | GeometryFactory): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    inline def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
  }
}
