package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fileSystemProvider")
@js.native
object ^ extends js.Object {
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
}

