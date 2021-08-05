package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveRegionRequest extends StObject {
  
  /**
    * The identifier of the directory for which you want to remove Region replication.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
}
object RemoveRegionRequest {
  
  inline def apply(DirectoryId: DirectoryId): RemoveRegionRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveRegionRequest]
  }
  
  extension [Self <: RemoveRegionRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
  }
}
