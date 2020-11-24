package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Engines/Processors/shaderCodeCursor", JSImport.Namespace)
@js.native
object shaderCodeCursorMod extends js.Object {
  
  @js.native
  class ShaderCodeCursor () extends js.Object {
    
    var _lines: js.Any = js.native
    
    def canRead: Boolean = js.native
    
    def currentLine: String = js.native
    
    var lineIndex: Double = js.native
    
    def lines_=(value: js.Array[String]): Unit = js.native
  }
}
