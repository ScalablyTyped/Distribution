package typings.chromeDashApps.chromeNs.documentScanNs

import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentScanOptions extends js.Object {
  /** The number of scanned images allowed (defaults to 1).  */
  var maxImages: js.UndefOr[integer] = js.undefined
  /** The MIME types that are accepted by the caller.  */
  var mimeTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object DocumentScanOptions {
  @scala.inline
  def apply(maxImages: js.UndefOr[integer] = js.undefined, mimeTypes: js.Array[String] = null): DocumentScanOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxImages)) __obj.updateDynamic("maxImages")(maxImages)
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes)
    __obj.asInstanceOf[DocumentScanOptions]
  }
}

