package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceNetworkVpcAssociationRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a request that completed successfully using the same client token and parameters, the retry succeeds without performing any actions. If the parameters aren't identical, the retry fails.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The IDs of the security groups. Security groups aren't added by default. You can add a security group to apply network level controls to control which resources in a VPC are allowed to access the service network and its services. For more information, see Control traffic to resources using security groups in the Amazon VPC User Guide.
    */
  var securityGroupIds: js.UndefOr[CreateServiceNetworkVpcAssociationRequestSecurityGroupIdsList] = js.undefined
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service network. You must use the ARN when the resources specified in the operation are in different accounts.
    */
  var serviceNetworkIdentifier: ServiceNetworkIdentifier
  
  /**
    * The tags for the association.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var vpcIdentifier: VpcId
}
object CreateServiceNetworkVpcAssociationRequest {
  
  inline def apply(serviceNetworkIdentifier: ServiceNetworkIdentifier, vpcIdentifier: VpcId): CreateServiceNetworkVpcAssociationRequest = {
    val __obj = js.Dynamic.literal(serviceNetworkIdentifier = serviceNetworkIdentifier.asInstanceOf[js.Any], vpcIdentifier = vpcIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceNetworkVpcAssociationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateServiceNetworkVpcAssociationRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setSecurityGroupIds(value: CreateServiceNetworkVpcAssociationRequestSecurityGroupIdsList): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setServiceNetworkIdentifier(value: ServiceNetworkIdentifier): Self = StObject.set(x, "serviceNetworkIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setVpcIdentifier(value: VpcId): Self = StObject.set(x, "vpcIdentifier", value.asInstanceOf[js.Any])
  }
}
