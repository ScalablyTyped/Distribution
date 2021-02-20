package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignLimits extends StObject {
  
  /**
    * The maximum number of messages that a campaign can send to a single endpoint during a 24-hour period. For an application, this value specifies the default limit for the number of messages that campaigns and journeys can send to a single endpoint during a 24-hour period. The maximum value is 100.
    */
  var Daily: js.UndefOr[integer] = js.native
  
  /**
    * The maximum amount of time, in seconds, that a campaign can attempt to deliver a message after the scheduled start time for the campaign. The minimum value is 60 seconds.
    */
  var MaximumDuration: js.UndefOr[integer] = js.native
  
  /**
    * The maximum number of messages that a campaign can send each second. For an application, this value specifies the default limit for the number of messages that campaigns can send each second. The minimum value is 50. The maximum value is 20,000.
    */
  var MessagesPerSecond: js.UndefOr[integer] = js.native
  
  /**
    * The maximum number of messages that a campaign can send to a single endpoint during the course of the campaign. If a campaign recurs, this setting applies to all runs of the campaign. The maximum value is 100.
    */
  var Total: js.UndefOr[integer] = js.native
}
object CampaignLimits {
  
  @scala.inline
  def apply(): CampaignLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignLimits]
  }
  
  @scala.inline
  implicit class CampaignLimitsMutableBuilder[Self <: CampaignLimits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaily(value: integer): Self = StObject.set(x, "Daily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyUndefined: Self = StObject.set(x, "Daily", js.undefined)
    
    @scala.inline
    def setMaximumDuration(value: integer): Self = StObject.set(x, "MaximumDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumDurationUndefined: Self = StObject.set(x, "MaximumDuration", js.undefined)
    
    @scala.inline
    def setMessagesPerSecond(value: integer): Self = StObject.set(x, "MessagesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesPerSecondUndefined: Self = StObject.set(x, "MessagesPerSecond", js.undefined)
    
    @scala.inline
    def setTotal(value: integer): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
