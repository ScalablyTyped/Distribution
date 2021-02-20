package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NFSFileShareDefaults extends StObject {
  
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
  implicit class NFSFileShareDefaultsMutableBuilder[Self <: NFSFileShareDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryMode(value: PermissionMode): Self = StObject.set(x, "DirectoryMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryModeUndefined: Self = StObject.set(x, "DirectoryMode", js.undefined)
    
    @scala.inline
    def setFileMode(value: PermissionMode): Self = StObject.set(x, "FileMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileModeUndefined: Self = StObject.set(x, "FileMode", js.undefined)
    
    @scala.inline
    def setGroupId(value: PermissionId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    @scala.inline
    def setOwnerId(value: PermissionId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
  }
}
