package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetNetwork extends StObject {
  
  /**
    * The ID of the association.
    */
  var AssociationId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Client VPN endpoint with which the target network is associated.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of the security groups applied to the target network association.
    */
  var SecurityGroups: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The current state of the target network association.
    */
  var Status: js.UndefOr[AssociationStatus] = js.undefined
  
  /**
    * The ID of the subnet specified as the target network.
    */
  var TargetNetworkId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the VPC in which the target network (subnet) is located.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object TargetNetwork {
  
  inline def apply(): TargetNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetNetwork]
  }
  
  extension [Self <: TargetNetwork](x: Self) {
    
    inline def setAssociationId(value: String): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setClientVpnEndpointId(value: String): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    inline def setClientVpnEndpointIdUndefined: Self = StObject.set(x, "ClientVpnEndpointId", js.undefined)
    
    inline def setSecurityGroups(value: ValueStringList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setStatus(value: AssociationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTargetNetworkId(value: String): Self = StObject.set(x, "TargetNetworkId", value.asInstanceOf[js.Any])
    
    inline def setTargetNetworkIdUndefined: Self = StObject.set(x, "TargetNetworkId", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
