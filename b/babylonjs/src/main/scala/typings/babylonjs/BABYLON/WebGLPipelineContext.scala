package typings.babylonjs.BABYLON

import typings.babylonjs.WebGLProgram
import typings.babylonjs.WebGLRenderingContext
import typings.std.WebGLShader
import typings.std.WebGLTransformFeedback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebGLPipelineContext")
@js.native
class WebGLPipelineContext () extends IPipelineContext {
  var context: js.UndefOr[WebGLRenderingContext] = js.native
  var engine: ThinEngine = js.native
  var fragmentCompilationError: Nullable[String] = js.native
  var fragmentShader: js.UndefOr[WebGLShader] = js.native
  /**
    * Gets a boolean indicating that this pipeline context is supporting asynchronous creating
    */
  /* CompleteClass */
  override var isAsync: Boolean = js.native
  var isParallelCompiled: Boolean = js.native
  /**
    * Gets a boolean indicating that the context is ready to be used (like shaders / pipelines are compiled and ready for instance)
    */
  /* CompleteClass */
  override var isReady: Boolean = js.native
  var onCompiled: js.UndefOr[js.Function0[Unit]] = js.native
  var program: Nullable[WebGLProgram] = js.native
  var programLinkError: Nullable[String] = js.native
  var programValidationError: Nullable[String] = js.native
  var transformFeedback: js.UndefOr[WebGLTransformFeedback | Null] = js.native
  var vertexCompilationError: Nullable[String] = js.native
  var vertexShader: js.UndefOr[WebGLShader] = js.native
  /** @hidden */
  /* CompleteClass */
  override def _handlesSpectorRebuildCallback(onCompiled: js.Function1[/* compiledObject */ js.Any, Unit]): Unit = js.native
  @JSName("isAsync")
  def isAsync_MWebGLPipelineContext(): Boolean = js.native
  @JSName("isReady")
  def isReady_MWebGLPipelineContext(): Boolean = js.native
}

