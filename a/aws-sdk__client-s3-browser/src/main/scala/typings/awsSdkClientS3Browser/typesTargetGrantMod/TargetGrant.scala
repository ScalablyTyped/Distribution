package typings.awsSdkClientS3Browser.typesTargetGrantMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.FULL_CONTROL
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.READ
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.WRITE
import typings.awsSdkClientS3Browser.typesGranteeMod.Grantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetGrant extends js.Object {
  /**
    * _Grantee shape
    */
  var Grantee: js.UndefOr[typings.awsSdkClientS3Browser.typesGranteeMod.Grantee] = js.undefined
  /**
    * <p>Logging permissions assigned to the Grantee for the bucket.</p>
    */
  var Permission: js.UndefOr[FULL_CONTROL | READ | WRITE | String] = js.undefined
}

object TargetGrant {
  @scala.inline
  def apply(Grantee: Grantee = null, Permission: FULL_CONTROL | READ | WRITE | String = null): TargetGrant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee.asInstanceOf[js.Any])
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGrant]
  }
}

