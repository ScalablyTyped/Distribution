package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpnGatewayRequest extends StObject {
  
  /**
    * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. If you're using a 16-bit ASN, it must be in the 64512 to 65534 range. If you're using a 32-bit ASN, it must be in the 4200000000 to 4294967294 range. Default: 64512
    */
  var AmazonSideAsn: js.UndefOr[Long] = js.undefined
  
  /**
    * The Availability Zone for the virtual private gateway.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tags to apply to the virtual private gateway.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * The type of VPN connection this virtual private gateway supports.
    */
  var Type: GatewayType
}
object CreateVpnGatewayRequest {
  
  @scala.inline
  def apply(Type: GatewayType): CreateVpnGatewayRequest = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpnGatewayRequest]
  }
  
  @scala.inline
  implicit class CreateVpnGatewayRequestMutableBuilder[Self <: CreateVpnGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmazonSideAsn(value: Long): Self = StObject.set(x, "AmazonSideAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmazonSideAsnUndefined: Self = StObject.set(x, "AmazonSideAsn", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setType(value: GatewayType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
