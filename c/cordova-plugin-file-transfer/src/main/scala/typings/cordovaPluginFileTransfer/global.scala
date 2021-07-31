package typings.cordovaPluginFileTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("FileTransfer")
  @js.native
  class FileTransfer ()
    extends StObject
       with typings.cordovaPluginFileTransfer.FileTransfer
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("FileTransferError")
  @js.native
  class FileTransferError protected ()
    extends StObject
       with typings.cordovaPluginFileTransfer.FileTransferError {
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
    var body: String = js.native
    
    /**
      * One of the predefined error codes listed below.
      *     FileTransferError.FILE_NOT_FOUND_ERR
      *     FileTransferError.INVALID_URL_ERR
      *     FileTransferError.CONNECTION_ERR
      *     FileTransferError.ABORT_ERR
      *     FileTransferError.NOT_MODIFIED_ERR
      */
    /* CompleteClass */
    var code: Double = js.native
    
    /* Exception that is thrown by native code */
    /* CompleteClass */
    var exception: js.Any = js.native
    
    /** HTTP status code. This attribute is only available when a response code is received from the HTTP connection. */
    /* CompleteClass */
    var http_status: Double = js.native
    
    /** URL to the source. */
    /* CompleteClass */
    var source: String = js.native
    
    /** URL to the target. */
    /* CompleteClass */
    var target: String = js.native
  }
  object FileTransferError {
    
    @JSGlobal("FileTransferError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("FileTransferError.ABORT_ERR")
    @js.native
    def ABORT_ERR: Double = js.native
    @scala.inline
    def ABORT_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABORT_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileTransferError.CONNECTION_ERR")
    @js.native
    def CONNECTION_ERR: Double = js.native
    @scala.inline
    def CONNECTION_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileTransferError.FILE_NOT_FOUND_ERR")
    @js.native
    def FILE_NOT_FOUND_ERR: Double = js.native
    @scala.inline
    def FILE_NOT_FOUND_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_NOT_FOUND_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileTransferError.INVALID_URL_ERR")
    @js.native
    def INVALID_URL_ERR: Double = js.native
    @scala.inline
    def INVALID_URL_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_URL_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileTransferError.NOT_MODIFIED_ERR")
    @js.native
    def NOT_MODIFIED_ERR: Double = js.native
    @scala.inline
    def NOT_MODIFIED_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_MODIFIED_ERR")(x.asInstanceOf[js.Any])
  }
}
