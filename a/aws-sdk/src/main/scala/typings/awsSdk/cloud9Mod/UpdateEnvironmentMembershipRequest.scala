package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class UpdateEnvironmentMembershipRequestOps[Self <: UpdateEnvironmentMembershipRequest] (val x: Self) extends AnyVal {
    
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
    def setPermissions(value: MemberPermissions): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserArn(value: UserArn): Self = this.set("userArn", value.asInstanceOf[js.Any])
  }
}
