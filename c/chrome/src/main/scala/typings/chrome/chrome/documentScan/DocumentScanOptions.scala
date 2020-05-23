package typings.chrome.chrome.documentScan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentScanOptions extends js.Object {
  /** Optional. The number of scanned images allowed (defaults to 1).  */
  var maxImages: js.UndefOr[Double] = js.undefined
  /** Optional. The MIME types that are accepted by the caller.  */
  var mimeTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object DocumentScanOptions {
  @scala.inline
  def apply(maxImages: js.UndefOr[Double] = js.undefined, mimeTypes: js.Array[String] = null): DocumentScanOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxImages)) __obj.updateDynamic("maxImages")(maxImages.get.asInstanceOf[js.Any])
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentScanOptions]
  }
}

