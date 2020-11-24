package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeFabricLogPublishingConfiguration extends js.Object {
  
  /**
    * Configuration properties for logging events associated with chaincode execution on a peer node. Chaincode logs contain the results of instantiating, invoking, and querying the chaincode. A peer can run multiple instances of chaincode. When enabled, a log stream is created for all chaincodes, with an individual log stream for each chaincode.
    */
  var ChaincodeLogs: js.UndefOr[LogConfigurations] = js.native
  
  /**
    * Configuration properties for a peer node log. Peer node logs contain messages generated when your client submits transaction proposals to peer nodes, requests to join channels, enrolls an admin peer, and lists the chaincode instances on a peer node. 
    */
  var PeerLogs: js.UndefOr[LogConfigurations] = js.native
}
object NodeFabricLogPublishingConfiguration {
  
  @scala.inline
  def apply(): NodeFabricLogPublishingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeFabricLogPublishingConfiguration]
  }
  
  @scala.inline
  implicit class NodeFabricLogPublishingConfigurationOps[Self <: NodeFabricLogPublishingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setChaincodeLogs(value: LogConfigurations): Self = this.set("ChaincodeLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChaincodeLogs: Self = this.set("ChaincodeLogs", js.undefined)
    
    @scala.inline
    def setPeerLogs(value: LogConfigurations): Self = this.set("PeerLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerLogs: Self = this.set("PeerLogs", js.undefined)
  }
}
