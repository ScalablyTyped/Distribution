package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerNodeInfo extends js.Object {
  /**
    * 
    The attached elastic network interface of the broker.
    
    */
  var AttachedENIId: js.UndefOr[string] = js.native
  /**
    * 
    The ID of the broker.
    
    */
  var BrokerId: js.UndefOr[double] = js.native
  /**
    * 
    The client subnet to which this broker node belongs.
    
    */
  var ClientSubnet: js.UndefOr[string] = js.native
  /**
    * 
    The virtual private cloud (VPC) of the client.
    
    */
  var ClientVpcIpAddress: js.UndefOr[string] = js.native
  /**
    * 
    Information about the version of software currently deployed on the Kafka brokers in the cluster.
    
    */
  var CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo] = js.native
  /**
    * 
    Endpoints for accessing the broker.
    
    */
  var Endpoints: js.UndefOr[listOfString] = js.native
}

object BrokerNodeInfo {
  @scala.inline
  def apply(
    AttachedENIId: string = null,
    BrokerId: Int | Double = null,
    ClientSubnet: string = null,
    ClientVpcIpAddress: string = null,
    CurrentBrokerSoftwareInfo: BrokerSoftwareInfo = null,
    Endpoints: listOfString = null
  ): BrokerNodeInfo = {
    val __obj = js.Dynamic.literal()
    if (AttachedENIId != null) __obj.updateDynamic("AttachedENIId")(AttachedENIId.asInstanceOf[js.Any])
    if (BrokerId != null) __obj.updateDynamic("BrokerId")(BrokerId.asInstanceOf[js.Any])
    if (ClientSubnet != null) __obj.updateDynamic("ClientSubnet")(ClientSubnet.asInstanceOf[js.Any])
    if (ClientVpcIpAddress != null) __obj.updateDynamic("ClientVpcIpAddress")(ClientVpcIpAddress.asInstanceOf[js.Any])
    if (CurrentBrokerSoftwareInfo != null) __obj.updateDynamic("CurrentBrokerSoftwareInfo")(CurrentBrokerSoftwareInfo.asInstanceOf[js.Any])
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerNodeInfo]
  }
}

