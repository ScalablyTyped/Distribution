package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectClientAddInRequest extends StObject {
  
  /**
    * The identifier of the client add-in to update.
    */
  var AddInId: AmazonUuid
  
  /**
    * The name of the client add-in.
    */
  var Name: js.UndefOr[AddInName] = js.undefined
  
  /**
    * The directory identifier for which the client add-in is configured.
    */
  var ResourceId: DirectoryId
  
  /**
    * The endpoint URL of the Amazon Connect client add-in.
    */
  var URL: js.UndefOr[AddInUrl] = js.undefined
}
object UpdateConnectClientAddInRequest {
  
  inline def apply(AddInId: AmazonUuid, ResourceId: DirectoryId): UpdateConnectClientAddInRequest = {
    val __obj = js.Dynamic.literal(AddInId = AddInId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectClientAddInRequest]
  }
  
  extension [Self <: UpdateConnectClientAddInRequest](x: Self) {
    
    inline def setAddInId(value: AmazonUuid): Self = StObject.set(x, "AddInId", value.asInstanceOf[js.Any])
    
    inline def setName(value: AddInName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResourceId(value: DirectoryId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setURL(value: AddInUrl): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    
    inline def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
  }
}
