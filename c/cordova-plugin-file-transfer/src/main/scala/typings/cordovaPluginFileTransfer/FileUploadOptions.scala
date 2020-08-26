package typings.cordovaPluginFileTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Optional parameters for upload method. */
@js.native
trait FileUploadOptions extends js.Object {
  /** Whether to upload the data in chunked streaming mode. Defaults to true. */
  var chunkedMode: js.UndefOr[Boolean] = js.native
  /** The name of the form element. Defaults to file. */
  var fileKey: js.UndefOr[String] = js.native
  /** The file name to use when saving the file on the server. Defaults to image.jpg. */
  var fileName: js.UndefOr[String] = js.native
  /** A map of header name/header values. Use an array to specify more than one value. */
  var headers: js.UndefOr[js.Object] = js.native
  /** The HTTP method to use - either `PUT` or `POST`. Defaults to `POST`. */
  var httpMethod: js.UndefOr[String] = js.native
  /** The mime type of the data to upload. Defaults to image/jpeg. */
  var mimeType: js.UndefOr[String] = js.native
  /** A set of optional key/value pairs to pass in the HTTP request. */
  var params: js.UndefOr[js.Object] = js.native
}

object FileUploadOptions {
  @scala.inline
  def apply(): FileUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUploadOptions]
  }
  @scala.inline
  implicit class FileUploadOptionsOps[Self <: FileUploadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChunkedMode(value: Boolean): Self = this.set("chunkedMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkedMode: Self = this.set("chunkedMode", js.undefined)
    @scala.inline
    def setFileKey(value: String): Self = this.set("fileKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileKey: Self = this.set("fileKey", js.undefined)
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHttpMethod(value: String): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpMethod: Self = this.set("httpMethod", js.undefined)
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
  
}

