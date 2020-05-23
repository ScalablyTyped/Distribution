package typings.cordovaPluginFileTransfer

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class FileTransfer ()
    extends typings.cordovaPluginFileTransfer.FileTransfer
  
  @js.native
  class FileTransferError protected ()
    extends typings.cordovaPluginFileTransfer.FileTransferError {
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
  
  @js.native
  object FileTransfer
    extends Instantiable0[typings.cordovaPluginFileTransfer.FileTransfer]
  
  @js.native
  object FileTransferError
    extends /** Constructor for FileTransferError object */
  Instantiable6[
          js.UndefOr[/* code */ Double], 
          js.UndefOr[/* source */ String], 
          js.UndefOr[/* target */ String], 
          js.UndefOr[/* status */ Double], 
          js.UndefOr[/* body */ js.Any], 
          js.UndefOr[/* exception */ js.Any], 
          typings.cordovaPluginFileTransfer.FileTransferError
        ] {
    var ABORT_ERR: Double = js.native
    var CONNECTION_ERR: Double = js.native
    var FILE_NOT_FOUND_ERR: Double = js.native
    var INVALID_URL_ERR: Double = js.native
    var NOT_MODIFIED_ERR: Double = js.native
  }
  
}

