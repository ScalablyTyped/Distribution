package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateConnectorRequest extends js.Object {
  
  /**
    * The ID of the connector.
    */
  var connectorId: ConnectorId = js.native
}
object DisassociateConnectorRequest {
  
  @scala.inline
  def apply(connectorId: ConnectorId): DisassociateConnectorRequest = {
    val __obj = js.Dynamic.literal(connectorId = connectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateConnectorRequest]
  }
  
  @scala.inline
  implicit class DisassociateConnectorRequestOps[Self <: DisassociateConnectorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnectorId(value: ConnectorId): Self = this.set("connectorId", value.asInstanceOf[js.Any])
  }
}
