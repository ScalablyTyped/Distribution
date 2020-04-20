package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserRequest extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server that has this user assigned.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
  /**
    * The name of the user assigned to one or more servers. User names are part of the sign-in credentials to use the AWS Transfer for SFTP service and perform file transfer tasks.
    */
  var UserName: typings.awsSdk.transferMod.UserName = js.native
}

object DescribeUserRequest {
  @scala.inline
  def apply(ServerId: ServerId, UserName: UserName): DescribeUserRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserRequest]
  }
}

