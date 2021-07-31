package typings.awsSdkClientPinpointBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCampaignInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesDeleteCampaignInputMod.DeleteCampaignInput
object DeleteCampaignInput {
  
  @scala.inline
  def apply(ApplicationId: String, CampaignId: String): DeleteCampaignInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCampaignInput]
  }
}
