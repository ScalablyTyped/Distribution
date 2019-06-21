package typings
package braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cardCreateOptions extends js.Object {
  var cardholderName: js.UndefOr[scala.Boolean | braintreeDashWebDashDropDashInLib.Anon_Required] = js.undefined
  var clearFieldsAfterTokenization: js.UndefOr[scala.Boolean] = js.undefined
  var overrides: braintreeDashWebDashDropDashInLib.Anon_Fields
  var vault: js.UndefOr[braintreeDashWebDashDropDashInLib.Anon_AllowVaultCardOverride] = js.undefined
}

object cardCreateOptions {
  @scala.inline
  def apply(
    overrides: braintreeDashWebDashDropDashInLib.Anon_Fields,
    cardholderName: scala.Boolean | braintreeDashWebDashDropDashInLib.Anon_Required = null,
    clearFieldsAfterTokenization: js.UndefOr[scala.Boolean] = js.undefined,
    vault: braintreeDashWebDashDropDashInLib.Anon_AllowVaultCardOverride = null
  ): cardCreateOptions = {
    val __obj = js.Dynamic.literal(overrides = overrides)
    if (cardholderName != null) __obj.updateDynamic("cardholderName")(cardholderName.asInstanceOf[js.Any])
    if (!js.isUndefined(clearFieldsAfterTokenization)) __obj.updateDynamic("clearFieldsAfterTokenization")(clearFieldsAfterTokenization)
    if (vault != null) __obj.updateDynamic("vault")(vault)
    __obj.asInstanceOf[cardCreateOptions]
  }
}

