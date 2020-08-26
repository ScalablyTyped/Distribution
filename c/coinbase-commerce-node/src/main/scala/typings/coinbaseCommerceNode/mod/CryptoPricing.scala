package typings.coinbaseCommerceNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Crypto pricing object.
  */
/* Inlined {[ key in coinbase-commerce-node.coinbase-commerce-node.CryptoName ]:? coinbase-commerce-node.coinbase-commerce-node.Price<coinbase-commerce-node.coinbase-commerce-node.CryptoCurrency>} */
@js.native
trait CryptoPricing extends js.Object {
  var bitcoin: js.UndefOr[Price[CryptoCurrency]] = js.native
  var bitcoincash: js.UndefOr[Price[CryptoCurrency]] = js.native
  var ethereum: js.UndefOr[Price[CryptoCurrency]] = js.native
  var litecoin: js.UndefOr[Price[CryptoCurrency]] = js.native
  var usdc: js.UndefOr[Price[CryptoCurrency]] = js.native
}

object CryptoPricing {
  @scala.inline
  def apply(): CryptoPricing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoPricing]
  }
  @scala.inline
  implicit class CryptoPricingOps[Self <: CryptoPricing] (val x: Self) extends AnyVal {
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
    def setBitcoin(value: Price[CryptoCurrency]): Self = this.set("bitcoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitcoin: Self = this.set("bitcoin", js.undefined)
    @scala.inline
    def setBitcoincash(value: Price[CryptoCurrency]): Self = this.set("bitcoincash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitcoincash: Self = this.set("bitcoincash", js.undefined)
    @scala.inline
    def setEthereum(value: Price[CryptoCurrency]): Self = this.set("ethereum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEthereum: Self = this.set("ethereum", js.undefined)
    @scala.inline
    def setLitecoin(value: Price[CryptoCurrency]): Self = this.set("litecoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLitecoin: Self = this.set("litecoin", js.undefined)
    @scala.inline
    def setUsdc(value: Price[CryptoCurrency]): Self = this.set("usdc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsdc: Self = this.set("usdc", js.undefined)
  }
  
}

