package typings.cordovaPluginFileTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A FileUploadResult object is passed to the success callback of the FileTransfer object's upload() method. */
@js.native
trait FileUploadResult extends js.Object {
  /** The number of bytes sent to the server as part of the upload. */
  var bytesSent: Double = js.native
  /** The HTTP response headers by the server. Currently supported on iOS only.*/
  var headers: js.Any = js.native
  /** The HTTP response returned by the server. */
  var response: String = js.native
  /** The HTTP response code returned by the server. */
  var responseCode: Double = js.native
}

object FileUploadResult {
  @scala.inline
  def apply(bytesSent: Double, headers: js.Any, response: String, responseCode: Double): FileUploadResult = {
    val __obj = js.Dynamic.literal(bytesSent = bytesSent.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseCode = responseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadResult]
  }
  @scala.inline
  implicit class FileUploadResultOps[Self <: FileUploadResult] (val x: Self) extends AnyVal {
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
    def setBytesSent(value: Double): Self = this.set("bytesSent", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: String): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseCode(value: Double): Self = this.set("responseCode", value.asInstanceOf[js.Any])
  }
  
}

