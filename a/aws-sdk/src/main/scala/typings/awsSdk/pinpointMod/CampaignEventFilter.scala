package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignEventFilter extends js.Object {
  /**
    * The dimension settings of the event filter for the campaign.
    */
  var Dimensions: EventDimensions = js.native
  /**
    * The type of event that causes the campaign to be sent. Valid values are: SYSTEM, sends the campaign when a system event occurs; and, ENDPOINT, sends the campaign when an endpoint event (Events resource) occurs.
    */
  var FilterType: typings.awsSdk.pinpointMod.FilterType = js.native
}

object CampaignEventFilter {
  @scala.inline
  def apply(Dimensions: EventDimensions, FilterType: FilterType): CampaignEventFilter = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions.asInstanceOf[js.Any], FilterType = FilterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignEventFilter]
  }
  @scala.inline
  implicit class CampaignEventFilterOps[Self <: CampaignEventFilter] (val x: Self) extends AnyVal {
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
    def setDimensions(value: EventDimensions): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterType(value: FilterType): Self = this.set("FilterType", value.asInstanceOf[js.Any])
  }
  
}

