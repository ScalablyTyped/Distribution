package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEnvironmentMembershipRequest extends js.Object {
  /**
    * The ID of the environment for the environment member whose settings you want to change.
    */
  var environmentId: EnvironmentId = js.native
  /**
    * The replacement type of environment member permissions you want to associate with this environment member. Available values include:    read-only: Has read-only access to the environment.    read-write: Has read-write access to the environment.  
    */
  var permissions: MemberPermissions = js.native
  /**
    * The Amazon Resource Name (ARN) of the environment member whose settings you want to change.
    */
  var userArn: UserArn = js.native
}

object UpdateEnvironmentMembershipRequest {
  @scala.inline
  def apply(environmentId: EnvironmentId, permissions: MemberPermissions, userArn: UserArn): UpdateEnvironmentMembershipRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentMembershipRequest]
  }
}

