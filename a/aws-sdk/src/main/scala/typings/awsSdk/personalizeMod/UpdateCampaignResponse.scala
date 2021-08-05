package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCampaignResponse extends StObject {
  
  /**
    * The same campaign ARN as given in the request.
    */
  var campaignArn: js.UndefOr[Arn] = js.undefined
}
object UpdateCampaignResponse {
  
  inline def apply(): UpdateCampaignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCampaignResponse]
  }
  
  extension [Self <: UpdateCampaignResponse](x: Self) {
    
    inline def setCampaignArn(value: Arn): Self = StObject.set(x, "campaignArn", value.asInstanceOf[js.Any])
    
    inline def setCampaignArnUndefined: Self = StObject.set(x, "campaignArn", js.undefined)
  }
}
