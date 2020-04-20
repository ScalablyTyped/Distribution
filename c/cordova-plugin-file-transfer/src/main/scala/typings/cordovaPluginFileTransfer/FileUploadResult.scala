package typings.cordovaPluginFileTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A FileUploadResult object is passed to the success callback of the FileTransfer object's upload() method. */
trait FileUploadResult extends js.Object {
  /** The number of bytes sent to the server as part of the upload. */
  var bytesSent: Double
  /** The HTTP response headers by the server. Currently supported on iOS only.*/
  var headers: js.Any
  /** The HTTP response returned by the server. */
  var response: String
  /** The HTTP response code returned by the server. */
  var responseCode: Double
}

object FileUploadResult {
  @scala.inline
  def apply(bytesSent: Double, headers: js.Any, response: String, responseCode: Double): FileUploadResult = {
    val __obj = js.Dynamic.literal(bytesSent = bytesSent.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseCode = responseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadResult]
  }
}

