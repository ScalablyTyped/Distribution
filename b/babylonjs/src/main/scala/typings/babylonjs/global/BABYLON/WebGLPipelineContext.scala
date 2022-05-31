package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGLPipelineContext")
@js.native
class WebGLPipelineContext ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGLPipelineContext {
  
  /** @hidden */
  /* CompleteClass */
  override def _getFragmentShaderCode(): String | Null = js.native
  
  /** @hidden */
  /* CompleteClass */
  override def _getVertexShaderCode(): String | Null = js.native
  
  /** @hidden */
  /* CompleteClass */
  override def _handlesSpectorRebuildCallback(onCompiled: js.Function1[/* compiledObject */ js.Any, Unit]): Unit = js.native
  
  /**
    * Gets a boolean indicating that this pipeline context is supporting asynchronous creating
    */
  /* CompleteClass */
  var isAsync: Boolean = js.native
  
  /**
    * Gets a boolean indicating that the context is ready to be used (like shaders / pipelines are compiled and ready for instance)
    */
  /* CompleteClass */
  var isReady: Boolean = js.native
}
