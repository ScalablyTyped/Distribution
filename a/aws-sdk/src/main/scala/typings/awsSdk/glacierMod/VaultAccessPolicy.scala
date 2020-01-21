package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VaultAccessPolicy extends js.Object {
  /**
    * The vault access policy.
    */
  var Policy: js.UndefOr[String] = js.native
}

object VaultAccessPolicy {
  @scala.inline
  def apply(Policy: String = null): VaultAccessPolicy = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaultAccessPolicy]
  }
}

