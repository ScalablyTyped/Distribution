package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): BrokerNodeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerNodeInfo]
  }
  
  @scala.inline
  implicit class BrokerNodeInfoOps[Self <: BrokerNodeInfo] (val x: Self) extends AnyVal {
    
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
    def setAttachedENIId(value: string): Self = this.set("AttachedENIId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachedENIId: Self = this.set("AttachedENIId", js.undefined)
    
    @scala.inline
    def setBrokerId(value: double): Self = this.set("BrokerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerId: Self = this.set("BrokerId", js.undefined)
    
    @scala.inline
    def setClientSubnet(value: string): Self = this.set("ClientSubnet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientSubnet: Self = this.set("ClientSubnet", js.undefined)
    
    @scala.inline
    def setClientVpcIpAddress(value: string): Self = this.set("ClientVpcIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientVpcIpAddress: Self = this.set("ClientVpcIpAddress", js.undefined)
    
    @scala.inline
    def setCurrentBrokerSoftwareInfo(value: BrokerSoftwareInfo): Self = this.set("CurrentBrokerSoftwareInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentBrokerSoftwareInfo: Self = this.set("CurrentBrokerSoftwareInfo", js.undefined)
    
    @scala.inline
    def setEndpointsVarargs(value: string*): Self = this.set("Endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: listOfString): Self = this.set("Endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoints: Self = this.set("Endpoints", js.undefined)
  }
}
