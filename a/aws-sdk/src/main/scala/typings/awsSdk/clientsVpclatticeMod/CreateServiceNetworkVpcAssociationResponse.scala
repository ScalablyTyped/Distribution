package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceNetworkVpcAssociationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the association.
    */
  var arn: js.UndefOr[ServiceNetworkVpcAssociationArn] = js.undefined
  
  /**
    * The account that created the association.
    */
  var createdBy: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The ID of the association.
    */
  var id: js.UndefOr[ServiceNetworkVpcAssociationId] = js.undefined
  
  /**
    * The IDs of the security groups.
    */
  var securityGroupIds: js.UndefOr[SecurityGroupList] = js.undefined
  
  /**
    * The operation's status.
    */
  var status: js.UndefOr[ServiceNetworkVpcAssociationStatus] = js.undefined
}
object CreateServiceNetworkVpcAssociationResponse {
  
  inline def apply(): CreateServiceNetworkVpcAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceNetworkVpcAssociationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateServiceNetworkVpcAssociationResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ServiceNetworkVpcAssociationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedBy(value: AccountId): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setId(value: ServiceNetworkVpcAssociationId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSecurityGroupIds(value: SecurityGroupList): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setStatus(value: ServiceNetworkVpcAssociationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
