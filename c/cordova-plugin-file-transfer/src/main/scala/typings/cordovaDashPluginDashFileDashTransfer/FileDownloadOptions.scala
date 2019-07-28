package typings.cordovaDashPluginDashFileDashTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Optional parameters for download method. */
trait FileDownloadOptions extends js.Object {
  /** A map of header name/header values. */
  var headers: js.UndefOr[js.Object] = js.undefined
}

object FileDownloadOptions {
  @scala.inline
  def apply(headers: js.Object = null): FileDownloadOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[FileDownloadOptions]
  }
}

