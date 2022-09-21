package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPUComputePipelineContext")
@js.native
open class WebGPUComputePipelineContext protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGPUComputePipelineContext {
  def this(engine: typings.babylonjs.BABYLON.WebGPUEngine) = this()
  
  /** @hidden */
  /* CompleteClass */
  override def _getComputeShaderCode(): String | Null = js.native
  
  /** Releases the resources associated with the pipeline. */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Gets a boolean indicating that this pipeline context is supporting asynchronous creating
    */
  /* CompleteClass */
  var isAsync: Boolean = js.native
  
  /**
    * Gets a boolean indicating that the context is ready to be used (like shader / pipeline are compiled and ready for instance)
    */
  /* CompleteClass */
  var isReady: Boolean = js.native
}
