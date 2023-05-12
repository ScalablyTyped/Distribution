package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceNetworkVpcAssociationRequest extends StObject {
  
  /**
    * The IDs of the security groups. 
    */
  var securityGroupIds: UpdateServiceNetworkVpcAssociationRequestSecurityGroupIdsList
  
  /**
    * The ID or Amazon Resource Name (ARN) of the association.
    */
  var serviceNetworkVpcAssociationIdentifier: ServiceNetworkVpcAssociationIdentifier
}
object UpdateServiceNetworkVpcAssociationRequest {
  
  inline def apply(
    securityGroupIds: UpdateServiceNetworkVpcAssociationRequestSecurityGroupIdsList,
    serviceNetworkVpcAssociationIdentifier: ServiceNetworkVpcAssociationIdentifier
  ): UpdateServiceNetworkVpcAssociationRequest = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], serviceNetworkVpcAssociationIdentifier = serviceNetworkVpcAssociationIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceNetworkVpcAssociationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateServiceNetworkVpcAssociationRequest] (val x: Self) extends AnyVal {
    
    inline def setSecurityGroupIds(value: UpdateServiceNetworkVpcAssociationRequestSecurityGroupIdsList): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setServiceNetworkVpcAssociationIdentifier(value: ServiceNetworkVpcAssociationIdentifier): Self = StObject.set(x, "serviceNetworkVpcAssociationIdentifier", value.asInstanceOf[js.Any])
  }
}
