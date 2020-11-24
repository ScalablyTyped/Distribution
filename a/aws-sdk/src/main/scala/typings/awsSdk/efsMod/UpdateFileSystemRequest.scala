package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(FileSystemId: FileSystemId): UpdateFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFileSystemRequest]
  }
  
  @scala.inline
  implicit class UpdateFileSystemRequestOps[Self <: UpdateFileSystemRequest] (val x: Self) extends AnyVal {
    
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
    def setFileSystemId(value: FileSystemId): Self = this.set("FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedThroughputInMibps(value: ProvisionedThroughputInMibps): Self = this.set("ProvisionedThroughputInMibps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedThroughputInMibps: Self = this.set("ProvisionedThroughputInMibps", js.undefined)
    
    @scala.inline
    def setThroughputMode(value: ThroughputMode): Self = this.set("ThroughputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThroughputMode: Self = this.set("ThroughputMode", js.undefined)
  }
}
