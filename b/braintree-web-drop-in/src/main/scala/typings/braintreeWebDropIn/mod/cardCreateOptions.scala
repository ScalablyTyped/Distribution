package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.anon.AllowVaultCardOverride
import typings.braintreeWebDropIn.anon.Fields
import typings.braintreeWebDropIn.anon.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cardCreateOptions extends js.Object {
  var cardholderName: js.UndefOr[Boolean | Required] = js.native
  var clearFieldsAfterTokenization: js.UndefOr[Boolean] = js.native
  var overrides: Fields = js.native
  var vault: js.UndefOr[AllowVaultCardOverride] = js.native
}

object cardCreateOptions {
  @scala.inline
  def apply(overrides: Fields): cardCreateOptions = {
    val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[cardCreateOptions]
  }
  @scala.inline
  implicit class cardCreateOptionsOps[Self <: cardCreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOverrides(value: Fields): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardholderName(value: Boolean | Required): Self = this.set("cardholderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardholderName: Self = this.set("cardholderName", js.undefined)
    @scala.inline
    def setClearFieldsAfterTokenization(value: Boolean): Self = this.set("clearFieldsAfterTokenization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearFieldsAfterTokenization: Self = this.set("clearFieldsAfterTokenization", js.undefined)
    @scala.inline
    def setVault(value: AllowVaultCardOverride): Self = this.set("vault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVault: Self = this.set("vault", js.undefined)
  }
  
}

