package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHostedZonesByVPCResponse extends StObject {
  
  /**
    * A list that contains one HostedZoneSummary element for each hosted zone that the specified Amazon VPC is associated with. Each HostedZoneSummary element contains the hosted zone name and ID, and information about who owns the hosted zone.
    */
  var HostedZoneSummaries: typings.awsSdk.route53Mod.HostedZoneSummaries
  
  /**
    * The value that you specified for MaxItems in the most recent ListHostedZonesByVPC request.
    */
  var MaxItems: PageMaxItems
  
  /**
    * The value that you specified for NextToken in the most recent ListHostedZonesByVPC request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListHostedZonesByVPCResponse {
  
  inline def apply(HostedZoneSummaries: HostedZoneSummaries, MaxItems: PageMaxItems): ListHostedZonesByVPCResponse = {
    val __obj = js.Dynamic.literal(HostedZoneSummaries = HostedZoneSummaries.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHostedZonesByVPCResponse]
  }
  
  extension [Self <: ListHostedZonesByVPCResponse](x: Self) {
    
    inline def setHostedZoneSummaries(value: HostedZoneSummaries): Self = StObject.set(x, "HostedZoneSummaries", value.asInstanceOf[js.Any])
    
    inline def setHostedZoneSummariesVarargs(value: HostedZoneSummary*): Self = StObject.set(x, "HostedZoneSummaries", js.Array(value :_*))
    
    inline def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
