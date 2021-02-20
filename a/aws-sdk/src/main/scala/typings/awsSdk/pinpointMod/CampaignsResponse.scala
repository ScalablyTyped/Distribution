package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignsResponse extends StObject {
  
  /**
    * An array of responses, one for each campaign that's associated with the application.
    */
  var Item: ListOfCampaignResponse = js.native
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object CampaignsResponse {
  
  @scala.inline
  def apply(Item: ListOfCampaignResponse): CampaignsResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignsResponse]
  }
  
  @scala.inline
  implicit class CampaignsResponseMutableBuilder[Self <: CampaignsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: ListOfCampaignResponse): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemVarargs(value: CampaignResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
