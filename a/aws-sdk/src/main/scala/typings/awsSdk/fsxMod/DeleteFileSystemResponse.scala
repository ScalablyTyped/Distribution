package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileSystemResponse extends StObject {
  
  /**
    * The ID of the file system being deleted.
    */
  var FileSystemId: js.UndefOr[typings.awsSdk.fsxMod.FileSystemId] = js.undefined
  
  /**
    * The file system lifecycle for the deletion request. Should be DELETING.
    */
  var Lifecycle: js.UndefOr[FileSystemLifecycle] = js.undefined
  
  var LustreResponse: js.UndefOr[DeleteFileSystemLustreResponse] = js.undefined
  
  var WindowsResponse: js.UndefOr[DeleteFileSystemWindowsResponse] = js.undefined
}
object DeleteFileSystemResponse {
  
  @scala.inline
  def apply(): DeleteFileSystemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileSystemResponse]
  }
  
  @scala.inline
  implicit class DeleteFileSystemResponseMutableBuilder[Self <: DeleteFileSystemResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemIdUndefined: Self = StObject.set(x, "FileSystemId", js.undefined)
    
    @scala.inline
    def setLifecycle(value: FileSystemLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    @scala.inline
    def setLustreResponse(value: DeleteFileSystemLustreResponse): Self = StObject.set(x, "LustreResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLustreResponseUndefined: Self = StObject.set(x, "LustreResponse", js.undefined)
    
    @scala.inline
    def setWindowsResponse(value: DeleteFileSystemWindowsResponse): Self = StObject.set(x, "WindowsResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsResponseUndefined: Self = StObject.set(x, "WindowsResponse", js.undefined)
  }
}
