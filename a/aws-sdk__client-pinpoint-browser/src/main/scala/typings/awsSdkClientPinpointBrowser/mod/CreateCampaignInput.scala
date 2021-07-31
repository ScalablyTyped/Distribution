package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesWriteCampaignRequestMod.WriteCampaignRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCampaignInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesCreateCampaignInputMod.CreateCampaignInput
object CreateCampaignInput {
  
  @scala.inline
  def apply(ApplicationId: String, WriteCampaignRequest: WriteCampaignRequest): CreateCampaignInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteCampaignRequest = WriteCampaignRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCampaignInput]
  }
}
