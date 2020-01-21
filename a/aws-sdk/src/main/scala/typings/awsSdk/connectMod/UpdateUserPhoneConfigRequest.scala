package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserPhoneConfigRequest extends js.Object {
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  /**
    * Information about phone configuration settings for the user.
    */
  var PhoneConfig: UserPhoneConfig = js.native
  /**
    * The identifier of the user account.
    */
  var UserId: typings.awsSdk.connectMod.UserId = js.native
}

object UpdateUserPhoneConfigRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, PhoneConfig: UserPhoneConfig, UserId: UserId): UpdateUserPhoneConfigRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], PhoneConfig = PhoneConfig.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateUserPhoneConfigRequest]
  }
}

