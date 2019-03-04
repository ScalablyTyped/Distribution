package typings
package chromeDashAppsLib.chromeNs.documentScanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentScanCallbackArg extends js.Object {
  /** The data image URLs in a form that can be passed as the 'src' value to an image tag. */
  var dataUrls: js.Array[java.lang.String]
  /** The MIME type of dataUrls. */
  var mimeType: java.lang.String
}

object DocumentScanCallbackArg {
  @scala.inline
  def apply(dataUrls: js.Array[java.lang.String], mimeType: java.lang.String): DocumentScanCallbackArg = {
    val __obj = js.Dynamic.literal(dataUrls = dataUrls, mimeType = mimeType)
  
    __obj.asInstanceOf[DocumentScanCallbackArg]
  }
}

