package typings
package cordovaDashPluginDashFileDashTransferLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A FileUploadResult object is passed to the success callback of the FileTransfer object's upload() method. */
trait FileUploadResult extends js.Object {
  /** The number of bytes sent to the server as part of the upload. */
  var bytesSent: scala.Double
  /** The HTTP response headers by the server. Currently supported on iOS only.*/
  var headers: js.Any
  /** The HTTP response returned by the server. */
  var response: java.lang.String
  /** The HTTP response code returned by the server. */
  var responseCode: scala.Double
}

object FileUploadResult {
  @scala.inline
  def apply(bytesSent: scala.Double, headers: js.Any, response: java.lang.String, responseCode: scala.Double): FileUploadResult = {
    val __obj = js.Dynamic.literal(bytesSent = bytesSent, headers = headers, response = response, responseCode = responseCode)
  
    __obj.asInstanceOf[FileUploadResult]
  }
}

