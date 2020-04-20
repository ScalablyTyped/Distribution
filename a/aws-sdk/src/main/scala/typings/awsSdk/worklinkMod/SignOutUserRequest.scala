package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignOutUserRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.worklinkMod.FleetArn = js.native
  /**
    * The name of the user.
    */
  var Username: typings.awsSdk.worklinkMod.Username = js.native
}

object SignOutUserRequest {
  @scala.inline
  def apply(FleetArn: FleetArn, Username: Username): SignOutUserRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignOutUserRequest]
  }
}

