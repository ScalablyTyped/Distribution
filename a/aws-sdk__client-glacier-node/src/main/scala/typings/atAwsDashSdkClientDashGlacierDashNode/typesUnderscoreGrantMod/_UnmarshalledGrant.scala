package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreGrantMod

import typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.FULL_CONTROL
import typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.READ
import typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.READ_ACP
import typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.WRITE
import typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.WRITE_ACP
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreGranteeMod._UnmarshalledGrantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledGrant extends _Grant {
  /**
    * <p>The grantee.</p>
    */
  @JSName("Grantee")
  var Grantee__UnmarshalledGrant: js.UndefOr[_UnmarshalledGrantee] = js.undefined
}

object _UnmarshalledGrant {
  @scala.inline
  def apply(
    Grantee: _UnmarshalledGrantee = null,
    Permission: FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String = null
  ): _UnmarshalledGrant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee)
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledGrant]
  }
}

