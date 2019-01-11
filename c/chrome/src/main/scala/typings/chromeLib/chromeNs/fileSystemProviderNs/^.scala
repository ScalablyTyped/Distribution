package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fileSystemProvider")
@js.native
object ^ extends js.Object {
  var onAbortRequested: chromeLib.chromeNs.fileSystemProviderNs.OperationRequestedEvent = js.native
  var onAddWatcherRequested: chromeLib.chromeNs.fileSystemProviderNs.EntryPathRecursiveRequestedEvent = js.native
  var onCloseFileRequested: chromeLib.chromeNs.fileSystemProviderNs.OpenedFileRequestedEvent = js.native
  var onConfigureRequested: chromeLib.chromeNs.fileSystemProviderNs.RequestedEvent = js.native
  var onCopyEntryRequested: chromeLib.chromeNs.fileSystemProviderNs.SourceTargetPathRequestedEvent = js.native
  var onCreateDirectoryRequested: chromeLib.chromeNs.fileSystemProviderNs.DirectoryPathRecursiveRequestedEvent = js.native
  var onCreateFileRequested: chromeLib.chromeNs.fileSystemProviderNs.FilePathRequestedEvent = js.native
  var onDeleteEntryRequested: chromeLib.chromeNs.fileSystemProviderNs.EntryPathRecursiveRequestedEvent = js.native
  var onGetMetadataRequested: chromeLib.chromeNs.fileSystemProviderNs.MetadataRequestedEvent = js.native
  var onMountRequested: chromeLib.chromeNs.fileSystemProviderNs.OptionlessRequestedEvent = js.native
  var onMoveEntryRequested: chromeLib.chromeNs.fileSystemProviderNs.SourceTargetPathRequestedEvent = js.native
  var onOpenFileRequested: chromeLib.chromeNs.fileSystemProviderNs.OpenFileRequestedEvent = js.native
  var onReadDirectoryRequested: chromeLib.chromeNs.fileSystemProviderNs.DirectoryPathRequestedEvent = js.native
  var onReadFileRequested: chromeLib.chromeNs.fileSystemProviderNs.OpenedFileOffsetRequestedEvent = js.native
  var onRemoveWatcherRequested: chromeLib.chromeNs.fileSystemProviderNs.EntryPathRecursiveRequestedEvent = js.native
  var onTruncateRequested: chromeLib.chromeNs.fileSystemProviderNs.FilePathLengthRequestedEvent = js.native
  var onUnmountRequested: chromeLib.chromeNs.fileSystemProviderNs.RequestedEvent = js.native
  var onWriteFileRequested: chromeLib.chromeNs.fileSystemProviderNs.OpenedFileIoRequestedEvent = js.native
  def get(
    fileSystemId: java.lang.String,
    callback: js.Function1[
      /* fileSystem */ chromeLib.chromeNs.fileSystemProviderNs.FileSystemInfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getAll(
    callback: js.Function1[
      /* fileSystems */ js.Array[chromeLib.chromeNs.fileSystemProviderNs.FileSystemInfo], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def mount(options: chromeLib.chromeNs.fileSystemProviderNs.MountOptions): scala.Unit = js.native
  def mount(options: chromeLib.chromeNs.fileSystemProviderNs.MountOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def notify(
    options: chromeLib.chromeNs.fileSystemProviderNs.NotificationOptions,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def unmount(options: chromeLib.chromeNs.fileSystemProviderNs.UnmountOptions): scala.Unit = js.native
  def unmount(
    options: chromeLib.chromeNs.fileSystemProviderNs.UnmountOptions,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

