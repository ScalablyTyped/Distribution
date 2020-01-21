package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUploadBufferOutput extends js.Object {
  /**
    * An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is specified as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as working storage, then the DiskIds array is empty.
    */
  var DiskIds: js.UndefOr[typings.awsSdk.storagegatewayMod.DiskIds] = js.native
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * The total number of bytes allocated in the gateway's as upload buffer.
    */
  var UploadBufferAllocatedInBytes: js.UndefOr[long] = js.native
  /**
    * The total number of bytes being used in the gateway's upload buffer.
    */
  var UploadBufferUsedInBytes: js.UndefOr[long] = js.native
}

object DescribeUploadBufferOutput {
  @scala.inline
  def apply(
    DiskIds: DiskIds = null,
    GatewayARN: GatewayARN = null,
    UploadBufferAllocatedInBytes: Int | Double = null,
    UploadBufferUsedInBytes: Int | Double = null
  ): DescribeUploadBufferOutput = {
    val __obj = js.Dynamic.literal()
    if (DiskIds != null) __obj.updateDynamic("DiskIds")(DiskIds.asInstanceOf[js.Any])
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    if (UploadBufferAllocatedInBytes != null) __obj.updateDynamic("UploadBufferAllocatedInBytes")(UploadBufferAllocatedInBytes.asInstanceOf[js.Any])
    if (UploadBufferUsedInBytes != null) __obj.updateDynamic("UploadBufferUsedInBytes")(UploadBufferUsedInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUploadBufferOutput]
  }
}

