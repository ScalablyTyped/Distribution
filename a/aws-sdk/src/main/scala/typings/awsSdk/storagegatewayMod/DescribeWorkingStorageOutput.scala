package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorkingStorageOutput extends js.Object {
  
  /**
    * An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is specified as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as working storage, then the DiskIds array is empty.
    */
  var DiskIds: js.UndefOr[typings.awsSdk.storagegatewayMod.DiskIds] = js.native
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
  
  /**
    * The total working storage in bytes allocated for the gateway. If no working storage is configured for the gateway, this field returns 0.
    */
  var WorkingStorageAllocatedInBytes: js.UndefOr[long] = js.native
  
  /**
    * The total working storage in bytes in use by the gateway. If no working storage is configured for the gateway, this field returns 0.
    */
  var WorkingStorageUsedInBytes: js.UndefOr[long] = js.native
}
object DescribeWorkingStorageOutput {
  
  @scala.inline
  def apply(): DescribeWorkingStorageOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkingStorageOutput]
  }
  
  @scala.inline
  implicit class DescribeWorkingStorageOutputOps[Self <: DescribeWorkingStorageOutput] (val x: Self) extends AnyVal {
    
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
    def setWorkingStorageAllocatedInBytes(value: long): Self = this.set("WorkingStorageAllocatedInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkingStorageAllocatedInBytes: Self = this.set("WorkingStorageAllocatedInBytes", js.undefined)
    
    @scala.inline
    def setWorkingStorageUsedInBytes(value: long): Self = this.set("WorkingStorageUsedInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkingStorageUsedInBytes: Self = this.set("WorkingStorageUsedInBytes", js.undefined)
  }
}
