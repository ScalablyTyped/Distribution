package typings.chromeApps.chrome.documentScan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentScanCallbackArg extends js.Object {
  /** The data image URLs in a form that can be passed as the 'src' value to an image tag. */
  var dataUrls: js.Array[String]
  /** The MIME type of dataUrls. */
  var mimeType: String
}

object DocumentScanCallbackArg {
  @scala.inline
  def apply(dataUrls: js.Array[String], mimeType: String): DocumentScanCallbackArg = {
    val __obj = js.Dynamic.literal(dataUrls = dataUrls.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocumentScanCallbackArg]
  }
}

