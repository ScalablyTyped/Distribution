package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectorRequest extends StObject {
  
  /**
    * The unique identifier for the connector.
    */
  var ConnectorId: typings.awsSdk.clientsTransferMod.ConnectorId
}
object DescribeConnectorRequest {
  
  inline def apply(ConnectorId: ConnectorId): DescribeConnectorRequest = {
    val __obj = js.Dynamic.literal(ConnectorId = ConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConnectorRequest]
  }
  
  extension [Self <: DescribeConnectorRequest](x: Self) {
    
    inline def setConnectorId(value: ConnectorId): Self = StObject.set(x, "ConnectorId", value.asInstanceOf[js.Any])
  }
}
