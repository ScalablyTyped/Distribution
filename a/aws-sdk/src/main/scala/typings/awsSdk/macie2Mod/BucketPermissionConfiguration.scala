package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketPermissionConfiguration extends js.Object {
  /**
    * The account-level permissions settings that apply to the bucket.
    */
  var accountLevelPermissions: js.UndefOr[AccountLevelPermissions] = js.native
  /**
    * The bucket-level permissions settings for the bucket.
    */
  var bucketLevelPermissions: js.UndefOr[BucketLevelPermissions] = js.native
}

object BucketPermissionConfiguration {
  @scala.inline
  def apply(
    accountLevelPermissions: AccountLevelPermissions = null,
    bucketLevelPermissions: BucketLevelPermissions = null
  ): BucketPermissionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (accountLevelPermissions != null) __obj.updateDynamic("accountLevelPermissions")(accountLevelPermissions.asInstanceOf[js.Any])
    if (bucketLevelPermissions != null) __obj.updateDynamic("bucketLevelPermissions")(bucketLevelPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketPermissionConfiguration]
  }
}

