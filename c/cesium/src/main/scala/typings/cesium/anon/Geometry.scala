package typings.cesium.anon

import typings.cesium.mod.Matrix4
import typings.cesium.mod.PolygonGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometry extends StObject {
  
  var attributes: js.UndefOr[js.Any] = js.undefined
  
  var geometry: typings.cesium.mod.Geometry | PolygonGeometry
  
  var id: js.UndefOr[js.Any] = js.undefined
  
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
}
object Geometry {
  
  @scala.inline
  def apply(geometry: typings.cesium.mod.Geometry | PolygonGeometry): Geometry = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  
  @scala.inline
  implicit class GeometryMutableBuilder[Self <: Geometry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setGeometry(value: typings.cesium.mod.Geometry | PolygonGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
  }
}
