package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexFormat extends StObject {
  
  var vertexFormat: js.UndefOr[typings.cesium.mod.VertexFormat] = js.undefined
}
object VertexFormat {
  
  inline def apply(): VertexFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VertexFormat]
  }
  
  extension [Self <: VertexFormat](x: Self) {
    
    inline def setVertexFormat(value: typings.cesium.mod.VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    inline def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
  }
}
