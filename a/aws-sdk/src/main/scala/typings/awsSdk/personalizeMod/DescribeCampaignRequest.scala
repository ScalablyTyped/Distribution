package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCampaignRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the campaign.
    */
  var campaignArn: Arn = js.native
}
object DescribeCampaignRequest {
  
  @scala.inline
  def apply(campaignArn: Arn): DescribeCampaignRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCampaignRequest]
  }
  
  @scala.inline
  implicit class DescribeCampaignRequestMutableBuilder[Self <: DescribeCampaignRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaignArn(value: Arn): Self = StObject.set(x, "campaignArn", value.asInstanceOf[js.Any])
  }
}
