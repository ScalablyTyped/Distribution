package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGroupResponse extends js.Object {
  /**
    * The name of the group.
    */
  var Group: js.UndefOr[typings.awsSdk.quicksightMod.Group] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object DescribeGroupResponse {
  @scala.inline
  def apply(Group: Group = null, RequestId: String = null, Status: js.UndefOr[StatusCode] = js.undefined): DescribeGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (!js.isUndefined(Status)) __obj.updateDynamic("Status")(Status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGroupResponse]
  }
}

