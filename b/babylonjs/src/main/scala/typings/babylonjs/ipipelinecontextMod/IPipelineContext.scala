package typings.babylonjs.ipipelinecontextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPipelineContext extends js.Object {
  /**
    * Gets a boolean indicating that this pipeline context is supporting asynchronous creating
    */
  var isAsync: Boolean
  /**
    * Gets a boolean indicating that the context is ready to be used (like shaders / pipelines are compiled and ready for instance)
    */
  var isReady: Boolean
  /** @hidden */
  def _handlesSpectorRebuildCallback(onCompiled: js.Function1[/* compiledObject */ js.Any, Unit]): Unit
}

object IPipelineContext {
  @scala.inline
  def apply(
    _handlesSpectorRebuildCallback: js.Function1[/* compiledObject */ js.Any, Unit] => Unit,
    isAsync: Boolean,
    isReady: Boolean
  ): IPipelineContext = {
    val __obj = js.Dynamic.literal(_handlesSpectorRebuildCallback = js.Any.fromFunction1(_handlesSpectorRebuildCallback), isAsync = isAsync.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPipelineContext]
  }
}

