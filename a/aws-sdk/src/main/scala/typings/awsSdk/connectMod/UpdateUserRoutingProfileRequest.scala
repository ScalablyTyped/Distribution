package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserRoutingProfileRequest extends js.Object {
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  /**
    * The identifier of the routing profile for the user.
    */
  var RoutingProfileId: typings.awsSdk.connectMod.RoutingProfileId = js.native
  /**
    * The identifier of the user account.
    */
  var UserId: typings.awsSdk.connectMod.UserId = js.native
}

object UpdateUserRoutingProfileRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, RoutingProfileId: RoutingProfileId, UserId: UserId): UpdateUserRoutingProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], RoutingProfileId = RoutingProfileId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRoutingProfileRequest]
  }
  @scala.inline
  implicit class UpdateUserRoutingProfileRequestOps[Self <: UpdateUserRoutingProfileRequest] (val x: Self) extends AnyVal {
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
    def setRoutingProfileId(value: RoutingProfileId): Self = this.set("RoutingProfileId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: UserId): Self = this.set("UserId", value.asInstanceOf[js.Any])
  }
  
}

