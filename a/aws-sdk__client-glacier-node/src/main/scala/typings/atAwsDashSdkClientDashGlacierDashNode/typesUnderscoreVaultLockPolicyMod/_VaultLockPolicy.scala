package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreVaultLockPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _VaultLockPolicy extends js.Object {
  /**
    * <p>The vault lock policy.</p>
    */
  var Policy: js.UndefOr[String] = js.undefined
}

object _VaultLockPolicy {
  @scala.inline
  def apply(Policy: String = null): _VaultLockPolicy = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[_VaultLockPolicy]
  }
}

