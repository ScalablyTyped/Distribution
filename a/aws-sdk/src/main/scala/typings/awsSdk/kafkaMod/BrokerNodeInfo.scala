package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrokerNodeInfo extends StObject {
  
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
  implicit class BrokerNodeInfoMutableBuilder[Self <: BrokerNodeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachedENIId(value: string): Self = StObject.set(x, "AttachedENIId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachedENIIdUndefined: Self = StObject.set(x, "AttachedENIId", js.undefined)
    
    @scala.inline
    def setBrokerId(value: double): Self = StObject.set(x, "BrokerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerIdUndefined: Self = StObject.set(x, "BrokerId", js.undefined)
    
    @scala.inline
    def setClientSubnet(value: string): Self = StObject.set(x, "ClientSubnet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSubnetUndefined: Self = StObject.set(x, "ClientSubnet", js.undefined)
    
    @scala.inline
    def setClientVpcIpAddress(value: string): Self = StObject.set(x, "ClientVpcIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVpcIpAddressUndefined: Self = StObject.set(x, "ClientVpcIpAddress", js.undefined)
    
    @scala.inline
    def setCurrentBrokerSoftwareInfo(value: BrokerSoftwareInfo): Self = StObject.set(x, "CurrentBrokerSoftwareInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentBrokerSoftwareInfoUndefined: Self = StObject.set(x, "CurrentBrokerSoftwareInfo", js.undefined)
    
    @scala.inline
    def setEndpoints(value: listOfString): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    @scala.inline
    def setEndpointsVarargs(value: string*): Self = StObject.set(x, "Endpoints", js.Array(value :_*))
  }
}
