package typings.coinbaseCommerceNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Crypto pricing object.
  */
/* Inlined {[ key in coinbase-commerce-node.coinbase-commerce-node.CryptoName ]:? coinbase-commerce-node.coinbase-commerce-node.Price<coinbase-commerce-node.coinbase-commerce-node.CryptoCurrency>} */
trait CryptoPricing extends js.Object {
  var bitcoin: js.UndefOr[Price[CryptoCurrency]] = js.undefined
  var bitcoincash: js.UndefOr[Price[CryptoCurrency]] = js.undefined
  var ethereum: js.UndefOr[Price[CryptoCurrency]] = js.undefined
  var litecoin: js.UndefOr[Price[CryptoCurrency]] = js.undefined
  var usdc: js.UndefOr[Price[CryptoCurrency]] = js.undefined
}

object CryptoPricing {
  @scala.inline
  def apply(
    bitcoin: Price[CryptoCurrency] = null,
    bitcoincash: Price[CryptoCurrency] = null,
    ethereum: Price[CryptoCurrency] = null,
    litecoin: Price[CryptoCurrency] = null,
    usdc: Price[CryptoCurrency] = null
  ): CryptoPricing = {
    val __obj = js.Dynamic.literal()
    if (bitcoin != null) __obj.updateDynamic("bitcoin")(bitcoin.asInstanceOf[js.Any])
    if (bitcoincash != null) __obj.updateDynamic("bitcoincash")(bitcoincash.asInstanceOf[js.Any])
    if (ethereum != null) __obj.updateDynamic("ethereum")(ethereum.asInstanceOf[js.Any])
    if (litecoin != null) __obj.updateDynamic("litecoin")(litecoin.asInstanceOf[js.Any])
    if (usdc != null) __obj.updateDynamic("usdc")(usdc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoPricing]
  }
}

