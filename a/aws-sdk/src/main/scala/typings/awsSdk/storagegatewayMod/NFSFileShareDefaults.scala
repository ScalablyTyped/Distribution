package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NFSFileShareDefaults extends js.Object {
  
  /**
    * The Unix directory mode in the form "nnnn". For example, 0666 represents the default access mode for all directories inside the file share. The default value is 0777.
    */
  var DirectoryMode: js.UndefOr[PermissionMode] = js.native
  
  /**
    * The Unix file mode in the form "nnnn". For example, 0666 represents the default file mode inside the file share. The default value is 0666.
    */
  var FileMode: js.UndefOr[PermissionMode] = js.native
  
  /**
    * The default group ID for the file share (unless the files have another group ID specified). The default value is nfsnobody.
    */
  var GroupId: js.UndefOr[PermissionId] = js.native
  
  /**
    * The default owner ID for files in the file share (unless the files have another owner ID specified). The default value is nfsnobody.
    */
  var OwnerId: js.UndefOr[PermissionId] = js.native
}
object NFSFileShareDefaults {
  
  @scala.inline
  def apply(): NFSFileShareDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NFSFileShareDefaults]
  }
  
  @scala.inline
  implicit class NFSFileShareDefaultsOps[Self <: NFSFileShareDefaults] (val x: Self) extends AnyVal {
    
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
    def setDirectoryMode(value: PermissionMode): Self = this.set("DirectoryMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryMode: Self = this.set("DirectoryMode", js.undefined)
    
    @scala.inline
    def setFileMode(value: PermissionMode): Self = this.set("FileMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileMode: Self = this.set("FileMode", js.undefined)
    
    @scala.inline
    def setGroupId(value: PermissionId): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("GroupId", js.undefined)
    
    @scala.inline
    def setOwnerId(value: PermissionId): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
  }
}
