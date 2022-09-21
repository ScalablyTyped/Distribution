package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentShaderSource extends StObject {
  
  var fragmentShaderSource: js.UndefOr[String] = js.undefined
  
  var renderState: js.UndefOr[Any] = js.undefined
  
  var translucent: js.UndefOr[Boolean] = js.undefined
  
  var vertexShaderSource: js.UndefOr[String] = js.undefined
}
object FragmentShaderSource {
  
  inline def apply(): FragmentShaderSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FragmentShaderSource]
  }
  
  extension [Self <: FragmentShaderSource](x: Self) {
    
    inline def setFragmentShaderSource(value: String): Self = StObject.set(x, "fragmentShaderSource", value.asInstanceOf[js.Any])
    
    inline def setFragmentShaderSourceUndefined: Self = StObject.set(x, "fragmentShaderSource", js.undefined)
    
    inline def setRenderState(value: Any): Self = StObject.set(x, "renderState", value.asInstanceOf[js.Any])
    
    inline def setRenderStateUndefined: Self = StObject.set(x, "renderState", js.undefined)
    
    inline def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
    
    inline def setVertexShaderSource(value: String): Self = StObject.set(x, "vertexShaderSource", value.asInstanceOf[js.Any])
    
    inline def setVertexShaderSourceUndefined: Self = StObject.set(x, "vertexShaderSource", js.undefined)
  }
}
