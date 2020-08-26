package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakeDefault extends js.Object {
  var failOnDuplicatePaymentMethod: js.UndefOr[Boolean] = js.native
  var makeDefault: js.UndefOr[Boolean] = js.native
  var verificationAmount: js.UndefOr[String] = js.native
  var verificationMerchantAccountId: js.UndefOr[String] = js.native
  var verifyCard: js.UndefOr[Boolean] = js.native
}

object MakeDefault {
  @scala.inline
  def apply(): MakeDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeDefault]
  }
  @scala.inline
  implicit class MakeDefaultOps[Self <: MakeDefault] (val x: Self) extends AnyVal {
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
    def setFailOnDuplicatePaymentMethod(value: Boolean): Self = this.set("failOnDuplicatePaymentMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailOnDuplicatePaymentMethod: Self = this.set("failOnDuplicatePaymentMethod", js.undefined)
    @scala.inline
    def setMakeDefault(value: Boolean): Self = this.set("makeDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMakeDefault: Self = this.set("makeDefault", js.undefined)
    @scala.inline
    def setVerificationAmount(value: String): Self = this.set("verificationAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerificationAmount: Self = this.set("verificationAmount", js.undefined)
    @scala.inline
    def setVerificationMerchantAccountId(value: String): Self = this.set("verificationMerchantAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerificationMerchantAccountId: Self = this.set("verificationMerchantAccountId", js.undefined)
    @scala.inline
    def setVerifyCard(value: Boolean): Self = this.set("verifyCard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifyCard: Self = this.set("verifyCard", js.undefined)
  }
  
}

