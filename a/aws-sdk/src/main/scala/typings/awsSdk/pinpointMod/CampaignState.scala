package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignState extends StObject {
  
  /**
    * The current status of the campaign, or the current status of a treatment that belongs to an A/B test campaign. If a campaign uses A/B testing, the campaign has a status of COMPLETED only if all campaign treatments have a status of COMPLETED. If you delete the segment that's associated with a campaign, the campaign fails and has a status of DELETED.
    */
  var CampaignStatus: js.UndefOr[typings.awsSdk.pinpointMod.CampaignStatus] = js.undefined
}
object CampaignState {
  
  @scala.inline
  def apply(): CampaignState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignState]
  }
  
  @scala.inline
  implicit class CampaignStateMutableBuilder[Self <: CampaignState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaignStatus(value: CampaignStatus): Self = StObject.set(x, "CampaignStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignStatusUndefined: Self = StObject.set(x, "CampaignStatus", js.undefined)
  }
}
