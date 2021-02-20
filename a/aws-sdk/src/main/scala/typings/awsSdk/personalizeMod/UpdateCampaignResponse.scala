package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCampaignResponse extends StObject {
  
  /**
    * The same campaign ARN as given in the request.
    */
  var campaignArn: js.UndefOr[Arn] = js.native
}
object UpdateCampaignResponse {
  
  @scala.inline
  def apply(): UpdateCampaignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCampaignResponse]
  }
  
  @scala.inline
  implicit class UpdateCampaignResponseMutableBuilder[Self <: UpdateCampaignResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaignArn(value: Arn): Self = StObject.set(x, "campaignArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignArnUndefined: Self = StObject.set(x, "campaignArn", js.undefined)
  }
}
