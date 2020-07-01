package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicAccess extends js.Object {
  /**
    * Describes the effective permission on this bucket after factoring all attached policies.
    */
  var EffectivePermission: js.UndefOr[String] = js.native
  /**
    * Contains information about how permissions are configured for the S3 bucket.
    */
  var PermissionConfiguration: js.UndefOr[typings.awsSdk.guarddutyMod.PermissionConfiguration] = js.native
}

object PublicAccess {
  @scala.inline
  def apply(EffectivePermission: String = null, PermissionConfiguration: PermissionConfiguration = null): PublicAccess = {
    val __obj = js.Dynamic.literal()
    if (EffectivePermission != null) __obj.updateDynamic("EffectivePermission")(EffectivePermission.asInstanceOf[js.Any])
    if (PermissionConfiguration != null) __obj.updateDynamic("PermissionConfiguration")(PermissionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicAccess]
  }
}

