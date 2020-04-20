package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEnvironmentMembershipRequest extends js.Object {
  /**
    * The ID of the environment that contains the environment member you want to add.
    */
  var environmentId: EnvironmentId = js.native
  /**
    * The type of environment member permissions you want to associate with this environment member. Available values include:    read-only: Has read-only access to the environment.    read-write: Has read-write access to the environment.  
    */
  var permissions: MemberPermissions = js.native
  /**
    * The Amazon Resource Name (ARN) of the environment member you want to add.
    */
  var userArn: UserArn = js.native
}

object CreateEnvironmentMembershipRequest {
  @scala.inline
  def apply(environmentId: EnvironmentId, permissions: MemberPermissions, userArn: UserArn): CreateEnvironmentMembershipRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentMembershipRequest]
  }
}

