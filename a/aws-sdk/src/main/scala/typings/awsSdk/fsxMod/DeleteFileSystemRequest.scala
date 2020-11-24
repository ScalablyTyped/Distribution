package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(FileSystemId: FileSystemId): DeleteFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileSystemRequest]
  }
  
  @scala.inline
  implicit class DeleteFileSystemRequestOps[Self <: DeleteFileSystemRequest] (val x: Self) extends AnyVal {
    
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
    def setLustreConfiguration(value: DeleteFileSystemLustreConfiguration): Self = this.set("LustreConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLustreConfiguration: Self = this.set("LustreConfiguration", js.undefined)
    
    @scala.inline
    def setWindowsConfiguration(value: DeleteFileSystemWindowsConfiguration): Self = this.set("WindowsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsConfiguration: Self = this.set("WindowsConfiguration", js.undefined)
  }
}
