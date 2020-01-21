package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSessionsResponse extends js.Object {
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * A list of sessions meeting the request parameters.
    */
  var Sessions: js.UndefOr[SessionList] = js.native
}

object DescribeSessionsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Sessions: SessionList = null): DescribeSessionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Sessions != null) __obj.updateDynamic("Sessions")(Sessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSessionsResponse]
  }
}

