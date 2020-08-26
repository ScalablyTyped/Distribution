package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventAggregatesResponse extends js.Object {
  /**
    * The number of events in each category that meet the optional filter criteria.
    */
  var eventAggregates: js.UndefOr[EventAggregateList] = js.native
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typings.awsSdk.healthMod.nextToken] = js.native
}

object DescribeEventAggregatesResponse {
  @scala.inline
  def apply(): DescribeEventAggregatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventAggregatesResponse]
  }
  @scala.inline
  implicit class DescribeEventAggregatesResponseOps[Self <: DescribeEventAggregatesResponse] (val x: Self) extends AnyVal {
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
    def setEventAggregatesVarargs(value: EventAggregate*): Self = this.set("eventAggregates", js.Array(value :_*))
    @scala.inline
    def setEventAggregates(value: EventAggregateList): Self = this.set("eventAggregates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventAggregates: Self = this.set("eventAggregates", js.undefined)
    @scala.inline
    def setNextToken(value: nextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

