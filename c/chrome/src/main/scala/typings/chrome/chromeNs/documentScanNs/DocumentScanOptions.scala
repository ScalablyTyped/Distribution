package typings.chrome.chromeNs.documentScanNs

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
  def apply(maxImages: Int | Double = null, mimeTypes: js.Array[String] = null): DocumentScanOptions = {
    val __obj = js.Dynamic.literal()
    if (maxImages != null) __obj.updateDynamic("maxImages")(maxImages.asInstanceOf[js.Any])
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes)
    __obj.asInstanceOf[DocumentScanOptions]
  }
}

