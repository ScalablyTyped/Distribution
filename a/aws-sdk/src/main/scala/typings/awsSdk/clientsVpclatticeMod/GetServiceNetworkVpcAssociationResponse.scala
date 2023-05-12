package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceNetworkVpcAssociationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the association.
    */
  var arn: js.UndefOr[ServiceNetworkVpcAssociationArn] = js.undefined
  
  /**
    * The date and time that the association was created, specified in ISO-8601 format.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The account that created the association.
    */
  var createdBy: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The failure code.
    */
  var failureCode: js.UndefOr[String] = js.undefined
  
  /**
    * The failure message.
    */
  var failureMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the specified association between the service network and the VPC.
    */
  var id: js.UndefOr[ServiceNetworkVpcAssociationId] = js.undefined
  
  /**
    * The date and time that the association was last updated, specified in ISO-8601 format.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The IDs of the security groups.
    */
  var securityGroupIds: js.UndefOr[SecurityGroupList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the service network.
    */
  var serviceNetworkArn: js.UndefOr[ServiceNetworkArn] = js.undefined
  
  /**
    * The ID of the service network.
    */
  var serviceNetworkId: js.UndefOr[ServiceNetworkId] = js.undefined
  
  /**
    * The name of the service network.
    */
  var serviceNetworkName: js.UndefOr[ServiceNetworkName] = js.undefined
  
  /**
    * The status of the association.
    */
  var status: js.UndefOr[ServiceNetworkVpcAssociationStatus] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var vpcId: js.UndefOr[VpcId] = js.undefined
}
object GetServiceNetworkVpcAssociationResponse {
  
  inline def apply(): GetServiceNetworkVpcAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceNetworkVpcAssociationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceNetworkVpcAssociationResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ServiceNetworkVpcAssociationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCreatedBy(value: AccountId): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setFailureCode(value: String): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    inline def setFailureMessage(value: String): Self = StObject.set(x, "failureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "failureMessage", js.undefined)
    
    inline def setId(value: ServiceNetworkVpcAssociationId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setSecurityGroupIds(value: SecurityGroupList): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setServiceNetworkArn(value: ServiceNetworkArn): Self = StObject.set(x, "serviceNetworkArn", value.asInstanceOf[js.Any])
    
    inline def setServiceNetworkArnUndefined: Self = StObject.set(x, "serviceNetworkArn", js.undefined)
    
    inline def setServiceNetworkId(value: ServiceNetworkId): Self = StObject.set(x, "serviceNetworkId", value.asInstanceOf[js.Any])
    
    inline def setServiceNetworkIdUndefined: Self = StObject.set(x, "serviceNetworkId", js.undefined)
    
    inline def setServiceNetworkName(value: ServiceNetworkName): Self = StObject.set(x, "serviceNetworkName", value.asInstanceOf[js.Any])
    
    inline def setServiceNetworkNameUndefined: Self = StObject.set(x, "serviceNetworkName", js.undefined)
    
    inline def setStatus(value: ServiceNetworkVpcAssociationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
  }
}
