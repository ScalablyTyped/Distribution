package typings
package cordovaDashPluginDashFileDashTransferLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Optional parameters for upload method. */
trait FileUploadOptions extends js.Object {
  /** Whether to upload the data in chunked streaming mode. Defaults to true. */
  var chunkedMode: js.UndefOr[scala.Boolean] = js.undefined
  /** The name of the form element. Defaults to file. */
  var fileKey: js.UndefOr[java.lang.String] = js.undefined
  /** The file name to use when saving the file on the server. Defaults to image.jpg. */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  /** A map of header name/header values. Use an array to specify more than one value. */
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The HTTP method to use - either `PUT` or `POST`. Defaults to `POST`. */
  var httpMethod: js.UndefOr[java.lang.String] = js.undefined
  /** The mime type of the data to upload. Defaults to image/jpeg. */
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  /** A set of optional key/value pairs to pass in the HTTP request. */
  var params: js.UndefOr[js.Object] = js.undefined
}

