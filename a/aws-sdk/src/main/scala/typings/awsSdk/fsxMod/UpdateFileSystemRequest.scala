package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFileSystemRequest extends js.Object {
  /**
    * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.native
  /**
    * Identifies the file system that you are updating.
    */
  var FileSystemId: typings.awsSdk.fsxMod.FileSystemId = js.native
  var LustreConfiguration: js.UndefOr[UpdateFileSystemLustreConfiguration] = js.native
  /**
    * Use this parameter to increase the storage capacity of an Amazon FSx for Windows File Server file system. Specifies the storage capacity target value, GiB, for the file system you're updating. The storage capacity target value must be at least 10 percent (%) greater than the current storage capacity value. In order to increase storage capacity, the file system needs to have at least 16 MB/s of throughput capacity. You cannot make a storage capacity increase request if there is an existing storage capacity increase request in progress. For more information, see Managing Storage Capacity.
    */
  var StorageCapacity: js.UndefOr[typings.awsSdk.fsxMod.StorageCapacity] = js.native
  /**
    * The configuration updates for an Amazon FSx for Windows File Server file system.
    */
  var WindowsConfiguration: js.UndefOr[UpdateFileSystemWindowsConfiguration] = js.native
}

object UpdateFileSystemRequest {
  @scala.inline
  def apply(
    FileSystemId: FileSystemId,
    ClientRequestToken: ClientRequestToken = null,
    LustreConfiguration: UpdateFileSystemLustreConfiguration = null,
    StorageCapacity: js.UndefOr[StorageCapacity] = js.undefined,
    WindowsConfiguration: UpdateFileSystemWindowsConfiguration = null
  ): UpdateFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (LustreConfiguration != null) __obj.updateDynamic("LustreConfiguration")(LustreConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(StorageCapacity)) __obj.updateDynamic("StorageCapacity")(StorageCapacity.get.asInstanceOf[js.Any])
    if (WindowsConfiguration != null) __obj.updateDynamic("WindowsConfiguration")(WindowsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFileSystemRequest]
  }
}

