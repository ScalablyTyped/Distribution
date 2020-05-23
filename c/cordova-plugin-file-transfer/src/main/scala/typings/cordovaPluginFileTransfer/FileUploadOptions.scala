package typings.cordovaPluginFileTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Optional parameters for upload method. */
trait FileUploadOptions extends js.Object {
  /** Whether to upload the data in chunked streaming mode. Defaults to true. */
  var chunkedMode: js.UndefOr[Boolean] = js.undefined
  /** The name of the form element. Defaults to file. */
  var fileKey: js.UndefOr[String] = js.undefined
  /** The file name to use when saving the file on the server. Defaults to image.jpg. */
  var fileName: js.UndefOr[String] = js.undefined
  /** A map of header name/header values. Use an array to specify more than one value. */
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The HTTP method to use - either `PUT` or `POST`. Defaults to `POST`. */
  var httpMethod: js.UndefOr[String] = js.undefined
  /** The mime type of the data to upload. Defaults to image/jpeg. */
  var mimeType: js.UndefOr[String] = js.undefined
  /** A set of optional key/value pairs to pass in the HTTP request. */
  var params: js.UndefOr[js.Object] = js.undefined
}

object FileUploadOptions {
  @scala.inline
  def apply(
    chunkedMode: js.UndefOr[Boolean] = js.undefined,
    fileKey: String = null,
    fileName: String = null,
    headers: js.Object = null,
    httpMethod: String = null,
    mimeType: String = null,
    params: js.Object = null
  ): FileUploadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkedMode)) __obj.updateDynamic("chunkedMode")(chunkedMode.get.asInstanceOf[js.Any])
    if (fileKey != null) __obj.updateDynamic("fileKey")(fileKey.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (httpMethod != null) __obj.updateDynamic("httpMethod")(httpMethod.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadOptions]
  }
}

