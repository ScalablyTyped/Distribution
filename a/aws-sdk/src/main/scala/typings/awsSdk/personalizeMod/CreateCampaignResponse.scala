package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCampaignResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the campaign.
    */
  var campaignArn: js.UndefOr[Arn] = js.undefined
}
object CreateCampaignResponse {
  
  @scala.inline
  def apply(): CreateCampaignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCampaignResponse]
  }
  
  @scala.inline
  implicit class CreateCampaignResponseMutableBuilder[Self <: CreateCampaignResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaignArn(value: Arn): Self = StObject.set(x, "campaignArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignArnUndefined: Self = StObject.set(x, "campaignArn", js.undefined)
  }
}
