package typings.chrome.global.chrome

import typings.chrome.chrome.fileSystemProvider.DirectoryPathRecursiveRequestedEvent
import typings.chrome.chrome.fileSystemProvider.DirectoryPathRequestedEvent
import typings.chrome.chrome.fileSystemProvider.EntryPathRecursiveRequestedEvent
import typings.chrome.chrome.fileSystemProvider.FilePathLengthRequestedEvent
import typings.chrome.chrome.fileSystemProvider.FilePathRequestedEvent
import typings.chrome.chrome.fileSystemProvider.FileSystemInfo
import typings.chrome.chrome.fileSystemProvider.MetadataRequestedEvent
import typings.chrome.chrome.fileSystemProvider.MountOptions
import typings.chrome.chrome.fileSystemProvider.NotificationOptions
import typings.chrome.chrome.fileSystemProvider.OpenFileRequestedEvent
import typings.chrome.chrome.fileSystemProvider.OpenedFileIoRequestedEvent
import typings.chrome.chrome.fileSystemProvider.OpenedFileOffsetRequestedEvent
import typings.chrome.chrome.fileSystemProvider.OpenedFileRequestedEvent
import typings.chrome.chrome.fileSystemProvider.OperationRequestedEvent
import typings.chrome.chrome.fileSystemProvider.OptionlessRequestedEvent
import typings.chrome.chrome.fileSystemProvider.RequestedEvent
import typings.chrome.chrome.fileSystemProvider.SourceTargetPathRequestedEvent
import typings.chrome.chrome.fileSystemProvider.UnmountOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// File System Provider
////////////////////
/**
  * Use the chrome.fileSystemProvider API to create file systems, that can be accessible from the file manager on Chrome OS.
  * Availability: Since Chrome 40.
  * Permissions:  "fileSystemProvider"
  * Important: This API works only on Chrome OS.
  */
@JSGlobal("chrome.fileSystemProvider")
@js.native
object fileSystemProvider extends js.Object {
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

