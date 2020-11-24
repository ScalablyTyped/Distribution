package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
    
    @scala.inline
    def setLustreConfiguration(value: UpdateFileSystemLustreConfiguration): Self = this.set("LustreConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLustreConfiguration: Self = this.set("LustreConfiguration", js.undefined)
    
    @scala.inline
    def setStorageCapacity(value: StorageCapacity): Self = this.set("StorageCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageCapacity: Self = this.set("StorageCapacity", js.undefined)
    
    @scala.inline
    def setWindowsConfiguration(value: UpdateFileSystemWindowsConfiguration): Self = this.set("WindowsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsConfiguration: Self = this.set("WindowsConfiguration", js.undefined)
  }
}
