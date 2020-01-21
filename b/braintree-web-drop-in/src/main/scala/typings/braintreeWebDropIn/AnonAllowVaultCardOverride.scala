package typings.braintreeWebDropIn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowVaultCardOverride extends js.Object {
  var allowVaultCardOverride: js.UndefOr[Boolean] = js.undefined
  var vaultCard: js.UndefOr[Boolean] = js.undefined
}

object AnonAllowVaultCardOverride {
  @scala.inline
  def apply(
    allowVaultCardOverride: js.UndefOr[Boolean] = js.undefined,
    vaultCard: js.UndefOr[Boolean] = js.undefined
  ): AnonAllowVaultCardOverride = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowVaultCardOverride)) __obj.updateDynamic("allowVaultCardOverride")(allowVaultCardOverride.asInstanceOf[js.Any])
    if (!js.isUndefined(vaultCard)) __obj.updateDynamic("vaultCard")(vaultCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowVaultCardOverride]
  }
}

