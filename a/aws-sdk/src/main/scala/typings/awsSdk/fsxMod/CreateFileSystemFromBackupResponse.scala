package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFileSystemFromBackupResponse extends StObject {
  
  /**
    * A description of the file system.
    */
  var FileSystem: js.UndefOr[typings.awsSdk.fsxMod.FileSystem] = js.undefined
}
object CreateFileSystemFromBackupResponse {
  
  @scala.inline
  def apply(): CreateFileSystemFromBackupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFileSystemFromBackupResponse]
  }
  
  @scala.inline
  implicit class CreateFileSystemFromBackupResponseMutableBuilder[Self <: CreateFileSystemFromBackupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSystem(value: FileSystem): Self = StObject.set(x, "FileSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemUndefined: Self = StObject.set(x, "FileSystem", js.undefined)
  }
}
