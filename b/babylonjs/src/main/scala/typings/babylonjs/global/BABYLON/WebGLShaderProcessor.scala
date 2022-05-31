package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGLShaderProcessor")
@js.native
class WebGLShaderProcessor ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGLShaderProcessor {
  
  /* CompleteClass */
  @JSName("postProcessor")
  override def postProcessor_MWebGLShaderProcessor(
    code: String,
    defines: js.Array[String],
    isFragment: Boolean,
    engine: typings.babylonjs.BABYLON.ThinEngine
  ): String = js.native
}
