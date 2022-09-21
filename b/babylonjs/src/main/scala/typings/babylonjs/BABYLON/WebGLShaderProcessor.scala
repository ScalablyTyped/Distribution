package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLShaderProcessor
  extends StObject
     with IShaderProcessor {
  
  @JSName("postProcessor")
  def postProcessor_MWebGLShaderProcessor(
    code: String,
    defines: js.Array[String],
    isFragment: Boolean,
    processingContext: Nullable[ShaderProcessingContext],
    engine: ThinEngine
  ): String
}
object WebGLShaderProcessor {
  
  inline def apply(
    postProcessor: (String, js.Array[String], Boolean, Nullable[ShaderProcessingContext], ThinEngine) => String,
    shaderLanguage: ShaderLanguage
  ): WebGLShaderProcessor = {
    val __obj = js.Dynamic.literal(postProcessor = js.Any.fromFunction5(postProcessor), shaderLanguage = shaderLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLShaderProcessor]
  }
  
  extension [Self <: WebGLShaderProcessor](x: Self) {
    
    inline def setPostProcessor(
      value: (String, js.Array[String], Boolean, Nullable[ShaderProcessingContext], ThinEngine) => String
    ): Self = StObject.set(x, "postProcessor", js.Any.fromFunction5(value))
  }
}
