package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NeighborConnectionDetail extends js.Object {
  
  /**
    * The number of open network connections with the neighboring server.
    */
  var connectionsCount: Long = js.native
  
  /**
    * The destination network port for the connection.
    */
  var destinationPort: js.UndefOr[BoxedInteger] = js.native
  
  /**
    * The ID of the server that accepted the network connection.
    */
  var destinationServerId: ConfigurationId = js.native
  
  /**
    * The ID of the server that opened the network connection.
    */
  var sourceServerId: ConfigurationId = js.native
  
  /**
    * The network protocol used for the connection.
    */
  var transportProtocol: js.UndefOr[String] = js.native
}
object NeighborConnectionDetail {
  
  @scala.inline
  def apply(connectionsCount: Long, destinationServerId: ConfigurationId, sourceServerId: ConfigurationId): NeighborConnectionDetail = {
    val __obj = js.Dynamic.literal(connectionsCount = connectionsCount.asInstanceOf[js.Any], destinationServerId = destinationServerId.asInstanceOf[js.Any], sourceServerId = sourceServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeighborConnectionDetail]
  }
  
  @scala.inline
  implicit class NeighborConnectionDetailOps[Self <: NeighborConnectionDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnectionsCount(value: Long): Self = this.set("connectionsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationServerId(value: ConfigurationId): Self = this.set("destinationServerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceServerId(value: ConfigurationId): Self = this.set("sourceServerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPort(value: BoxedInteger): Self = this.set("destinationPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationPort: Self = this.set("destinationPort", js.undefined)
    
    @scala.inline
    def setTransportProtocol(value: String): Self = this.set("transportProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransportProtocol: Self = this.set("transportProtocol", js.undefined)
  }
}
