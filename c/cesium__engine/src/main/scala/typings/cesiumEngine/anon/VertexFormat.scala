package typings.cesiumEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexFormat extends StObject {
  
  var vertexFormat: js.UndefOr[typings.cesiumEngine.mod.VertexFormat] = js.undefined
}
object VertexFormat {
  
  inline def apply(): VertexFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VertexFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VertexFormat] (val x: Self) extends AnyVal {
    
    inline def setVertexFormat(value: typings.cesiumEngine.mod.VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    inline def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
  }
}
