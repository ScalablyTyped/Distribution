package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectClientAddIn extends StObject {
  
  /**
    * The client add-in identifier.
    */
  var AddInId: js.UndefOr[AmazonUuid] = js.undefined
  
  /**
    * The name of the client add in.
    */
  var Name: js.UndefOr[AddInName] = js.undefined
  
  /**
    * The directory identifier for which the client add-in is configured.
    */
  var ResourceId: js.UndefOr[DirectoryId] = js.undefined
  
  /**
    * The endpoint URL of the client add-in.
    */
  var URL: js.UndefOr[AddInUrl] = js.undefined
}
object ConnectClientAddIn {
  
  inline def apply(): ConnectClientAddIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectClientAddIn]
  }
  
  extension [Self <: ConnectClientAddIn](x: Self) {
    
    inline def setAddInId(value: AmazonUuid): Self = StObject.set(x, "AddInId", value.asInstanceOf[js.Any])
    
    inline def setAddInIdUndefined: Self = StObject.set(x, "AddInId", js.undefined)
    
    inline def setName(value: AddInName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResourceId(value: DirectoryId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setURL(value: AddInUrl): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    
    inline def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
  }
}
