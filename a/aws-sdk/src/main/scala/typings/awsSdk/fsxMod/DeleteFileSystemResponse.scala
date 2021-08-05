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
  
  inline def apply(): DeleteFileSystemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileSystemResponse]
  }
  
  extension [Self <: DeleteFileSystemResponse](x: Self) {
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setFileSystemIdUndefined: Self = StObject.set(x, "FileSystemId", js.undefined)
    
    inline def setLifecycle(value: FileSystemLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setLustreResponse(value: DeleteFileSystemLustreResponse): Self = StObject.set(x, "LustreResponse", value.asInstanceOf[js.Any])
    
    inline def setLustreResponseUndefined: Self = StObject.set(x, "LustreResponse", js.undefined)
    
    inline def setWindowsResponse(value: DeleteFileSystemWindowsResponse): Self = StObject.set(x, "WindowsResponse", value.asInstanceOf[js.Any])
    
    inline def setWindowsResponseUndefined: Self = StObject.set(x, "WindowsResponse", js.undefined)
  }
}
