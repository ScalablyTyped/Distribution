package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHostedZonesByVPCResponse extends StObject {
  
  /**
    * A list that contains one HostedZoneSummary element for each hosted zone that the specified Amazon VPC is associated with. Each HostedZoneSummary element contains the hosted zone name and ID, and information about who owns the hosted zone.
    */
  var HostedZoneSummaries: typings.awsSdk.route53Mod.HostedZoneSummaries = js.native
  
  /**
    * The value that you specified for MaxItems in the most recent ListHostedZonesByVPC request.
    */
  var MaxItems: PageMaxItems = js.native
  
  /**
    * The value that you specified for NextToken in the most recent ListHostedZonesByVPC request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListHostedZonesByVPCResponse {
  
  @scala.inline
  def apply(HostedZoneSummaries: HostedZoneSummaries, MaxItems: PageMaxItems): ListHostedZonesByVPCResponse = {
    val __obj = js.Dynamic.literal(HostedZoneSummaries = HostedZoneSummaries.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHostedZonesByVPCResponse]
  }
  
  @scala.inline
  implicit class ListHostedZonesByVPCResponseMutableBuilder[Self <: ListHostedZonesByVPCResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostedZoneSummaries(value: HostedZoneSummaries): Self = StObject.set(x, "HostedZoneSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZoneSummariesVarargs(value: HostedZoneSummary*): Self = StObject.set(x, "HostedZoneSummaries", js.Array(value :_*))
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
