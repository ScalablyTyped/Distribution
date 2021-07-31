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
  
  @scala.inline
  def apply(DirectoryId: DirectoryId): RemoveRegionRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveRegionRequest]
  }
  
  @scala.inline
  implicit class RemoveRegionRequestMutableBuilder[Self <: RemoveRegionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
  }
}
