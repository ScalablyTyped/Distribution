package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVPCAssociationAuthorizationsResponse extends StObject {
  
  /**
    * The ID of the hosted zone that you can associate the listed VPCs with.
    */
  var HostedZoneId: ResourceId
  
  /**
    * When the response includes a NextToken element, there are more VPCs that can be associated with the specified hosted zone. To get the next page of VPCs, submit another ListVPCAssociationAuthorizations request, and include the value of the NextToken element from the response in the nexttoken request parameter.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The list of VPCs that are authorized to be associated with the specified hosted zone.
    */
  var VPCs: typings.awsSdk.route53Mod.VPCs
}
object ListVPCAssociationAuthorizationsResponse {
  
  inline def apply(HostedZoneId: ResourceId, VPCs: VPCs): ListVPCAssociationAuthorizationsResponse = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], VPCs = VPCs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVPCAssociationAuthorizationsResponse]
  }
  
  extension [Self <: ListVPCAssociationAuthorizationsResponse](x: Self) {
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVPCs(value: VPCs): Self = StObject.set(x, "VPCs", value.asInstanceOf[js.Any])
    
    inline def setVPCsVarargs(value: VPC*): Self = StObject.set(x, "VPCs", js.Array(value*))
  }
}
