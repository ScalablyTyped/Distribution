package typings.babylonjs.BABYLON

import typings.babylonjs.WebGLProgram
import typings.babylonjs.WebGLRenderingContext
import typings.std.WebGLShader
import typings.std.WebGLTransformFeedback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLPipelineContext extends IPipelineContext {
  var context: js.UndefOr[WebGLRenderingContext] = js.undefined
  var engine: ThinEngine
  var fragmentCompilationError: Nullable[String]
  var fragmentShader: js.UndefOr[WebGLShader] = js.undefined
  var isParallelCompiled: Boolean
  var onCompiled: js.UndefOr[js.Function0[Unit]] = js.undefined
  var program: Nullable[WebGLProgram]
  var programLinkError: Nullable[String]
  var programValidationError: Nullable[String]
  var transformFeedback: js.UndefOr[WebGLTransformFeedback | Null] = js.undefined
  var vertexCompilationError: Nullable[String]
  var vertexShader: js.UndefOr[WebGLShader] = js.undefined
  @JSName("isAsync")
  def isAsync_MWebGLPipelineContext: Boolean
  @JSName("isReady")
  def isReady_MWebGLPipelineContext: Boolean
}

object WebGLPipelineContext {
  @scala.inline
  def apply(
    _handlesSpectorRebuildCallback: js.Function1[/* compiledObject */ js.Any, Unit] => Unit,
    engine: ThinEngine,
    isAsync: () => Boolean,
    isParallelCompiled: Boolean,
    isReady: () => Boolean,
    context: WebGLRenderingContext = null,
    fragmentCompilationError: Nullable[String] = null,
    fragmentShader: WebGLShader = null,
    onCompiled: () => Unit = null,
    program: Nullable[WebGLProgram] = null,
    programLinkError: Nullable[String] = null,
    programValidationError: Nullable[String] = null,
    transformFeedback: js.UndefOr[Null | WebGLTransformFeedback] = js.undefined,
    vertexCompilationError: Nullable[String] = null,
    vertexShader: WebGLShader = null
  ): WebGLPipelineContext = {
    val __obj = js.Dynamic.literal(_handlesSpectorRebuildCallback = js.Any.fromFunction1(_handlesSpectorRebuildCallback), engine = engine.asInstanceOf[js.Any], isAsync = js.Any.fromFunction0(isAsync), isParallelCompiled = isParallelCompiled.asInstanceOf[js.Any], isReady = js.Any.fromFunction0(isReady), fragmentCompilationError = fragmentCompilationError.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], programLinkError = programLinkError.asInstanceOf[js.Any], programValidationError = programValidationError.asInstanceOf[js.Any], vertexCompilationError = vertexCompilationError.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (fragmentShader != null) __obj.updateDynamic("fragmentShader")(fragmentShader.asInstanceOf[js.Any])
    if (onCompiled != null) __obj.updateDynamic("onCompiled")(js.Any.fromFunction0(onCompiled))
    if (!js.isUndefined(transformFeedback)) __obj.updateDynamic("transformFeedback")(transformFeedback.asInstanceOf[js.Any])
    if (vertexShader != null) __obj.updateDynamic("vertexShader")(vertexShader.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLPipelineContext]
  }
}

