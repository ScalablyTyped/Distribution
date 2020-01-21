package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VaultLockPolicy extends js.Object {
  /**
    * The vault lock policy.
    */
  var Policy: js.UndefOr[String] = js.native
}

object VaultLockPolicy {
  @scala.inline
  def apply(Policy: String = null): VaultLockPolicy = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaultLockPolicy]
  }
}

