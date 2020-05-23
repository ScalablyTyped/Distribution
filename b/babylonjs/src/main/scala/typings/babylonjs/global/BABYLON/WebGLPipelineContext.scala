package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.WebGLProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebGLPipelineContext")
@js.native
class WebGLPipelineContext ()
  extends typings.babylonjs.BABYLON.WebGLPipelineContext {
  /* CompleteClass */
  override var engine: typings.babylonjs.BABYLON.ThinEngine = js.native
  /* CompleteClass */
  override var fragmentCompilationError: Nullable[String] = js.native
  /**
    * Gets a boolean indicating that this pipeline context is supporting asynchronous creating
    */
  /* CompleteClass */
  override var isAsync: Boolean = js.native
  /* CompleteClass */
  override var isParallelCompiled: Boolean = js.native
  /**
    * Gets a boolean indicating that the context is ready to be used (like shaders / pipelines are compiled and ready for instance)
    */
  /* CompleteClass */
  override var isReady: Boolean = js.native
  /* CompleteClass */
  override var program: Nullable[WebGLProgram] = js.native
  /* CompleteClass */
  override var programLinkError: Nullable[String] = js.native
  /* CompleteClass */
  override var programValidationError: Nullable[String] = js.native
  /* CompleteClass */
  override var vertexCompilationError: Nullable[String] = js.native
  /** @hidden */
  /* CompleteClass */
  override def _handlesSpectorRebuildCallback(onCompiled: js.Function1[/* compiledObject */ js.Any, Unit]): Unit = js.native
  /* CompleteClass */
  @JSName("isAsync")
  override def isAsync_MWebGLPipelineContext: Boolean = js.native
  /* CompleteClass */
  @JSName("isReady")
  override def isReady_MWebGLPipelineContext: Boolean = js.native
}

