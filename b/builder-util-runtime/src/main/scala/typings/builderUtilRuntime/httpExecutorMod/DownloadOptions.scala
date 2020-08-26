package typings.builderUtilRuntime.httpExecutorMod

import typings.builderUtilRuntime.cancellationTokenMod.CancellationToken
import typings.builderUtilRuntime.progressCallbackTransformMod.ProgressInfo
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadOptions extends js.Object {
  val cancellationToken: CancellationToken = js.native
  val headers: js.UndefOr[OutgoingHttpHeaders | Null] = js.native
  var onProgress: js.UndefOr[js.Function1[/* progress */ ProgressInfo, Unit]] = js.native
  val sha2: js.UndefOr[String | Null] = js.native
  val sha512: js.UndefOr[String | Null] = js.native
}

object DownloadOptions {
  @scala.inline
  def apply(cancellationToken: CancellationToken): DownloadOptions = {
    val __obj = js.Dynamic.literal(cancellationToken = cancellationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadOptions]
  }
  @scala.inline
  implicit class DownloadOptionsOps[Self <: DownloadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancellationToken(value: CancellationToken): Self = this.set("cancellationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: OutgoingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHeadersNull: Self = this.set("headers", null)
    @scala.inline
    def setOnProgress(value: /* progress */ ProgressInfo => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    @scala.inline
    def setSha2(value: String): Self = this.set("sha2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha2: Self = this.set("sha2", js.undefined)
    @scala.inline
    def setSha2Null: Self = this.set("sha2", null)
    @scala.inline
    def setSha512(value: String): Self = this.set("sha512", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha512: Self = this.set("sha512", js.undefined)
    @scala.inline
    def setSha512Null: Self = this.set("sha512", null)
  }
  
}

