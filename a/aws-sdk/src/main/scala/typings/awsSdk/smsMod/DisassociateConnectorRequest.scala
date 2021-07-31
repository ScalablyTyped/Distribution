package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateConnectorRequest extends StObject {
  
  /**
    * The ID of the connector.
    */
  var connectorId: ConnectorId
}
object DisassociateConnectorRequest {
  
  @scala.inline
  def apply(connectorId: ConnectorId): DisassociateConnectorRequest = {
    val __obj = js.Dynamic.literal(connectorId = connectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateConnectorRequest]
  }
  
  @scala.inline
  implicit class DisassociateConnectorRequestMutableBuilder[Self <: DisassociateConnectorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorId(value: ConnectorId): Self = StObject.set(x, "connectorId", value.asInstanceOf[js.Any])
  }
}
