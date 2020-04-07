package typings.babylonjs

import typings.babylonjs.webGL2ShaderProcessorsMod.WebGL2ShaderProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Engines/Native/nativeShaderProcessor", JSImport.Namespace)
@js.native
object nativeShaderProcessorMod extends js.Object {
  @js.native
  class NativeShaderProcessor () extends WebGL2ShaderProcessor {
    var _genericAttributeLocation: js.Any = js.native
    var _replacements: js.Any = js.native
    var _textureCount: js.Any = js.native
    var _uniforms: js.Any = js.native
    var _varyingLocationCount: js.Any = js.native
    var _varyingLocationMap: js.Any = js.native
    @JSName("attributeProcessor")
    def attributeProcessor_MNativeShaderProcessor(attribute: String): String = js.native
    @JSName("lineProcessor")
    def lineProcessor_MNativeShaderProcessor(line: String): String = js.native
    @JSName("postProcessor")
    def postProcessor_MNativeShaderProcessor(code: String, defines: js.Array[String], isFragment: Boolean): String = js.native
    @JSName("preProcessor")
    def preProcessor_MNativeShaderProcessor(code: String, defines: js.Array[String], isFragment: Boolean): String = js.native
    @JSName("uniformProcessor")
    def uniformProcessor_MNativeShaderProcessor(uniform: String): String = js.native
    @JSName("varyingProcessor")
    def varyingProcessor_MNativeShaderProcessor(varying: String, isFragment: Boolean): String = js.native
  }
  
}

