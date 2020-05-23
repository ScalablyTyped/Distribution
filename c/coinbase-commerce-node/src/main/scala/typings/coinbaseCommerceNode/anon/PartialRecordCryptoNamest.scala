package typings.coinbaseCommerceNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<coinbase-commerce-node.coinbase-commerce-node.CryptoName, string>> */
trait PartialRecordCryptoNamest extends js.Object {
  var bitcoin: js.UndefOr[String] = js.undefined
  var bitcoincash: js.UndefOr[String] = js.undefined
  var ethereum: js.UndefOr[String] = js.undefined
  var litecoin: js.UndefOr[String] = js.undefined
  var usdc: js.UndefOr[String] = js.undefined
}

object PartialRecordCryptoNamest {
  @scala.inline
  def apply(
    bitcoin: String = null,
    bitcoincash: String = null,
    ethereum: String = null,
    litecoin: String = null,
    usdc: String = null
  ): PartialRecordCryptoNamest = {
    val __obj = js.Dynamic.literal()
    if (bitcoin != null) __obj.updateDynamic("bitcoin")(bitcoin.asInstanceOf[js.Any])
    if (bitcoincash != null) __obj.updateDynamic("bitcoincash")(bitcoincash.asInstanceOf[js.Any])
    if (ethereum != null) __obj.updateDynamic("ethereum")(ethereum.asInstanceOf[js.Any])
    if (litecoin != null) __obj.updateDynamic("litecoin")(litecoin.asInstanceOf[js.Any])
    if (usdc != null) __obj.updateDynamic("usdc")(usdc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRecordCryptoNamest]
  }
}

