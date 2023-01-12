package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeName extends StObject {
  
  var attributeName: String
  
  var fragmentShaderSource: js.UndefOr[String] = js.undefined
  
  var glslDatatype: js.UndefOr[String] = js.undefined
  
  var perInstanceAttribute: js.UndefOr[Boolean] = js.undefined
  
  var renderState: js.UndefOr[Any] = js.undefined
  
  var vertexShaderSource: js.UndefOr[String] = js.undefined
}
object AttributeName {
  
  inline def apply(attributeName: String): AttributeName = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeName] (val x: Self) extends AnyVal {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    inline def setFragmentShaderSource(value: String): Self = StObject.set(x, "fragmentShaderSource", value.asInstanceOf[js.Any])
    
    inline def setFragmentShaderSourceUndefined: Self = StObject.set(x, "fragmentShaderSource", js.undefined)
    
    inline def setGlslDatatype(value: String): Self = StObject.set(x, "glslDatatype", value.asInstanceOf[js.Any])
    
    inline def setGlslDatatypeUndefined: Self = StObject.set(x, "glslDatatype", js.undefined)
    
    inline def setPerInstanceAttribute(value: Boolean): Self = StObject.set(x, "perInstanceAttribute", value.asInstanceOf[js.Any])
    
    inline def setPerInstanceAttributeUndefined: Self = StObject.set(x, "perInstanceAttribute", js.undefined)
    
    inline def setRenderState(value: Any): Self = StObject.set(x, "renderState", value.asInstanceOf[js.Any])
    
    inline def setRenderStateUndefined: Self = StObject.set(x, "renderState", js.undefined)
    
    inline def setVertexShaderSource(value: String): Self = StObject.set(x, "vertexShaderSource", value.asInstanceOf[js.Any])
    
    inline def setVertexShaderSourceUndefined: Self = StObject.set(x, "vertexShaderSource", js.undefined)
  }
}
