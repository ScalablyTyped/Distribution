package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFileSystemResponse extends StObject {
  
  /**
    * A description of the file system that was updated.
    */
  var FileSystem: js.UndefOr[typings.awsSdk.fsxMod.FileSystem] = js.native
}
object UpdateFileSystemResponse {
  
  @scala.inline
  def apply(): UpdateFileSystemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFileSystemResponse]
  }
  
  @scala.inline
  implicit class UpdateFileSystemResponseMutableBuilder[Self <: UpdateFileSystemResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSystem(value: FileSystem): Self = StObject.set(x, "FileSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemUndefined: Self = StObject.set(x, "FileSystem", js.undefined)
  }
}
