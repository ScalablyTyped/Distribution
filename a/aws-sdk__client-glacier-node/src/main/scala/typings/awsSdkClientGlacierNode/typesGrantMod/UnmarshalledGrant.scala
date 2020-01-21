package typings.awsSdkClientGlacierNode.typesGrantMod

import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.FULL_CONTROL
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.READ
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.READ_ACP
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.WRITE
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.WRITE_ACP
import typings.awsSdkClientGlacierNode.typesGranteeMod.UnmarshalledGrantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledGrant extends Grant {
  /**
    * <p>The grantee.</p>
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

