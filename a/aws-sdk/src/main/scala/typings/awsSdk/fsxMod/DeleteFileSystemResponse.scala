package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  var LustreResponse: js.UndefOr[DeleteFileSystemLustreResponse] = js.native
  
  var WindowsResponse: js.UndefOr[DeleteFileSystemWindowsResponse] = js.native
}
object DeleteFileSystemResponse {
  
  @scala.inline
  def apply(): DeleteFileSystemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileSystemResponse]
  }
  
  @scala.inline
  implicit class DeleteFileSystemResponseOps[Self <: DeleteFileSystemResponse] (val x: Self) extends AnyVal {
    
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
    def deleteFileSystemId: Self = this.set("FileSystemId", js.undefined)
    
    @scala.inline
    def setLifecycle(value: FileSystemLifecycle): Self = this.set("Lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycle: Self = this.set("Lifecycle", js.undefined)
    
    @scala.inline
    def setLustreResponse(value: DeleteFileSystemLustreResponse): Self = this.set("LustreResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLustreResponse: Self = this.set("LustreResponse", js.undefined)
    
    @scala.inline
    def setWindowsResponse(value: DeleteFileSystemWindowsResponse): Self = this.set("WindowsResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsResponse: Self = this.set("WindowsResponse", js.undefined)
  }
}
