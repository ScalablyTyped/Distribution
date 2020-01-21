package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.AnonAllowVaultCardOverride
import typings.braintreeWebDropIn.AnonFields
import typings.braintreeWebDropIn.AnonRequired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cardCreateOptions extends js.Object {
  var cardholderName: js.UndefOr[Boolean | AnonRequired] = js.undefined
  var clearFieldsAfterTokenization: js.UndefOr[Boolean] = js.undefined
  var overrides: AnonFields
  var vault: js.UndefOr[AnonAllowVaultCardOverride] = js.undefined
}

object cardCreateOptions {
  @scala.inline
  def apply(
    overrides: AnonFields,
    cardholderName: Boolean | AnonRequired = null,
    clearFieldsAfterTokenization: js.UndefOr[Boolean] = js.undefined,
    vault: AnonAllowVaultCardOverride = null
  ): cardCreateOptions = {
    val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any])
    if (cardholderName != null) __obj.updateDynamic("cardholderName")(cardholderName.asInstanceOf[js.Any])
    if (!js.isUndefined(clearFieldsAfterTokenization)) __obj.updateDynamic("clearFieldsAfterTokenization")(clearFieldsAfterTokenization.asInstanceOf[js.Any])
    if (vault != null) __obj.updateDynamic("vault")(vault.asInstanceOf[js.Any])
    __obj.asInstanceOf[cardCreateOptions]
  }
}

