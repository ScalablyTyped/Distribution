package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeName extends StObject {
  
  var attributeName: String
  
  var fragmentShaderSource: js.UndefOr[String] = js.undefined
  
  var glslDatatype: js.UndefOr[String] = js.undefined
  
  var renderState: js.UndefOr[typings.cesium.mod.RenderState] = js.undefined
  
  var vertexShaderSource: js.UndefOr[String] = js.undefined
}
object AttributeName {
  
  @scala.inline
  def apply(attributeName: String): AttributeName = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeName]
  }
  
  @scala.inline
  implicit class AttributeNameMutableBuilder[Self <: AttributeName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentShaderSource(value: String): Self = StObject.set(x, "fragmentShaderSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentShaderSourceUndefined: Self = StObject.set(x, "fragmentShaderSource", js.undefined)
    
    @scala.inline
    def setGlslDatatype(value: String): Self = StObject.set(x, "glslDatatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlslDatatypeUndefined: Self = StObject.set(x, "glslDatatype", js.undefined)
    
    @scala.inline
    def setRenderState(value: typings.cesium.mod.RenderState): Self = StObject.set(x, "renderState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderStateUndefined: Self = StObject.set(x, "renderState", js.undefined)
    
    @scala.inline
    def setVertexShaderSource(value: String): Self = StObject.set(x, "vertexShaderSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexShaderSourceUndefined: Self = StObject.set(x, "vertexShaderSource", js.undefined)
  }
}
