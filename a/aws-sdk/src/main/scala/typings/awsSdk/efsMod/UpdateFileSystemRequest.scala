package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFileSystemRequest extends js.Object {
  /**
    * The ID of the file system that you want to update.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId = js.native
  /**
    * (Optional) The amount of throughput, in MiB/s, that you want to provision for your file system. Valid values are 1-1024. Required if ThroughputMode is changed to provisioned on update. If you're not updating the amount of provisioned throughput for your file system, you don't need to provide this value in your request. 
    */
  var ProvisionedThroughputInMibps: js.UndefOr[typings.awsSdk.efsMod.ProvisionedThroughputInMibps] = js.native
  /**
    * (Optional) The throughput mode that you want your file system to use. If you're not updating your throughput mode, you don't need to provide this value in your request. If you are changing the ThroughputMode to provisioned, you must also set a value for ProvisionedThroughputInMibps.
    */
  var ThroughputMode: js.UndefOr[typings.awsSdk.efsMod.ThroughputMode] = js.native
}

object UpdateFileSystemRequest {
  @scala.inline
  def apply(
    FileSystemId: FileSystemId,
    ProvisionedThroughputInMibps: Int | Double = null,
    ThroughputMode: ThroughputMode = null
  ): UpdateFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    if (ProvisionedThroughputInMibps != null) __obj.updateDynamic("ProvisionedThroughputInMibps")(ProvisionedThroughputInMibps.asInstanceOf[js.Any])
    if (ThroughputMode != null) __obj.updateDynamic("ThroughputMode")(ThroughputMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFileSystemRequest]
  }
}

