package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetEventsOutput extends js.Object {
  /**
    * A collection of objects containing event log entries for the specified fleet.
    */
  var Events: js.UndefOr[EventList] = js.native
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}

object DescribeFleetEventsOutput {
  @scala.inline
  def apply(): DescribeFleetEventsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetEventsOutput]
  }
  @scala.inline
  implicit class DescribeFleetEventsOutputOps[Self <: DescribeFleetEventsOutput] (val x: Self) extends AnyVal {
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
    def setEventsVarargs(value: Event*): Self = this.set("Events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: EventList): Self = this.set("Events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("Events", js.undefined)
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

