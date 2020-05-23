package typings.builderUtilRuntime.httpExecutorMod

import typings.builderUtilRuntime.cancellationTokenMod.CancellationToken
import typings.builderUtilRuntime.progressCallbackTransformMod.ProgressInfo
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadOptions extends js.Object {
  val cancellationToken: CancellationToken
  val headers: js.UndefOr[OutgoingHttpHeaders | Null] = js.undefined
  var onProgress: js.UndefOr[js.Function1[/* progress */ ProgressInfo, Unit]] = js.undefined
  val sha2: js.UndefOr[String | Null] = js.undefined
  val sha512: js.UndefOr[String | Null] = js.undefined
}

object DownloadOptions {
  @scala.inline
  def apply(
    cancellationToken: CancellationToken,
    headers: js.UndefOr[Null | OutgoingHttpHeaders] = js.undefined,
    onProgress: /* progress */ ProgressInfo => Unit = null,
    sha2: js.UndefOr[Null | String] = js.undefined,
    sha512: js.UndefOr[Null | String] = js.undefined
  ): DownloadOptions = {
    val __obj = js.Dynamic.literal(cancellationToken = cancellationToken.asInstanceOf[js.Any])
    if (!js.isUndefined(headers)) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (!js.isUndefined(sha2)) __obj.updateDynamic("sha2")(sha2.asInstanceOf[js.Any])
    if (!js.isUndefined(sha512)) __obj.updateDynamic("sha512")(sha512.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadOptions]
  }
}

