package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileSystemResponse extends js.Object {
  /**
    * The ID of the file system being deleted.
    */
  var FileSystemId: js.UndefOr[typings.awsSdk.fsxMod.FileSystemId] = js.native
  /**
    * The file system lifecycle for the deletion request. Should be DELETING.
    */
  var Lifecycle: js.UndefOr[FileSystemLifecycle] = js.native
  var WindowsResponse: js.UndefOr[DeleteFileSystemWindowsResponse] = js.native
}

object DeleteFileSystemResponse {
  @scala.inline
  def apply(
    FileSystemId: FileSystemId = null,
    Lifecycle: FileSystemLifecycle = null,
    WindowsResponse: DeleteFileSystemWindowsResponse = null
  ): DeleteFileSystemResponse = {
    val __obj = js.Dynamic.literal()
    if (FileSystemId != null) __obj.updateDynamic("FileSystemId")(FileSystemId.asInstanceOf[js.Any])
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle.asInstanceOf[js.Any])
    if (WindowsResponse != null) __obj.updateDynamic("WindowsResponse")(WindowsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileSystemResponse]
  }
}

