package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileSystemRequest extends StObject {
  
  /**
    * The ID of the file system you want to delete.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId
}
object DeleteFileSystemRequest {
  
  inline def apply(FileSystemId: FileSystemId): DeleteFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileSystemRequest]
  }
  
  extension [Self <: DeleteFileSystemRequest](x: Self) {
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
  }
}
