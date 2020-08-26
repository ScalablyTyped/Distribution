package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserProfileResponse extends js.Object {
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[typings.awsSdk.sagemakerMod.CreationTime] = js.native
  /**
    * The ID of the domain that contains the profile.
    */
  var DomainId: js.UndefOr[typings.awsSdk.sagemakerMod.DomainId] = js.native
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * The ID of the user's profile in the Amazon Elastic File System (EFS) volume.
    */
  var HomeEfsFileSystemUid: js.UndefOr[EfsUid] = js.native
  /**
    * The last modified time.
    */
  var LastModifiedTime: js.UndefOr[typings.awsSdk.sagemakerMod.LastModifiedTime] = js.native
  /**
    * The SSO user identifier.
    */
  var SingleSignOnUserIdentifier: js.UndefOr[typings.awsSdk.sagemakerMod.SingleSignOnUserIdentifier] = js.native
  /**
    * The SSO user value.
    */
  var SingleSignOnUserValue: js.UndefOr[String256] = js.native
  /**
    * The status.
    */
  var Status: js.UndefOr[UserProfileStatus] = js.native
  /**
    * The user profile Amazon Resource Name (ARN).
    */
  var UserProfileArn: js.UndefOr[typings.awsSdk.sagemakerMod.UserProfileArn] = js.native
  /**
    * The user profile name.
    */
  var UserProfileName: js.UndefOr[typings.awsSdk.sagemakerMod.UserProfileName] = js.native
  /**
    * A collection of settings.
    */
  var UserSettings: js.UndefOr[typings.awsSdk.sagemakerMod.UserSettings] = js.native
}

object DescribeUserProfileResponse {
  @scala.inline
  def apply(): DescribeUserProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserProfileResponse]
  }
  @scala.inline
  implicit class DescribeUserProfileResponseOps[Self <: DescribeUserProfileResponse] (val x: Self) extends AnyVal {
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
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    @scala.inline
    def setHomeEfsFileSystemUid(value: EfsUid): Self = this.set("HomeEfsFileSystemUid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeEfsFileSystemUid: Self = this.set("HomeEfsFileSystemUid", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: LastModifiedTime): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    @scala.inline
    def setSingleSignOnUserIdentifier(value: SingleSignOnUserIdentifier): Self = this.set("SingleSignOnUserIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleSignOnUserIdentifier: Self = this.set("SingleSignOnUserIdentifier", js.undefined)
    @scala.inline
    def setSingleSignOnUserValue(value: String256): Self = this.set("SingleSignOnUserValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleSignOnUserValue: Self = this.set("SingleSignOnUserValue", js.undefined)
    @scala.inline
    def setStatus(value: UserProfileStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setUserProfileArn(value: UserProfileArn): Self = this.set("UserProfileArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProfileArn: Self = this.set("UserProfileArn", js.undefined)
    @scala.inline
    def setUserProfileName(value: UserProfileName): Self = this.set("UserProfileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProfileName: Self = this.set("UserProfileName", js.undefined)
    @scala.inline
    def setUserSettings(value: UserSettings): Self = this.set("UserSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserSettings: Self = this.set("UserSettings", js.undefined)
  }
  
}

