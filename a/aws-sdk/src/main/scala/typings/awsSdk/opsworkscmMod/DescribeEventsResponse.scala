package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventsResponse extends js.Object {
  /**
    * NextToken is a string that is returned in some command responses. It indicates that not all entries have been returned, and that you must run at least one more request to get remaining items. To get remaining results, call DescribeEvents again, and assign the token from the previous results as the value of the nextToken parameter. If there are no more results, the response object's nextToken parameter value is null. Setting a nextToken value that was not returned in your previous results causes an InvalidNextTokenException to occur. 
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Contains the response to a DescribeEvents request. 
    */
  var ServerEvents: js.UndefOr[typings.awsSdk.opsworkscmMod.ServerEvents] = js.native
}

object DescribeEventsResponse {
  @scala.inline
  def apply(NextToken: String = null, ServerEvents: ServerEvents = null): DescribeEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ServerEvents != null) __obj.updateDynamic("ServerEvents")(ServerEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventsResponse]
  }
}

