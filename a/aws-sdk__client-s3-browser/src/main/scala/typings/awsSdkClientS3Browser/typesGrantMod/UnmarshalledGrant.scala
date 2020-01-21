package typings.awsSdkClientS3Browser.typesGrantMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.FULL_CONTROL
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.READ
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.READ_ACP
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.WRITE
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.WRITE_ACP
import typings.awsSdkClientS3Browser.typesGranteeMod.UnmarshalledGrantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledGrant extends Grant {
  /**
    * _Grantee shape
    */
  @JSName("Grantee")
  var Grantee_UnmarshalledGrant: js.UndefOr[UnmarshalledGrantee] = js.undefined
}

object UnmarshalledGrant {
  @scala.inline
  def apply(
    Grantee: UnmarshalledGrantee = null,
    Permission: FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String = null
  ): UnmarshalledGrant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee.asInstanceOf[js.Any])
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledGrant]
  }
}

