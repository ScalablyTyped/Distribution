package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCampaignResponse extends StObject {
  
  /**
    * The properties of the campaign.
    */
  var campaign: js.UndefOr[Campaign] = js.undefined
}
object DescribeCampaignResponse {
  
  @scala.inline
  def apply(): DescribeCampaignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCampaignResponse]
  }
  
  @scala.inline
  implicit class DescribeCampaignResponseMutableBuilder[Self <: DescribeCampaignResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaign(value: Campaign): Self = StObject.set(x, "campaign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignUndefined: Self = StObject.set(x, "campaign", js.undefined)
  }
}
