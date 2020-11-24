package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignLimits extends js.Object {
  
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
  implicit class CampaignLimitsOps[Self <: CampaignLimits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDaily(value: integer): Self = this.set("Daily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaily: Self = this.set("Daily", js.undefined)
    
    @scala.inline
    def setMaximumDuration(value: integer): Self = this.set("MaximumDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumDuration: Self = this.set("MaximumDuration", js.undefined)
    
    @scala.inline
    def setMessagesPerSecond(value: integer): Self = this.set("MessagesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessagesPerSecond: Self = this.set("MessagesPerSecond", js.undefined)
    
    @scala.inline
    def setTotal(value: integer): Self = this.set("Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("Total", js.undefined)
  }
}
