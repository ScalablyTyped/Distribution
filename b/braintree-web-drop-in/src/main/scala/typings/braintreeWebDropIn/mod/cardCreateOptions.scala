package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.anon.AllowVaultCardOverride
import typings.braintreeWebDropIn.anon.Fields
import typings.braintreeWebDropIn.anon.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cardCreateOptions extends js.Object {
  var cardholderName: js.UndefOr[Boolean | Required] = js.undefined
  var clearFieldsAfterTokenization: js.UndefOr[Boolean] = js.undefined
  var overrides: Fields
  var vault: js.UndefOr[AllowVaultCardOverride] = js.undefined
}

object cardCreateOptions {
  @scala.inline
  def apply(
    overrides: Fields,
    cardholderName: Boolean | Required = null,
    clearFieldsAfterTokenization: js.UndefOr[Boolean] = js.undefined,
    vault: AllowVaultCardOverride = null
  ): cardCreateOptions = {
    val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any])
    if (cardholderName != null) __obj.updateDynamic("cardholderName")(cardholderName.asInstanceOf[js.Any])
    if (!js.isUndefined(clearFieldsAfterTokenization)) __obj.updateDynamic("clearFieldsAfterTokenization")(clearFieldsAfterTokenization.get.asInstanceOf[js.Any])
    if (vault != null) __obj.updateDynamic("vault")(vault.asInstanceOf[js.Any])
    __obj.asInstanceOf[cardCreateOptions]
  }
}

