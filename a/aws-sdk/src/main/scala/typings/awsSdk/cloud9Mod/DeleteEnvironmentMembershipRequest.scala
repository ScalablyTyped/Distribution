package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEnvironmentMembershipRequest extends js.Object {
  /**
    * The ID of the environment to delete the environment member from.
    */
  var environmentId: EnvironmentId = js.native
  /**
    * The Amazon Resource Name (ARN) of the environment member to delete from the environment.
    */
  var userArn: UserArn = js.native
}

object DeleteEnvironmentMembershipRequest {
  @scala.inline
  def apply(environmentId: EnvironmentId, userArn: UserArn): DeleteEnvironmentMembershipRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEnvironmentMembershipRequest]
  }
  @scala.inline
  implicit class DeleteEnvironmentMembershipRequestOps[Self <: DeleteEnvironmentMembershipRequest] (val x: Self) extends AnyVal {
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
    def setEnvironmentId(value: EnvironmentId): Self = this.set("environmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserArn(value: UserArn): Self = this.set("userArn", value.asInstanceOf[js.Any])
  }
  
}

