package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFileSystemResponse extends StObject {
  
  /**
    * The configuration of the file system that was created.
    */
  var FileSystem: js.UndefOr[typings.awsSdk.fsxMod.FileSystem] = js.native
}
object CreateFileSystemResponse {
  
  @scala.inline
  def apply(): CreateFileSystemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFileSystemResponse]
  }
  
  @scala.inline
  implicit class CreateFileSystemResponseMutableBuilder[Self <: CreateFileSystemResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSystem(value: FileSystem): Self = StObject.set(x, "FileSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemUndefined: Self = StObject.set(x, "FileSystem", js.undefined)
  }
}
