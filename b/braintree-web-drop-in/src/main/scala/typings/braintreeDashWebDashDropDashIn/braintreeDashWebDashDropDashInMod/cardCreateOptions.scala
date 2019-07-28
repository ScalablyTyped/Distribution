package typings.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInMod

import typings.braintreeDashWebDashDropDashIn.Anon_AllowVaultCardOverride
import typings.braintreeDashWebDashDropDashIn.Anon_Fields
import typings.braintreeDashWebDashDropDashIn.Anon_Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cardCreateOptions extends js.Object {
  var cardholderName: js.UndefOr[Boolean | Anon_Required] = js.undefined
  var clearFieldsAfterTokenization: js.UndefOr[Boolean] = js.undefined
  var overrides: Anon_Fields
  var vault: js.UndefOr[Anon_AllowVaultCardOverride] = js.undefined
}

object cardCreateOptions {
  @scala.inline
  def apply(
    overrides: Anon_Fields,
    cardholderName: Boolean | Anon_Required = null,
    clearFieldsAfterTokenization: js.UndefOr[Boolean] = js.undefined,
    vault: Anon_AllowVaultCardOverride = null
  ): cardCreateOptions = {
    val __obj = js.Dynamic.literal(overrides = overrides)
    if (cardholderName != null) __obj.updateDynamic("cardholderName")(cardholderName.asInstanceOf[js.Any])
    if (!js.isUndefined(clearFieldsAfterTokenization)) __obj.updateDynamic("clearFieldsAfterTokenization")(clearFieldsAfterTokenization)
    if (vault != null) __obj.updateDynamic("vault")(vault)
    __obj.asInstanceOf[cardCreateOptions]
  }
}

