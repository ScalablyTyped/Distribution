package typings.awsSdkClientPinpointBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetCampaignInputMod.GetCampaignInput
object GetCampaignInput {
  
  inline def apply(ApplicationId: String, CampaignId: String): GetCampaignInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignInput]
  }
}
