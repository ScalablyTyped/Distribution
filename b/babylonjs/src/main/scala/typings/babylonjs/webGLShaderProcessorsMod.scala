package typings.babylonjs

import typings.babylonjs.iShaderProcessorMod.IShaderProcessor
import typings.babylonjs.shaderLanguageMod.ShaderLanguage
import typings.babylonjs.shaderProcessingOptionsMod.ShaderProcessingContext
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLShaderProcessorsMod {
  
  @JSImport("babylonjs/Engines/WebGL/webGLShaderProcessors", "WebGLShaderProcessor")
  @js.native
  open class WebGLShaderProcessor ()
    extends StObject
       with IShaderProcessor {
    
    @JSName("postProcessor")
    def postProcessor_MWebGLShaderProcessor(
      code: String,
      defines: js.Array[String],
      isFragment: Boolean,
      processingContext: Nullable[ShaderProcessingContext],
      engine: ThinEngine
    ): String = js.native
    
    /* CompleteClass */
    var shaderLanguage: ShaderLanguage = js.native
  }
}
