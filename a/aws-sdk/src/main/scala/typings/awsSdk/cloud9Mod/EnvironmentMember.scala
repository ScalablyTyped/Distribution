package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentMember extends js.Object {
  /**
    * The ID of the environment for the environment member.
    */
  var environmentId: js.UndefOr[EnvironmentId] = js.native
  /**
    * The time, expressed in epoch time format, when the environment member last opened the environment.
    */
  var lastAccess: js.UndefOr[Timestamp] = js.native
  /**
    * The type of environment member permissions associated with this environment member. Available values include:    owner: Owns the environment.    read-only: Has read-only access to the environment.    read-write: Has read-write access to the environment.  
    */
  var permissions: js.UndefOr[Permissions] = js.native
  /**
    * The Amazon Resource Name (ARN) of the environment member.
    */
  var userArn: js.UndefOr[UserArn] = js.native
  /**
    * The user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
    */
  var userId: js.UndefOr[String] = js.native
}

object EnvironmentMember {
  @scala.inline
  def apply(): EnvironmentMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentMember]
  }
  @scala.inline
  implicit class EnvironmentMemberOps[Self <: EnvironmentMember] (val x: Self) extends AnyVal {
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
    def deleteEnvironmentId: Self = this.set("environmentId", js.undefined)
    @scala.inline
    def setLastAccess(value: Timestamp): Self = this.set("lastAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastAccess: Self = this.set("lastAccess", js.undefined)
    @scala.inline
    def setPermissions(value: Permissions): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    @scala.inline
    def setUserArn(value: UserArn): Self = this.set("userArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserArn: Self = this.set("userArn", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

