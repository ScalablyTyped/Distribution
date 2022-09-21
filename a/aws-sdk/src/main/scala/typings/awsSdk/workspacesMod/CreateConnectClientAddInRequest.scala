package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectClientAddInRequest extends StObject {
  
  /**
    * The name of the client add-in.
    */
  var Name: AddInName
  
  /**
    * The directory identifier for which to configure the client add-in.
    */
  var ResourceId: DirectoryId
  
  /**
    * The endpoint URL of the Amazon Connect client add-in.
    */
  var URL: AddInUrl
}
object CreateConnectClientAddInRequest {
  
  inline def apply(Name: AddInName, ResourceId: DirectoryId, URL: AddInUrl): CreateConnectClientAddInRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectClientAddInRequest]
  }
  
  extension [Self <: CreateConnectClientAddInRequest](x: Self) {
    
    inline def setName(value: AddInName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: DirectoryId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setURL(value: AddInUrl): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
