package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionConfiguration extends js.Object {
  /**
    * Contains information about the account level permissions on the S3 bucket.
    */
  var AccountLevelPermissions: js.UndefOr[typings.awsSdk.guarddutyMod.AccountLevelPermissions] = js.native
  /**
    * Contains information about the bucket level permissions for the S3 bucket.
    */
  var BucketLevelPermissions: js.UndefOr[typings.awsSdk.guarddutyMod.BucketLevelPermissions] = js.native
}

object PermissionConfiguration {
  @scala.inline
  def apply(): PermissionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionConfiguration]
  }
  @scala.inline
  implicit class PermissionConfigurationOps[Self <: PermissionConfiguration] (val x: Self) extends AnyVal {
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
    def setAccountLevelPermissions(value: AccountLevelPermissions): Self = this.set("AccountLevelPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountLevelPermissions: Self = this.set("AccountLevelPermissions", js.undefined)
    @scala.inline
    def setBucketLevelPermissions(value: BucketLevelPermissions): Self = this.set("BucketLevelPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketLevelPermissions: Self = this.set("BucketLevelPermissions", js.undefined)
  }
  
}

