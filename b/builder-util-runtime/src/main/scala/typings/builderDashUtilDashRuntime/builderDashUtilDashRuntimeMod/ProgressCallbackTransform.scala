package typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeMod

import typings.builderDashUtilDashRuntime.outProgressCallbackTransformMod.ProgressInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime", "ProgressCallbackTransform")
@js.native
class ProgressCallbackTransform protected ()
  extends typings.builderDashUtilDashRuntime.outProgressCallbackTransformMod.ProgressCallbackTransform {
  def this(
    total: Double,
    cancellationToken: typings.builderDashUtilDashRuntime.outCancellationTokenMod.CancellationToken,
    onProgress: js.Function1[/* info */ ProgressInfo, _]
  ) = this()
}

