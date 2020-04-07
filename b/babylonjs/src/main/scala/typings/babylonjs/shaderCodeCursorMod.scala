package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Engines/Processors/shaderCodeCursor", JSImport.Namespace)
@js.native
object shaderCodeCursorMod extends js.Object {
  @js.native
  class ShaderCodeCursor () extends js.Object {
    var _lines: js.Any = js.native
    var lineIndex: Double = js.native
    def canRead(): Boolean = js.native
    def currentLine(): String = js.native
    def lines(value: js.Array[String]): js.Any = js.native
  }
  
}

