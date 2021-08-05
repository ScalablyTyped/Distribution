package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog in which to create the connection. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * A ConnectionInput object defining the connection to create.
    */
  var ConnectionInput: typings.awsSdk.glueMod.ConnectionInput
}
object CreateConnectionRequest {
  
  inline def apply(ConnectionInput: ConnectionInput): CreateConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionInput = ConnectionInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionRequest]
  }
  
  extension [Self <: CreateConnectionRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setConnectionInput(value: ConnectionInput): Self = StObject.set(x, "ConnectionInput", value.asInstanceOf[js.Any])
  }
}
