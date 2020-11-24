package typings.babylonjs

import typings.babylonjs.iShaderProcessorMod.IShaderProcessor
import typings.babylonjs.thinEngineMod.ThinEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Engines/WebGL/webGLShaderProcessors", JSImport.Namespace)
@js.native
object webGLShaderProcessorsMod extends js.Object {
  
  @js.native
  class WebGLShaderProcessor () extends IShaderProcessor {
    
    @JSName("postProcessor")
    def postProcessor_MWebGLShaderProcessor(code: String, defines: js.Array[String], isFragment: Boolean, engine: ThinEngine): String = js.native
  }
}
