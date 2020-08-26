package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserProfileDetails extends js.Object {
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[typings.awsSdk.sagemakerMod.CreationTime] = js.native
  /**
    * The domain ID.
    */
  var DomainId: js.UndefOr[typings.awsSdk.sagemakerMod.DomainId] = js.native
  /**
    * The last modified time.
    */
  var LastModifiedTime: js.UndefOr[typings.awsSdk.sagemakerMod.LastModifiedTime] = js.native
  /**
    * The status.
    */
  var Status: js.UndefOr[UserProfileStatus] = js.native
  /**
    * The user profile name.
    */
  var UserProfileName: js.UndefOr[typings.awsSdk.sagemakerMod.UserProfileName] = js.native
}

object UserProfileDetails {
  @scala.inline
  def apply(): UserProfileDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserProfileDetails]
  }
  @scala.inline
  implicit class UserProfileDetailsOps[Self <: UserProfileDetails] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: CreationTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setDomainId(value: DomainId): Self = this.set("DomainId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainId: Self = this.set("DomainId", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: LastModifiedTime): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    @scala.inline
    def setStatus(value: UserProfileStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setUserProfileName(value: UserProfileName): Self = this.set("UserProfileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProfileName: Self = this.set("UserProfileName", js.undefined)
  }
  
}

