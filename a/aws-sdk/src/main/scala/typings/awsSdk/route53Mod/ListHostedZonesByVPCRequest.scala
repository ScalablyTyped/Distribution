package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHostedZonesByVPCRequest extends StObject {
  
  /**
    * (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If the specified VPC is associated with more than MaxItems hosted zones, the response includes a NextToken element. NextToken contains an encrypted token that identifies the first hosted zone that Route 53 will return if you submit another request.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
  
  /**
    * If the previous response included a NextToken element, the specified VPC is associated with more hosted zones. To get more hosted zones, submit another ListHostedZonesByVPC request.  For the value of NextToken, specify the value of NextToken from the previous response. If the previous response didn't include a NextToken element, there are no more hosted zones to get.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ID of the Amazon VPC that you want to list hosted zones for.
    */
  var VPCId: typings.awsSdk.route53Mod.VPCId
  
  /**
    * For the Amazon VPC that you specified for VPCId, the Amazon Web Services Region that you created the VPC in. 
    */
  var VPCRegion: typings.awsSdk.route53Mod.VPCRegion
}
object ListHostedZonesByVPCRequest {
  
  inline def apply(VPCId: VPCId, VPCRegion: VPCRegion): ListHostedZonesByVPCRequest = {
    val __obj = js.Dynamic.literal(VPCId = VPCId.asInstanceOf[js.Any], VPCRegion = VPCRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHostedZonesByVPCRequest]
  }
  
  extension [Self <: ListHostedZonesByVPCRequest](x: Self) {
    
    inline def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVPCId(value: VPCId): Self = StObject.set(x, "VPCId", value.asInstanceOf[js.Any])
    
    inline def setVPCRegion(value: VPCRegion): Self = StObject.set(x, "VPCRegion", value.asInstanceOf[js.Any])
  }
}
