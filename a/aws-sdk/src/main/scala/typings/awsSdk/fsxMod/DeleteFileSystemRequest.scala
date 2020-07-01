package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileSystemRequest extends js.Object {
  /**
    * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent deletion. This is automatically filled on your behalf when using the AWS CLI or SDK.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.native
  /**
    * The ID of the file system you want to delete.
    */
  var FileSystemId: typings.awsSdk.fsxMod.FileSystemId = js.native
  var LustreConfiguration: js.UndefOr[DeleteFileSystemLustreConfiguration] = js.native
  var WindowsConfiguration: js.UndefOr[DeleteFileSystemWindowsConfiguration] = js.native
}

object DeleteFileSystemRequest {
  @scala.inline
  def apply(
    FileSystemId: FileSystemId,
    ClientRequestToken: ClientRequestToken = null,
    LustreConfiguration: DeleteFileSystemLustreConfiguration = null,
    WindowsConfiguration: DeleteFileSystemWindowsConfiguration = null
  ): DeleteFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (LustreConfiguration != null) __obj.updateDynamic("LustreConfiguration")(LustreConfiguration.asInstanceOf[js.Any])
    if (WindowsConfiguration != null) __obj.updateDynamic("WindowsConfiguration")(WindowsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileSystemRequest]
  }
}

