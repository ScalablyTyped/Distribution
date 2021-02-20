package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCampaignRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the campaign to delete.
    */
  var campaignArn: Arn = js.native
}
object DeleteCampaignRequest {
  
  @scala.inline
  def apply(campaignArn: Arn): DeleteCampaignRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCampaignRequest]
  }
  
  @scala.inline
  implicit class DeleteCampaignRequestMutableBuilder[Self <: DeleteCampaignRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaignArn(value: Arn): Self = StObject.set(x, "campaignArn", value.asInstanceOf[js.Any])
  }
}
