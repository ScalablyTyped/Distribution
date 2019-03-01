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

object FileUploadOptions {
  @scala.inline
  def apply(
    chunkedMode: js.UndefOr[scala.Boolean] = js.undefined,
    fileKey: java.lang.String = null,
    fileName: java.lang.String = null,
    headers: js.Object = null,
    httpMethod: java.lang.String = null,
    mimeType: java.lang.String = null,
    params: js.Object = null
  ): FileUploadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkedMode)) __obj.updateDynamic("chunkedMode")(chunkedMode)
    if (fileKey != null) __obj.updateDynamic("fileKey")(fileKey)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (httpMethod != null) __obj.updateDynamic("httpMethod")(httpMethod)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[FileUploadOptions]
  }
}

