package typings.cordovaDashPluginDashFileDashTransfer

import org.scalablytyped.runtime.Instantiable0
import typings.cordovaDashPluginDashFile.FileEntry
import typings.std.EventTarget
import typings.std.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The FileTransfer object provides a way to upload files using an HTTP multi-part POST request,
  * and to download files as well.
  */
@js.native
trait FileTransfer extends js.Object {
  /**
    * Aborts an in-progress transfer. The onerror callback is passed a FileTransferError object
    * which has an error code of FileTransferError.ABORT_ERR.
    */
  def abort(): Unit = js.native
  /**
    * downloads a file from server.
    * @param source            URL of the server to download the file, as encoded by encodeURI().
    * @param target            Filesystem url representing the file on the device. For backwards compatibility,
    *                               this can also be the full path of the file on the device.
    * @param successCallback   A callback that is passed a FileEntry object. (Function)
    * @param errorCallback     A callback that executes if an error occurs when retrieving the fileEntry.
    *                               Invoked with a FileTransferError object.
    * @param options           Optional parameters.
    * @param trustAllHosts     Optional parameter, defaults to false. If set to true, it accepts all security certificates.
    *                               This is useful since Android rejects self-signed security certificates.
    *                               Not recommended for production use. Supported on Android and iOS.
    */
  def download(
    source: String,
    target: String,
    successCallback: js.Function1[/* fileEntry */ FileEntry, Unit],
    errorCallback: js.Function1[/* error */ FileTransferError, Unit]
  ): Unit = js.native
  def download(
    source: String,
    target: String,
    successCallback: js.Function1[/* fileEntry */ FileEntry, Unit],
    errorCallback: js.Function1[/* error */ FileTransferError, Unit],
    trustAllHosts: Boolean
  ): Unit = js.native
  def download(
    source: String,
    target: String,
    successCallback: js.Function1[/* fileEntry */ FileEntry, Unit],
    errorCallback: js.Function1[/* error */ FileTransferError, Unit],
    trustAllHosts: Boolean,
    options: FileDownloadOptions
  ): Unit = js.native
  /** Called with a ProgressEvent whenever a new chunk of data is transferred.  */
  def onprogress(event: ProgressEvent[EventTarget]): Unit = js.native
  /**
    * Sends a file to a server.
    * @param fileURL           Filesystem URL representing the file on the device. For backwards compatibility,
    *                                this can also be the full path of the file on the device.
    * @param server            URL of the server to receive the file, as encoded by encodeURI().
    * @param successCallback   A callback that is passed a FileUploadResult object.
    * @param errorCallback     A callback that executes if an error occurs retrieving the FileUploadResult.
    *                               Invoked with a FileTransferError object.
    * @param options           Optional parameters.
    * @param trustAllHosts     Optional parameter, defaults to false. If set to true, it accepts all security certificates.
    *                               This is useful since Android rejects self-signed security certificates.
    *                               Not recommended for production use. Supported on Android and iOS.
    */
  def upload(
    fileURL: String,
    server: String,
    successCallback: js.Function1[/* result */ FileUploadResult, Unit],
    errorCallback: js.Function1[/* error */ FileTransferError, Unit]
  ): Unit = js.native
  def upload(
    fileURL: String,
    server: String,
    successCallback: js.Function1[/* result */ FileUploadResult, Unit],
    errorCallback: js.Function1[/* error */ FileTransferError, Unit],
    options: FileUploadOptions
  ): Unit = js.native
  def upload(
    fileURL: String,
    server: String,
    successCallback: js.Function1[/* result */ FileUploadResult, Unit],
    errorCallback: js.Function1[/* error */ FileTransferError, Unit],
    options: FileUploadOptions,
    trustAllHosts: Boolean
  ): Unit = js.native
}

@JSGlobal("FileTransfer")
@js.native
class FileTransferCls () extends FileTransfer

@JSGlobal("FileTransfer")
@js.native
object FileTransfer extends Instantiable0[FileTransfer]

