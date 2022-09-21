package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemEndpoints extends StObject {
  
  /**
    * An endpoint for managing your file system by setting up NetApp SnapMirror with other ONTAP systems.
    */
  var Intercluster: js.UndefOr[FileSystemEndpoint] = js.undefined
  
  /**
    * An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API.
    */
  var Management: js.UndefOr[FileSystemEndpoint] = js.undefined
}
object FileSystemEndpoints {
  
  inline def apply(): FileSystemEndpoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemEndpoints]
  }
  
  extension [Self <: FileSystemEndpoints](x: Self) {
    
    inline def setIntercluster(value: FileSystemEndpoint): Self = StObject.set(x, "Intercluster", value.asInstanceOf[js.Any])
    
    inline def setInterclusterUndefined: Self = StObject.set(x, "Intercluster", js.undefined)
    
    inline def setManagement(value: FileSystemEndpoint): Self = StObject.set(x, "Management", value.asInstanceOf[js.Any])
    
    inline def setManagementUndefined: Self = StObject.set(x, "Management", js.undefined)
  }
}
