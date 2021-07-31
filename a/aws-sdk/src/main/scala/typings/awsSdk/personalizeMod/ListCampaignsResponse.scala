package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCampaignsResponse extends StObject {
  
  /**
    * A list of the campaigns.
    */
  var campaigns: js.UndefOr[Campaigns] = js.undefined
  
  /**
    * A token for getting the next set of campaigns (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListCampaignsResponse {
  
  @scala.inline
  def apply(): ListCampaignsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCampaignsResponse]
  }
  
  @scala.inline
  implicit class ListCampaignsResponseMutableBuilder[Self <: ListCampaignsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaigns(value: Campaigns): Self = StObject.set(x, "campaigns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignsUndefined: Self = StObject.set(x, "campaigns", js.undefined)
    
    @scala.inline
    def setCampaignsVarargs(value: CampaignSummary*): Self = StObject.set(x, "campaigns", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
