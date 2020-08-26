package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserSecurityProfilesRequest extends js.Object {
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  /**
    * The identifiers of the security profiles for the user.
    */
  var SecurityProfileIds: typings.awsSdk.connectMod.SecurityProfileIds = js.native
  /**
    * The identifier of the user account.
    */
  var UserId: typings.awsSdk.connectMod.UserId = js.native
}

object UpdateUserSecurityProfilesRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, SecurityProfileIds: SecurityProfileIds, UserId: UserId): UpdateUserSecurityProfilesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], SecurityProfileIds = SecurityProfileIds.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserSecurityProfilesRequest]
  }
  @scala.inline
  implicit class UpdateUserSecurityProfilesRequestOps[Self <: UpdateUserSecurityProfilesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityProfileIdsVarargs(value: SecurityProfileId*): Self = this.set("SecurityProfileIds", js.Array(value :_*))
    @scala.inline
    def setSecurityProfileIds(value: SecurityProfileIds): Self = this.set("SecurityProfileIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: UserId): Self = this.set("UserId", value.asInstanceOf[js.Any])
  }
  
}

