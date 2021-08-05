package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCampaignRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the campaign to delete.
    */
  var campaignArn: Arn
}
object DeleteCampaignRequest {
  
  inline def apply(campaignArn: Arn): DeleteCampaignRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCampaignRequest]
  }
  
  extension [Self <: DeleteCampaignRequest](x: Self) {
    
    inline def setCampaignArn(value: Arn): Self = StObject.set(x, "campaignArn", value.asInstanceOf[js.Any])
  }
}
