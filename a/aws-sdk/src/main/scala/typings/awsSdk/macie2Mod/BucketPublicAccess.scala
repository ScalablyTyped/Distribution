package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketPublicAccess extends js.Object {
  /**
    * Specifies whether the bucket is publicly accessible due to the combination of permissions settings that apply to the bucket. Possible values are: PUBLIC, the bucket is publicly accessible; and, NOT_PUBLIC, the bucket isn't publicly accessible.
    */
  var effectivePermission: js.UndefOr[EffectivePermission] = js.native
  /**
    * The account-level and bucket-level permissions for the bucket.
    */
  var permissionConfiguration: js.UndefOr[BucketPermissionConfiguration] = js.native
}

object BucketPublicAccess {
  @scala.inline
  def apply(
    effectivePermission: EffectivePermission = null,
    permissionConfiguration: BucketPermissionConfiguration = null
  ): BucketPublicAccess = {
    val __obj = js.Dynamic.literal()
    if (effectivePermission != null) __obj.updateDynamic("effectivePermission")(effectivePermission.asInstanceOf[js.Any])
    if (permissionConfiguration != null) __obj.updateDynamic("permissionConfiguration")(permissionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketPublicAccess]
  }
}

