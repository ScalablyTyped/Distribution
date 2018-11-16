package typings
package cordovaDashPluginDashFileDashTransferLib

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
  def abort(): scala.Unit = js.native
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
    source: java.lang.String,
    target: java.lang.String,
    successCallback: js.Function1[/* fileEntry */ cordovaDashPluginDashFileLib.FileEntry, scala.Unit],
    errorCallback: js.Function1[/* error */ FileTransferError, scala.Unit]
  ): scala.Unit = js.native
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
    source: java.lang.String,
    target: java.lang.String,
    successCallback: js.Function1[/* fileEntry */ cordovaDashPluginDashFileLib.FileEntry, scala.Unit],
    errorCallback: js.Function1[/* error */ FileTransferError, scala.Unit],
    trustAllHosts: scala.Boolean
  ): scala.Unit = js.native
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
    source: java.lang.String,
    target: java.lang.String,
    successCallback: js.Function1[/* fileEntry */ cordovaDashPluginDashFileLib.FileEntry, scala.Unit],
    errorCallback: js.Function1[/* error */ FileTransferError, scala.Unit],
    trustAllHosts: scala.Boolean,
    options: FileDownloadOptions
  ): scala.Unit = js.native
  /** Called with a ProgressEvent whenever a new chunk of data is transferred.  */
  def onprogress(event: stdLib.ProgressEvent): scala.Unit = js.native
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
    fileURL: java.lang.String,
    server: java.lang.String,
    successCallback: js.Function1[/* result */ FileUploadResult, scala.Unit],
    errorCallback: js.Function1[/* error */ FileTransferError, scala.Unit]
  ): scala.Unit = js.native
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
    fileURL: java.lang.String,
    server: java.lang.String,
    successCallback: js.Function1[/* result */ FileUploadResult, scala.Unit],
    errorCallback: js.Function1[/* error */ FileTransferError, scala.Unit],
    options: FileUploadOptions
  ): scala.Unit = js.native
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
    fileURL: java.lang.String,
    server: java.lang.String,
    successCallback: js.Function1[/* result */ FileUploadResult, scala.Unit],
    errorCallback: js.Function1[/* error */ FileTransferError, scala.Unit],
    options: FileUploadOptions,
    trustAllHosts: scala.Boolean
  ): scala.Unit = js.native
}

@JSGlobal("FileTransfer")
@js.native
object FileTransfer
  extends ScalablyTyped.runtime.Instantiable0[FileTransfer]

