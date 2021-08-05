package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocateHostedConnectionRequest extends StObject {
  
  /**
    * The bandwidth of the connection. The possible values are 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps. Note that only those AWS Direct Connect Partners who have met specific requirements are allowed to create a 1Gbps, 2Gbps, 5Gbps or 10Gbps hosted connection. 
    */
  var bandwidth: Bandwidth
  
  /**
    * The ID of the interconnect or LAG.
    */
  var connectionId: ConnectionId
  
  /**
    * The name of the hosted connection.
    */
  var connectionName: ConnectionName
  
  /**
    * The ID of the AWS account ID of the customer for the connection.
    */
  var ownerAccount: OwnerAccount
  
  /**
    * The tags associated with the connection.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The dedicated VLAN provisioned to the hosted connection.
    */
  var vlan: VLAN
}
object AllocateHostedConnectionRequest {
  
  inline def apply(
    bandwidth: Bandwidth,
    connectionId: ConnectionId,
    connectionName: ConnectionName,
    ownerAccount: OwnerAccount,
    vlan: VLAN
  ): AllocateHostedConnectionRequest = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], connectionId = connectionId.asInstanceOf[js.Any], connectionName = connectionName.asInstanceOf[js.Any], ownerAccount = ownerAccount.asInstanceOf[js.Any], vlan = vlan.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateHostedConnectionRequest]
  }
  
  extension [Self <: AllocateHostedConnectionRequest](x: Self) {
    
    inline def setBandwidth(value: Bandwidth): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionName(value: ConnectionName): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setVlan(value: VLAN): Self = StObject.set(x, "vlan", value.asInstanceOf[js.Any])
  }
}
