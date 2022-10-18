package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConnectorRequest extends StObject {
  
  /**
    * The unique identifier for the connector.
    */
  var ConnectorId: typings.awsSdk.clientsTransferMod.ConnectorId
}
object DeleteConnectorRequest {
  
  inline def apply(ConnectorId: ConnectorId): DeleteConnectorRequest = {
    val __obj = js.Dynamic.literal(ConnectorId = ConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConnectorRequest]
  }
  
  extension [Self <: DeleteConnectorRequest](x: Self) {
    
    inline def setConnectorId(value: ConnectorId): Self = StObject.set(x, "ConnectorId", value.asInstanceOf[js.Any])
  }
}
