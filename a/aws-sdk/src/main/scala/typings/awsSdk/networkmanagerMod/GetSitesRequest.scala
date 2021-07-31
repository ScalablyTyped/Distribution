package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSitesRequest extends StObject {
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.networkmanagerMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * One or more site IDs. The maximum is 10.
    */
  var SiteIds: js.UndefOr[StringList] = js.undefined
}
object GetSitesRequest {
  
  @scala.inline
  def apply(GlobalNetworkId: String): GetSitesRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSitesRequest]
  }
  
  @scala.inline
  implicit class GetSitesRequestMutableBuilder[Self <: GetSitesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSiteIds(value: StringList): Self = StObject.set(x, "SiteIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteIdsUndefined: Self = StObject.set(x, "SiteIds", js.undefined)
    
    @scala.inline
    def setSiteIdsVarargs(value: String*): Self = StObject.set(x, "SiteIds", js.Array(value :_*))
  }
}
