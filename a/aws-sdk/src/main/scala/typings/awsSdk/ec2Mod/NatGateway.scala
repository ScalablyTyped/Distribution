package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NatGateway extends StObject {
  
  /**
    * The date and time the NAT gateway was created.
    */
  var CreateTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The date and time the NAT gateway was deleted, if applicable.
    */
  var DeleteTime: js.UndefOr[DateTime] = js.native
  
  /**
    * If the NAT gateway could not be created, specifies the error code for the failure. (InsufficientFreeAddressesInSubnet | Gateway.NotAttached | InvalidAllocationID.NotFound | Resource.AlreadyAssociated | InternalError | InvalidSubnetID.NotFound)
    */
  var FailureCode: js.UndefOr[String] = js.native
  
  /**
    * If the NAT gateway could not be created, specifies the error message for the failure, that corresponds to the error code.   For InsufficientFreeAddressesInSubnet: "Subnet has insufficient free addresses to create this NAT gateway"   For Gateway.NotAttached: "Network vpc-xxxxxxxx has no Internet gateway attached"   For InvalidAllocationID.NotFound: "Elastic IP address eipalloc-xxxxxxxx could not be associated with this NAT gateway"   For Resource.AlreadyAssociated: "Elastic IP address eipalloc-xxxxxxxx is already associated"   For InternalError: "Network interface eni-xxxxxxxx, created and used internally by this NAT gateway is in an invalid state. Please try again."   For InvalidSubnetID.NotFound: "The specified subnet subnet-xxxxxxxx does not exist or could not be found."  
    */
  var FailureMessage: js.UndefOr[String] = js.native
  
  /**
    * Information about the IP addresses and network interface associated with the NAT gateway.
    */
  var NatGatewayAddresses: js.UndefOr[NatGatewayAddressList] = js.native
  
  /**
    * The ID of the NAT gateway.
    */
  var NatGatewayId: js.UndefOr[String] = js.native
  
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var ProvisionedBandwidth: js.UndefOr[typings.awsSdk.ec2Mod.ProvisionedBandwidth] = js.native
  
  /**
    * The state of the NAT gateway.    pending: The NAT gateway is being created and is not ready to process traffic.    failed: The NAT gateway could not be created. Check the failureCode and failureMessage fields for the reason.    available: The NAT gateway is able to process traffic. This status remains until you delete the NAT gateway, and does not indicate the health of the NAT gateway.    deleting: The NAT gateway is in the process of being terminated and may still be processing traffic.    deleted: The NAT gateway has been terminated and is no longer processing traffic.  
    */
  var State: js.UndefOr[NatGatewayState] = js.native
  
  /**
    * The ID of the subnet in which the NAT gateway is located.
    */
  var SubnetId: js.UndefOr[String] = js.native
  
  /**
    * The tags for the NAT gateway.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the VPC in which the NAT gateway is located.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object NatGateway {
  
  @scala.inline
  def apply(): NatGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NatGateway]
  }
  
  @scala.inline
  implicit class NatGatewayMutableBuilder[Self <: NatGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: DateTime): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    @scala.inline
    def setDeleteTime(value: DateTime): Self = StObject.set(x, "DeleteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTimeUndefined: Self = StObject.set(x, "DeleteTime", js.undefined)
    
    @scala.inline
    def setFailureCode(value: String): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
    
    @scala.inline
    def setFailureMessage(value: String): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
    
    @scala.inline
    def setNatGatewayAddresses(value: NatGatewayAddressList): Self = StObject.set(x, "NatGatewayAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatGatewayAddressesUndefined: Self = StObject.set(x, "NatGatewayAddresses", js.undefined)
    
    @scala.inline
    def setNatGatewayAddressesVarargs(value: NatGatewayAddress*): Self = StObject.set(x, "NatGatewayAddresses", js.Array(value :_*))
    
    @scala.inline
    def setNatGatewayId(value: String): Self = StObject.set(x, "NatGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatGatewayIdUndefined: Self = StObject.set(x, "NatGatewayId", js.undefined)
    
    @scala.inline
    def setProvisionedBandwidth(value: ProvisionedBandwidth): Self = StObject.set(x, "ProvisionedBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedBandwidthUndefined: Self = StObject.set(x, "ProvisionedBandwidth", js.undefined)
    
    @scala.inline
    def setState(value: NatGatewayState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
