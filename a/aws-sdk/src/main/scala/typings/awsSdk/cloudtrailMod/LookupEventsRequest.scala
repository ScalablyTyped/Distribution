package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookupEventsRequest extends js.Object {
  /**
    * Specifies that only events that occur before or at the specified time are returned. If the specified end time is before the specified start time, an error is returned.
    */
  var EndTime: js.UndefOr[Date] = js.native
  /**
    * Specifies the event category. If you do not specify an event category, events of the category are not returned in the response. For example, if you do not specify insight as the value of EventCategory, no Insights events are returned.
    */
  var EventCategory: js.UndefOr[typings.awsSdk.cloudtrailMod.EventCategory] = js.native
  /**
    * Contains a list of lookup attributes. Currently the list can contain only one item.
    */
  var LookupAttributes: js.UndefOr[LookupAttributesList] = js.native
  /**
    * The number of events to return. Possible values are 1 through 50. The default is 50.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.cloudtrailMod.MaxResults] = js.native
  /**
    * The token to use to get the next page of results after a previous API call. This token must be passed in with the same parameters that were specified in the the original call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudtrailMod.NextToken] = js.native
  /**
    * Specifies that only events that occur after or at the specified time are returned. If the specified start time is after the specified end time, an error is returned.
    */
  var StartTime: js.UndefOr[Date] = js.native
}

object LookupEventsRequest {
  @scala.inline
  def apply(): LookupEventsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupEventsRequest]
  }
  @scala.inline
  implicit class LookupEventsRequestOps[Self <: LookupEventsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndTime(value: Date): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setEventCategory(value: EventCategory): Self = this.set("EventCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventCategory: Self = this.set("EventCategory", js.undefined)
    @scala.inline
    def setLookupAttributesVarargs(value: LookupAttribute*): Self = this.set("LookupAttributes", js.Array(value :_*))
    @scala.inline
    def setLookupAttributes(value: LookupAttributesList): Self = this.set("LookupAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLookupAttributes: Self = this.set("LookupAttributes", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setStartTime(value: Date): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
  }
  
}

