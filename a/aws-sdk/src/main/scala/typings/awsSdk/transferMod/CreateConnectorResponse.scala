package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectorResponse extends StObject {
  
  /**
    * The unique identifier for the connector, returned after the API call succeeds.
    */
  var ConnectorId: typings.awsSdk.transferMod.ConnectorId
}
object CreateConnectorResponse {
  
  inline def apply(ConnectorId: ConnectorId): CreateConnectorResponse = {
    val __obj = js.Dynamic.literal(ConnectorId = ConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectorResponse]
  }
  
  extension [Self <: CreateConnectorResponse](x: Self) {
    
    inline def setConnectorId(value: ConnectorId): Self = StObject.set(x, "ConnectorId", value.asInstanceOf[js.Any])
  }
}
