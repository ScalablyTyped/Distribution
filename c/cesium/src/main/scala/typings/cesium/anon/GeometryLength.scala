package typings.cesium.anon

import typings.cesium.mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryLength extends StObject {
  
  var geometry: typings.cesium.mod.Geometry
  
  var length: js.UndefOr[Double] = js.undefined
  
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
}
object GeometryLength {
  
  inline def apply(geometry: typings.cesium.mod.Geometry): GeometryLength = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeometryLength] (val x: Self) extends AnyVal {
    
    inline def setGeometry(value: typings.cesium.mod.Geometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    inline def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
  }
}
