package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrafficMirrorSessionsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. The value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Describes one or more Traffic Mirror sessions. By default, all Traffic Mirror sessions are described. Alternatively, you can filter the results.
    */
  var TrafficMirrorSessions: js.UndefOr[TrafficMirrorSessionSet] = js.native
}

object DescribeTrafficMirrorSessionsResult {
  @scala.inline
  def apply(NextToken: String = null, TrafficMirrorSessions: TrafficMirrorSessionSet = null): DescribeTrafficMirrorSessionsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TrafficMirrorSessions != null) __obj.updateDynamic("TrafficMirrorSessions")(TrafficMirrorSessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrafficMirrorSessionsResult]
  }
}

