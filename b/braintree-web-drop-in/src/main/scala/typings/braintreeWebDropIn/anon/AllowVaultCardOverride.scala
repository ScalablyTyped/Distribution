package typings.braintreeWebDropIn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowVaultCardOverride extends js.Object {
  var allowVaultCardOverride: js.UndefOr[Boolean] = js.undefined
  var vaultCard: js.UndefOr[Boolean] = js.undefined
}

object AllowVaultCardOverride {
  @scala.inline
  def apply(
    allowVaultCardOverride: js.UndefOr[Boolean] = js.undefined,
    vaultCard: js.UndefOr[Boolean] = js.undefined
  ): AllowVaultCardOverride = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowVaultCardOverride)) __obj.updateDynamic("allowVaultCardOverride")(allowVaultCardOverride.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vaultCard)) __obj.updateDynamic("vaultCard")(vaultCard.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowVaultCardOverride]
  }
}

