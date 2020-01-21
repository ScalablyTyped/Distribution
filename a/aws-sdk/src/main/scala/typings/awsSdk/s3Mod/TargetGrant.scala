package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGrant extends js.Object {
  /**
    * Container for the person being granted permissions.
    */
  var Grantee: js.UndefOr[typings.awsSdk.s3Mod.Grantee] = js.native
  /**
    * Logging permissions assigned to the Grantee for the bucket.
    */
  var Permission: js.UndefOr[BucketLogsPermission] = js.native
}

object TargetGrant {
  @scala.inline
  def apply(Grantee: Grantee = null, Permission: BucketLogsPermission = null): TargetGrant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee.asInstanceOf[js.Any])
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGrant]
  }
}

