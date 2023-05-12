package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceNetworkVpcAssociationSummary extends StObject {
  
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
    * The ID of the association.
    */
  var id: js.UndefOr[ServiceNetworkVpcAssociationId] = js.undefined
  
  /**
    * The date and time that the association was last updated, specified in ISO-8601 format.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
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
    * The status.
    */
  var status: js.UndefOr[ServiceNetworkVpcAssociationStatus] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var vpcId: js.UndefOr[VpcId] = js.undefined
}
object ServiceNetworkVpcAssociationSummary {
  
  inline def apply(): ServiceNetworkVpcAssociationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceNetworkVpcAssociationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceNetworkVpcAssociationSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ServiceNetworkVpcAssociationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCreatedBy(value: AccountId): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setId(value: ServiceNetworkVpcAssociationId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
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
