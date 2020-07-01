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
  def apply(
    AccountLevelPermissions: AccountLevelPermissions = null,
    BucketLevelPermissions: BucketLevelPermissions = null
  ): PermissionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AccountLevelPermissions != null) __obj.updateDynamic("AccountLevelPermissions")(AccountLevelPermissions.asInstanceOf[js.Any])
    if (BucketLevelPermissions != null) __obj.updateDynamic("BucketLevelPermissions")(BucketLevelPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionConfiguration]
  }
}

