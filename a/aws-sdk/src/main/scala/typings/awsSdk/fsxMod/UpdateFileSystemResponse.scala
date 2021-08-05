package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFileSystemResponse extends StObject {
  
  /**
    * A description of the file system that was updated.
    */
  var FileSystem: js.UndefOr[typings.awsSdk.fsxMod.FileSystem] = js.undefined
}
object UpdateFileSystemResponse {
  
  inline def apply(): UpdateFileSystemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFileSystemResponse]
  }
  
  extension [Self <: UpdateFileSystemResponse](x: Self) {
    
    inline def setFileSystem(value: FileSystem): Self = StObject.set(x, "FileSystem", value.asInstanceOf[js.Any])
    
    inline def setFileSystemUndefined: Self = StObject.set(x, "FileSystem", js.undefined)
  }
}
