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
  def apply(): DescribeUploadBufferOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUploadBufferOutput]
  }
  @scala.inline
  implicit class DescribeUploadBufferOutputOps[Self <: DescribeUploadBufferOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDiskIdsVarargs(value: DiskId*): Self = this.set("DiskIds", js.Array(value :_*))
    @scala.inline
    def setDiskIds(value: DiskIds): Self = this.set("DiskIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskIds: Self = this.set("DiskIds", js.undefined)
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayARN: Self = this.set("GatewayARN", js.undefined)
    @scala.inline
    def setUploadBufferAllocatedInBytes(value: long): Self = this.set("UploadBufferAllocatedInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadBufferAllocatedInBytes: Self = this.set("UploadBufferAllocatedInBytes", js.undefined)
    @scala.inline
    def setUploadBufferUsedInBytes(value: long): Self = this.set("UploadBufferUsedInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadBufferUsedInBytes: Self = this.set("UploadBufferUsedInBytes", js.undefined)
  }
  
}

