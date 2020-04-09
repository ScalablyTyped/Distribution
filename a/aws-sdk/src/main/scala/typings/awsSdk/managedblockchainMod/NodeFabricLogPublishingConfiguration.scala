package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(ChaincodeLogs: LogConfigurations = null, PeerLogs: LogConfigurations = null): NodeFabricLogPublishingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ChaincodeLogs != null) __obj.updateDynamic("ChaincodeLogs")(ChaincodeLogs.asInstanceOf[js.Any])
    if (PeerLogs != null) __obj.updateDynamic("PeerLogs")(PeerLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeFabricLogPublishingConfiguration]
  }
}

