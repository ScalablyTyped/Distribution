package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TracedShader extends StObject {
  
  var debugTrace: DebugTrace
  
  var shader: Shader
}
object TracedShader {
  
  inline def apply(debugTrace: DebugTrace, shader: Shader): TracedShader = {
    val __obj = js.Dynamic.literal(debugTrace = debugTrace.asInstanceOf[js.Any], shader = shader.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracedShader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TracedShader] (val x: Self) extends AnyVal {
    
    inline def setDebugTrace(value: DebugTrace): Self = StObject.set(x, "debugTrace", value.asInstanceOf[js.Any])
    
    inline def setShader(value: Shader): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
  }
}
