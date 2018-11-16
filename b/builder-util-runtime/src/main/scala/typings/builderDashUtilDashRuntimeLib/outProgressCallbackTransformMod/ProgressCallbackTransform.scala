package typings
package builderDashUtilDashRuntimeLib.outProgressCallbackTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime/out/ProgressCallbackTransform", "ProgressCallbackTransform")
@js.native
class ProgressCallbackTransform protected ()
  extends nodeLib.streamMod.Transform {
  def this(total: scala.Double, cancellationToken: builderDashUtilDashRuntimeLib.outCancellationTokenMod.CancellationToken, onProgress: js.Function1[/* info */ ProgressInfo, _]) = this()
  val cancellationToken: js.Any = js.native
  var delta: js.Any = js.native
  var nextUpdate: js.Any = js.native
  val onProgress: js.Any = js.native
  var start: js.Any = js.native
  val total: js.Any = js.native
  var transferred: js.Any = js.native
  def _flush(callback: js.Any): scala.Unit = js.native
  def _transform(chunk: js.Any, encoding: java.lang.String, callback: js.Any): scala.Unit = js.native
}

