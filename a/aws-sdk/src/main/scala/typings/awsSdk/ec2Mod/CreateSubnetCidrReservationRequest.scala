package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSubnetCidrReservationRequest extends StObject {
  
  /**
    * The IPv4 or IPV6 CIDR range to reserve.
    */
  var Cidr: String
  
  /**
    * The description to assign to the subnet CIDR reservation.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of reservation. The following are valid values:    prefix: The Amazon EC2 Prefix Delegation feature assigns the IP addresses to network interfaces that are associated with an instance. For information about Prefix Delegation, see Prefix Delegation for Amazon EC2 network interfaces in the Amazon Elastic Compute Cloud User Guide.    explicit: You manually assign the IP addresses to resources that reside in your subnet.   
    */
  var ReservationType: SubnetCidrReservationType
  
  /**
    * The ID of the subnet.
    */
  var SubnetId: typings.awsSdk.ec2Mod.SubnetId
  
  /**
    * The tags to assign to the subnet CIDR reservation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateSubnetCidrReservationRequest {
  
  inline def apply(Cidr: String, ReservationType: SubnetCidrReservationType, SubnetId: SubnetId): CreateSubnetCidrReservationRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any], ReservationType = ReservationType.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubnetCidrReservationRequest]
  }
  
  extension [Self <: CreateSubnetCidrReservationRequest](x: Self) {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setReservationType(value: SubnetCidrReservationType): Self = StObject.set(x, "ReservationType", value.asInstanceOf[js.Any])
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
