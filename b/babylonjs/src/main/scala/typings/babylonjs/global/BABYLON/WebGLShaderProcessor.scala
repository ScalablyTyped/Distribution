package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.ShaderProcessingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGLShaderProcessor")
@js.native
open class WebGLShaderProcessor ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGLShaderProcessor {
  
  /* CompleteClass */
  @JSName("postProcessor")
  override def postProcessor_MWebGLShaderProcessor(
    code: String,
    defines: js.Array[String],
    isFragment: Boolean,
    processingContext: Nullable[ShaderProcessingContext],
    engine: typings.babylonjs.BABYLON.ThinEngine
  ): String = js.native
  
  /* CompleteClass */
  var shaderLanguage: typings.babylonjs.BABYLON.ShaderLanguage = js.native
}
