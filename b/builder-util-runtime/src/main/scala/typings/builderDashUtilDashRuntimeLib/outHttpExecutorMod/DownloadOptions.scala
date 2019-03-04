package typings
package builderDashUtilDashRuntimeLib.outHttpExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadOptions extends js.Object {
  val cancellationToken: builderDashUtilDashRuntimeLib.outCancellationTokenMod.CancellationToken
  val headers: js.UndefOr[nodeLib.httpMod.OutgoingHttpHeaders | scala.Null] = js.undefined
  var onProgress: js.UndefOr[
    js.Function1[
      /* progress */ builderDashUtilDashRuntimeLib.outProgressCallbackTransformMod.ProgressInfo, 
      scala.Unit
    ]
  ] = js.undefined
  val sha2: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val sha512: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object DownloadOptions {
  @scala.inline
  def apply(
    cancellationToken: builderDashUtilDashRuntimeLib.outCancellationTokenMod.CancellationToken,
    headers: nodeLib.httpMod.OutgoingHttpHeaders = null,
    onProgress: js.Function1[
      /* progress */ builderDashUtilDashRuntimeLib.outProgressCallbackTransformMod.ProgressInfo, 
      scala.Unit
    ] = null,
    sha2: java.lang.String = null,
    sha512: java.lang.String = null
  ): DownloadOptions = {
    val __obj = js.Dynamic.literal(cancellationToken = cancellationToken)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress)
    if (sha2 != null) __obj.updateDynamic("sha2")(sha2)
    if (sha512 != null) __obj.updateDynamic("sha512")(sha512)
    __obj.asInstanceOf[DownloadOptions]
  }
}

