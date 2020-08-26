package typings.coinbaseCommerceNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<coinbase-commerce-node.coinbase-commerce-node.CryptoName, string>> */
@js.native
trait PartialRecordCryptoNamest extends js.Object {
  var bitcoin: js.UndefOr[String] = js.native
  var bitcoincash: js.UndefOr[String] = js.native
  var ethereum: js.UndefOr[String] = js.native
  var litecoin: js.UndefOr[String] = js.native
  var usdc: js.UndefOr[String] = js.native
}

object PartialRecordCryptoNamest {
  @scala.inline
  def apply(): PartialRecordCryptoNamest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordCryptoNamest]
  }
  @scala.inline
  implicit class PartialRecordCryptoNamestOps[Self <: PartialRecordCryptoNamest] (val x: Self) extends AnyVal {
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
    def setBitcoin(value: String): Self = this.set("bitcoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitcoin: Self = this.set("bitcoin", js.undefined)
    @scala.inline
    def setBitcoincash(value: String): Self = this.set("bitcoincash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitcoincash: Self = this.set("bitcoincash", js.undefined)
    @scala.inline
    def setEthereum(value: String): Self = this.set("ethereum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEthereum: Self = this.set("ethereum", js.undefined)
    @scala.inline
    def setLitecoin(value: String): Self = this.set("litecoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLitecoin: Self = this.set("litecoin", js.undefined)
    @scala.inline
    def setUsdc(value: String): Self = this.set("usdc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsdc: Self = this.set("usdc", js.undefined)
  }
  
}

