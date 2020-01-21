package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrailsResponse extends js.Object {
  /**
    * The list of trail objects. Trail objects with string values are only returned if values for the objects exist in a trail's configuration. For example, SNSTopicName and SNSTopicARN are only returned in results if a trail is configured to send SNS notifications. Similarly, KMSKeyId only appears in results if a trail's log files are encrypted with AWS KMS-managed keys.
    */
  var trailList: js.UndefOr[TrailList] = js.native
}

object DescribeTrailsResponse {
  @scala.inline
  def apply(trailList: TrailList = null): DescribeTrailsResponse = {
    val __obj = js.Dynamic.literal()
    if (trailList != null) __obj.updateDynamic("trailList")(trailList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrailsResponse]
  }
}

