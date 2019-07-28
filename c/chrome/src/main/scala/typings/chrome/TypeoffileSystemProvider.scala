package typings.chrome

import typings.chrome.chromeNs.fileSystemProviderNs.DirectoryPathRecursiveRequestedEvent
import typings.chrome.chromeNs.fileSystemProviderNs.DirectoryPathRequestedEvent
import typings.chrome.chromeNs.fileSystemProviderNs.EntryPathRecursiveRequestedEvent
import typings.chrome.chromeNs.fileSystemProviderNs.FilePathLengthRequestedEvent
import typings.chrome.chromeNs.fileSystemProviderNs.FilePathRequestedEvent
import typings.chrome.chromeNs.fileSystemProviderNs.FileSystemInfo
import typings.chrome.chromeNs.fileSystemProviderNs.MetadataRequestedEvent
import typings.chrome.chromeNs.fileSystemProviderNs.MountOptions
import typings.chrome.chromeNs.fileSystemProviderNs.NotificationOptions
import typings.chrome.chromeNs.fileSystemProviderNs.OpenFileRequestedEvent
import typings.chrome.chromeNs.fileSystemProviderNs.OpenedFileIoRequestedEvent
import typings.chrome.chromeNs.fileSystemProviderNs.OpenedFileOffsetRequestedEvent
import typings.chrome.chromeNs.fileSystemProviderNs.OpenedFileRequestedEvent
import typings.chrome.chromeNs.fileSystemProviderNs.OperationRequestedEvent
import typings.chrome.chromeNs.fileSystemProviderNs.OptionlessRequestedEvent
import typings.chrome.chromeNs.fileSystemProviderNs.RequestedEvent
import typings.chrome.chromeNs.fileSystemProviderNs.SourceTargetPathRequestedEvent
import typings.chrome.chromeNs.fileSystemProviderNs.UnmountOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeoffileSystemProvider extends js.Object {
  var onAbortRequested: OperationRequestedEvent = js.native
  var onAddWatcherRequested: EntryPathRecursiveRequestedEvent = js.native
  var onCloseFileRequested: OpenedFileRequestedEvent = js.native
  var onConfigureRequested: RequestedEvent = js.native
  var onCopyEntryRequested: SourceTargetPathRequestedEvent = js.native
  var onCreateDirectoryRequested: DirectoryPathRecursiveRequestedEvent = js.native
  var onCreateFileRequested: FilePathRequestedEvent = js.native
  var onDeleteEntryRequested: EntryPathRecursiveRequestedEvent = js.native
  var onGetMetadataRequested: MetadataRequestedEvent = js.native
  var onMountRequested: OptionlessRequestedEvent = js.native
  var onMoveEntryRequested: SourceTargetPathRequestedEvent = js.native
  var onOpenFileRequested: OpenFileRequestedEvent = js.native
  var onReadDirectoryRequested: DirectoryPathRequestedEvent = js.native
  var onReadFileRequested: OpenedFileOffsetRequestedEvent = js.native
  var onRemoveWatcherRequested: EntryPathRecursiveRequestedEvent = js.native
  var onTruncateRequested: FilePathLengthRequestedEvent = js.native
  var onUnmountRequested: RequestedEvent = js.native
  var onWriteFileRequested: OpenedFileIoRequestedEvent = js.native
  def get(fileSystemId: String, callback: js.Function1[/* fileSystem */ FileSystemInfo, Unit]): Unit = js.native
  def getAll(callback: js.Function1[/* fileSystems */ js.Array[FileSystemInfo], Unit]): Unit = js.native
  def mount(options: MountOptions): Unit = js.native
  def mount(options: MountOptions, callback: js.Function0[Unit]): Unit = js.native
  def notify(options: NotificationOptions, callback: js.Function0[Unit]): Unit = js.native
  def unmount(options: UnmountOptions): Unit = js.native
  def unmount(options: UnmountOptions, callback: js.Function0[Unit]): Unit = js.native
}

