package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserResponse extends js.Object {
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  /**
    * The user name.
    */
  var User: js.UndefOr[typings.awsSdk.quicksightMod.User] = js.native
}

object DescribeUserResponse {
  @scala.inline
  def apply(RequestId: String = null, Status: js.UndefOr[StatusCode] = js.undefined, User: User = null): DescribeUserResponse = {
    val __obj = js.Dynamic.literal()
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (!js.isUndefined(Status)) __obj.updateDynamic("Status")(Status.get.asInstanceOf[js.Any])
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserResponse]
  }
}

