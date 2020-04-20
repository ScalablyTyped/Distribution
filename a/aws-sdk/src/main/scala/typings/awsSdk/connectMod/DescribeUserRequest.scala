package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserRequest extends js.Object {
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  /**
    * The identifier of the user account.
    */
  var UserId: typings.awsSdk.connectMod.UserId = js.native
}

object DescribeUserRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, UserId: UserId): DescribeUserRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserRequest]
  }
}

