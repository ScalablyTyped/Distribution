package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesWriteCampaignRequestMod.WriteCampaignRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCampaignInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesUpdateCampaignInputMod.UpdateCampaignInput
object UpdateCampaignInput {
  
  @scala.inline
  def apply(ApplicationId: String, CampaignId: String, WriteCampaignRequest: WriteCampaignRequest): UpdateCampaignInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any], WriteCampaignRequest = WriteCampaignRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCampaignInput]
  }
}
