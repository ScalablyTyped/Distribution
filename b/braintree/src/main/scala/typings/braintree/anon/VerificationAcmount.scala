package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerificationAcmount extends js.Object {
  var makeDefault: js.UndefOr[Boolean] = js.native
  var verificationAcmount: js.UndefOr[String] = js.native
  var verificationMerchantAccountId: js.UndefOr[String] = js.native
  var verifyCard: js.UndefOr[Boolean] = js.native
}

object VerificationAcmount {
  @scala.inline
  def apply(): VerificationAcmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerificationAcmount]
  }
  @scala.inline
  implicit class VerificationAcmountOps[Self <: VerificationAcmount] (val x: Self) extends AnyVal {
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
    def setMakeDefault(value: Boolean): Self = this.set("makeDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMakeDefault: Self = this.set("makeDefault", js.undefined)
    @scala.inline
    def setVerificationAcmount(value: String): Self = this.set("verificationAcmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerificationAcmount: Self = this.set("verificationAcmount", js.undefined)
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

