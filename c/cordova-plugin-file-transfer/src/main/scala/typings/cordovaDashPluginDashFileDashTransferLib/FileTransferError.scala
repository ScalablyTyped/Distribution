package typings
package cordovaDashPluginDashFileDashTransferLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A FileTransferError object is passed to an error callback when an error occurs. */

trait FileTransferError extends js.Object {
  /* Response body. This attribute is only available when a response is received from the HTTP connection. */
  var body: java.lang.String
  /**
       * One of the predefined error codes listed below.
       *     FileTransferError.FILE_NOT_FOUND_ERR
       *     FileTransferError.INVALID_URL_ERR
       *     FileTransferError.CONNECTION_ERR
       *     FileTransferError.ABORT_ERR
       *     FileTransferError.NOT_MODIFIED_ERR
       */
  var code: scala.Double
  /* Exception that is thrown by native code */
  var exception: js.Any
  /** HTTP status code. This attribute is only available when a response code is received from the HTTP connection. */
  var http_status: scala.Double
  /** URL to the source. */
  var source: java.lang.String
  /** URL to the target. */
  var target: java.lang.String
}

@JSGlobal("FileTransferError")
@js.native
object FileTransferError
  extends /** Constructor for FileTransferError object */
org.scalablytyped.runtime.Instantiable6[
      /* code */ js.UndefOr[/* code */ scala.Double], 
      /* source */ js.UndefOr[/* source */ java.lang.String], 
      /* target */ js.UndefOr[/* target */ java.lang.String], 
      /* status */ js.UndefOr[/* status */ scala.Double], 
      /* body */ js.UndefOr[/* body */ js.Any], 
      /* exception */ js.UndefOr[/* exception */ js.Any], 
      FileTransferError
    ] {
  var ABORT_ERR: scala.Double = js.native
  var CONNECTION_ERR: scala.Double = js.native
  var FILE_NOT_FOUND_ERR: scala.Double = js.native
  var INVALID_URL_ERR: scala.Double = js.native
  var NOT_MODIFIED_ERR: scala.Double = js.native
}

