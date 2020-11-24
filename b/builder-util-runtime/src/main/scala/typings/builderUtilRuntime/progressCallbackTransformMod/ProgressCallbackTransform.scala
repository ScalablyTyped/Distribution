package typings.builderUtilRuntime.progressCallbackTransformMod

import typings.builderUtilRuntime.cancellationTokenMod.CancellationToken
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("builder-util-runtime/out/ProgressCallbackTransform", "ProgressCallbackTransform")
@js.native
class ProgressCallbackTransform protected () extends Transform {
  def this(
    total: Double,
    cancellationToken: CancellationToken,
    onProgress: js.Function1[/* info */ ProgressInfo, _]
  ) = this()
  
  def _flush(callback: js.Any): Unit = js.native
  
  def _transform(chunk: js.Any, encoding: String, callback: js.Any): Unit = js.native
  
  val cancellationToken: js.Any = js.native
  
  var delta: js.Any = js.native
  
  var nextUpdate: js.Any = js.native
  
  val onProgress: js.Any = js.native
  
  var start: js.Any = js.native
  
  val total: js.Any = js.native
  
  var transferred: js.Any = js.native
}
