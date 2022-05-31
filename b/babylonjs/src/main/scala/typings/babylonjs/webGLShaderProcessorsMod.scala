package typings.babylonjs

import typings.babylonjs.iShaderProcessorMod.IShaderProcessor
import typings.babylonjs.thinEngineMod.ThinEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLShaderProcessorsMod {
  
  @JSImport("babylonjs/Engines/WebGL/webGLShaderProcessors", "WebGLShaderProcessor")
  @js.native
  class WebGLShaderProcessor ()
    extends StObject
       with IShaderProcessor {
    
    @JSName("postProcessor")
    def postProcessor_MWebGLShaderProcessor(code: String, defines: js.Array[String], isFragment: Boolean, engine: ThinEngine): String = js.native
  }
}
