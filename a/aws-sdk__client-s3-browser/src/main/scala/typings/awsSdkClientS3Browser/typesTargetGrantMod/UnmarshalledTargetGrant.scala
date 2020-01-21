package typings.awsSdkClientS3Browser.typesTargetGrantMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.FULL_CONTROL
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.READ
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.WRITE
import typings.awsSdkClientS3Browser.typesGranteeMod.UnmarshalledGrantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledTargetGrant extends TargetGrant {
  /**
    * _Grantee shape
    */
  @JSName("Grantee")
  var Grantee_UnmarshalledTargetGrant: js.UndefOr[UnmarshalledGrantee] = js.undefined
}

object UnmarshalledTargetGrant {
  @scala.inline
  def apply(Grantee: UnmarshalledGrantee = null, Permission: FULL_CONTROL | READ | WRITE | String = null): UnmarshalledTargetGrant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee.asInstanceOf[js.Any])
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledTargetGrant]
  }
}

