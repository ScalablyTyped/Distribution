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
  def apply(): DescribeTrailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrailsResponse]
  }
  @scala.inline
  implicit class DescribeTrailsResponseOps[Self <: DescribeTrailsResponse] (val x: Self) extends AnyVal {
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
    def setTrailListVarargs(value: Trail*): Self = this.set("trailList", js.Array(value :_*))
    @scala.inline
    def setTrailList(value: TrailList): Self = this.set("trailList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailList: Self = this.set("trailList", js.undefined)
  }
  
}

