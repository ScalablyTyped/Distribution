package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectorResponse extends StObject {
  
  /**
    * The unique identifier for the connector, returned after the API call succeeds.
    */
  var ConnectorId: typings.awsSdk.clientsTransferMod.ConnectorId
}
object CreateConnectorResponse {
  
  inline def apply(ConnectorId: ConnectorId): CreateConnectorResponse = {
    val __obj = js.Dynamic.literal(ConnectorId = ConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateConnectorResponse] (val x: Self) extends AnyVal {
    
    inline def setConnectorId(value: ConnectorId): Self = StObject.set(x, "ConnectorId", value.asInstanceOf[js.Any])
  }
}
