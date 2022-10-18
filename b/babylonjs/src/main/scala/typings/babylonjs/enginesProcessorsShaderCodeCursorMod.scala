package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesProcessorsShaderCodeCursorMod {
  
  @JSImport("babylonjs/Engines/Processors/shaderCodeCursor", "ShaderCodeCursor")
  @js.native
  open class ShaderCodeCursor () extends StObject {
    
    /* private */ var _lines: Any = js.native
    
    def canRead: Boolean = js.native
    
    def currentLine: String = js.native
    
    var lineIndex: Double = js.native
    
    def lines_=(value: js.Array[String]): Unit = js.native
  }
}
