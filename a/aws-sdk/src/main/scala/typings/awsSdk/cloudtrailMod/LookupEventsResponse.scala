package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookupEventsResponse extends js.Object {
  /**
    * A list of events returned based on the lookup attributes specified and the CloudTrail event. The events list is sorted by time. The most recent event is listed first.
    */
  var Events: js.UndefOr[EventsList] = js.native
  /**
    * The token to use to get the next page of results after a previous API call. If the token does not appear, there are no more results to return. The token must be passed in with the same parameters as the previous call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudtrailMod.NextToken] = js.native
}

object LookupEventsResponse {
  @scala.inline
  def apply(): LookupEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupEventsResponse]
  }
  @scala.inline
  implicit class LookupEventsResponseOps[Self <: LookupEventsResponse] (val x: Self) extends AnyVal {
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
    def setEventsVarargs(value: Event*): Self = this.set("Events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: EventsList): Self = this.set("Events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("Events", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

