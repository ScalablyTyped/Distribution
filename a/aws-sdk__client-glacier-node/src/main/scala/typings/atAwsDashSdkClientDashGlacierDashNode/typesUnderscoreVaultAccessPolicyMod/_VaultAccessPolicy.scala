package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreVaultAccessPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _VaultAccessPolicy extends js.Object {
  /**
    * <p>The vault access policy.</p>
    */
  var Policy: js.UndefOr[String] = js.undefined
}

object _VaultAccessPolicy {
  @scala.inline
  def apply(Policy: String = null): _VaultAccessPolicy = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    __obj.asInstanceOf[_VaultAccessPolicy]
  }
}

