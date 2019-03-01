package typings
package chromeDashAppsLib.chromeNs.documentScanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentScanOptions extends js.Object {
  /** The number of scanned images allowed (defaults to 1).  */
  var maxImages: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** The MIME types that are accepted by the caller.  */
  var mimeTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object DocumentScanOptions {
  @scala.inline
  def apply(
    maxImages: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    mimeTypes: js.Array[java.lang.String] = null
  ): DocumentScanOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxImages)) __obj.updateDynamic("maxImages")(maxImages)
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes)
    __obj.asInstanceOf[DocumentScanOptions]
  }
}

