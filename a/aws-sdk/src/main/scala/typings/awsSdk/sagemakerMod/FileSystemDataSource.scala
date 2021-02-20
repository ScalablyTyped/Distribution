package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemDataSource extends StObject {
  
  /**
    * The full path to the directory to associate with the channel.
    */
  var DirectoryPath: typings.awsSdk.sagemakerMod.DirectoryPath = js.native
  
  /**
    * The access mode of the mount of the directory associated with the channel. A directory can be mounted either in ro (read-only) or rw (read-write) mode.
    */
  var FileSystemAccessMode: typings.awsSdk.sagemakerMod.FileSystemAccessMode = js.native
  
  /**
    * The file system id.
    */
  var FileSystemId: typings.awsSdk.sagemakerMod.FileSystemId = js.native
  
  /**
    * The file system type. 
    */
  var FileSystemType: typings.awsSdk.sagemakerMod.FileSystemType = js.native
}
object FileSystemDataSource {
  
  @scala.inline
  def apply(
    DirectoryPath: DirectoryPath,
    FileSystemAccessMode: FileSystemAccessMode,
    FileSystemId: FileSystemId,
    FileSystemType: FileSystemType
  ): FileSystemDataSource = {
    val __obj = js.Dynamic.literal(DirectoryPath = DirectoryPath.asInstanceOf[js.Any], FileSystemAccessMode = FileSystemAccessMode.asInstanceOf[js.Any], FileSystemId = FileSystemId.asInstanceOf[js.Any], FileSystemType = FileSystemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemDataSource]
  }
  
  @scala.inline
  implicit class FileSystemDataSourceMutableBuilder[Self <: FileSystemDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryPath(value: DirectoryPath): Self = StObject.set(x, "DirectoryPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemAccessMode(value: FileSystemAccessMode): Self = StObject.set(x, "FileSystemAccessMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemType(value: FileSystemType): Self = StObject.set(x, "FileSystemType", value.asInstanceOf[js.Any])
  }
}
