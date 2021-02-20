package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetNetwork extends StObject {
  
  /**
    * The ID of the association.
    */
  var AssociationId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Client VPN endpoint with which the target network is associated.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  
  /**
    * The IDs of the security groups applied to the target network association.
    */
  var SecurityGroups: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The current state of the target network association.
    */
  var Status: js.UndefOr[AssociationStatus] = js.native
  
  /**
    * The ID of the subnet specified as the target network.
    */
  var TargetNetworkId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the VPC in which the target network (subnet) is located.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object TargetNetwork {
  
  @scala.inline
  def apply(): TargetNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetNetwork]
  }
  
  @scala.inline
  implicit class TargetNetworkMutableBuilder[Self <: TargetNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: String): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    @scala.inline
    def setClientVpnEndpointId(value: String): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVpnEndpointIdUndefined: Self = StObject.set(x, "ClientVpnEndpointId", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: ValueStringList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: AssociationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTargetNetworkId(value: String): Self = StObject.set(x, "TargetNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNetworkIdUndefined: Self = StObject.set(x, "TargetNetworkId", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
