package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventsResponse extends js.Object {
  /**
    * An array of events. Each element in the array represents one event.
    */
  var Events: js.UndefOr[EventList] = js.native
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeEventsResponse {
  @scala.inline
  def apply(): DescribeEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventsResponse]
  }
  @scala.inline
  implicit class DescribeEventsResponseOps[Self <: DescribeEventsResponse] (val x: Self) extends AnyVal {
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
    def setEvents(value: EventList): Self = this.set("Events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("Events", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

