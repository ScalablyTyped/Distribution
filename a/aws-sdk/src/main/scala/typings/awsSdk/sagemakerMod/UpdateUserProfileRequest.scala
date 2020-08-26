package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserProfileRequest extends js.Object {
  /**
    * The domain ID.
    */
  var DomainId: typings.awsSdk.sagemakerMod.DomainId = js.native
  /**
    * The user profile name.
    */
  var UserProfileName: typings.awsSdk.sagemakerMod.UserProfileName = js.native
  /**
    * A collection of settings.
    */
  var UserSettings: js.UndefOr[typings.awsSdk.sagemakerMod.UserSettings] = js.native
}

object UpdateUserProfileRequest {
  @scala.inline
  def apply(DomainId: DomainId, UserProfileName: UserProfileName): UpdateUserProfileRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserProfileRequest]
  }
  @scala.inline
  implicit class UpdateUserProfileRequestOps[Self <: UpdateUserProfileRequest] (val x: Self) extends AnyVal {
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
    def setDomainId(value: DomainId): Self = this.set("DomainId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserProfileName(value: UserProfileName): Self = this.set("UserProfileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserSettings(value: UserSettings): Self = this.set("UserSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserSettings: Self = this.set("UserSettings", js.undefined)
  }
  
}

