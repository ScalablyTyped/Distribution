package typings.cordovaPluginFileTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FileTransferError")
@js.native
class FileTransferErrorCls protected () extends FileTransferError {
  /** Constructor for FileTransferError object */
  def this(
    code: js.UndefOr[Double],
    source: js.UndefOr[String],
    target: js.UndefOr[String],
    status: js.UndefOr[Double],
    body: js.UndefOr[js.Any],
    exception: js.UndefOr[js.Any]
  ) = this()
  /* Response body. This attribute is only available when a response is received from the HTTP connection. */
  /* CompleteClass */
  override var body: String = js.native
  /**
    * One of the predefined error codes listed below.
    *     FileTransferError.FILE_NOT_FOUND_ERR
    *     FileTransferError.INVALID_URL_ERR
    *     FileTransferError.CONNECTION_ERR
    *     FileTransferError.ABORT_ERR
    *     FileTransferError.NOT_MODIFIED_ERR
    */
  /* CompleteClass */
  override var code: Double = js.native
  /* Exception that is thrown by native code */
  /* CompleteClass */
  override var exception: js.Any = js.native
  /** HTTP status code. This attribute is only available when a response code is received from the HTTP connection. */
  /* CompleteClass */
  override var http_status: Double = js.native
  /** URL to the source. */
  /* CompleteClass */
  override var source: String = js.native
  /** URL to the target. */
  /* CompleteClass */
  override var target: String = js.native
}

