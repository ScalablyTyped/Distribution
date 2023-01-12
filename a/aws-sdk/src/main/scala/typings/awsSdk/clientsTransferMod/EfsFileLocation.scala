package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EfsFileLocation extends StObject {
  
  /**
    * The identifier of the file system, assigned by Amazon EFS.
    */
  var FileSystemId: js.UndefOr[EfsFileSystemId] = js.undefined
  
  /**
    * The pathname for the folder being used by a workflow.
    */
  var Path: js.UndefOr[EfsPath] = js.undefined
}
object EfsFileLocation {
  
  inline def apply(): EfsFileLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EfsFileLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EfsFileLocation] (val x: Self) extends AnyVal {
    
    inline def setFileSystemId(value: EfsFileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setFileSystemIdUndefined: Self = StObject.set(x, "FileSystemId", js.undefined)
    
    inline def setPath(value: EfsPath): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
  }
}
