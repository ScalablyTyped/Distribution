package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConnectClientAddInRequest extends StObject {
  
  /**
    * The identifier of the client add-in to delete.
    */
  var AddInId: AmazonUuid
  
  /**
    * The directory identifier for which the client add-in is configured.
    */
  var ResourceId: DirectoryId
}
object DeleteConnectClientAddInRequest {
  
  inline def apply(AddInId: AmazonUuid, ResourceId: DirectoryId): DeleteConnectClientAddInRequest = {
    val __obj = js.Dynamic.literal(AddInId = AddInId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConnectClientAddInRequest]
  }
  
  extension [Self <: DeleteConnectClientAddInRequest](x: Self) {
    
    inline def setAddInId(value: AmazonUuid): Self = StObject.set(x, "AddInId", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: DirectoryId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
