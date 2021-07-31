package typings.awsSdkClientPinpointBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignActivitiesInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesInputMod.GetCampaignActivitiesInput
object GetCampaignActivitiesInput {
  
  @scala.inline
  def apply(ApplicationId: String, CampaignId: String): GetCampaignActivitiesInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignActivitiesInput]
  }
}
