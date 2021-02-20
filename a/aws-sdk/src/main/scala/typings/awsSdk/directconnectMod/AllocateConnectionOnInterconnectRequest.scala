package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllocateConnectionOnInterconnectRequest extends StObject {
  
  /**
    * The bandwidth of the connection. The possible values are 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps. Note that only those AWS Direct Connect Partners who have met specific requirements are allowed to create a 1Gbps, 2Gbps, 5Gbps or 10Gbps hosted connection.
    */
  var bandwidth: Bandwidth = js.native
  
  /**
    * The name of the provisioned connection.
    */
  var connectionName: ConnectionName = js.native
  
  /**
    * The ID of the interconnect on which the connection will be provisioned.
    */
  var interconnectId: InterconnectId = js.native
  
  /**
    * The ID of the AWS account of the customer for whom the connection will be provisioned.
    */
  var ownerAccount: OwnerAccount = js.native
  
  /**
    * The dedicated VLAN provisioned to the connection.
    */
  var vlan: VLAN = js.native
}
object AllocateConnectionOnInterconnectRequest {
  
  @scala.inline
  def apply(
    bandwidth: Bandwidth,
    connectionName: ConnectionName,
    interconnectId: InterconnectId,
    ownerAccount: OwnerAccount,
    vlan: VLAN
  ): AllocateConnectionOnInterconnectRequest = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], connectionName = connectionName.asInstanceOf[js.Any], interconnectId = interconnectId.asInstanceOf[js.Any], ownerAccount = ownerAccount.asInstanceOf[js.Any], vlan = vlan.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateConnectionOnInterconnectRequest]
  }
  
  @scala.inline
  implicit class AllocateConnectionOnInterconnectRequestMutableBuilder[Self <: AllocateConnectionOnInterconnectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidth(value: Bandwidth): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionName(value: ConnectionName): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterconnectId(value: InterconnectId): Self = StObject.set(x, "interconnectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVlan(value: VLAN): Self = StObject.set(x, "vlan", value.asInstanceOf[js.Any])
  }
}
