package typings.coinbaseCommerceNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pricing object.
  */
trait Pricing extends CryptoPricing {
  var local: Price[FiatCurrency]
}

object Pricing {
  @scala.inline
  def apply(
    local: Price[FiatCurrency],
    bitcoin: Price[CryptoCurrency] = null,
    bitcoincash: Price[CryptoCurrency] = null,
    ethereum: Price[CryptoCurrency] = null,
    litecoin: Price[CryptoCurrency] = null,
    usdc: Price[CryptoCurrency] = null
  ): Pricing = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    if (bitcoin != null) __obj.updateDynamic("bitcoin")(bitcoin.asInstanceOf[js.Any])
    if (bitcoincash != null) __obj.updateDynamic("bitcoincash")(bitcoincash.asInstanceOf[js.Any])
    if (ethereum != null) __obj.updateDynamic("ethereum")(ethereum.asInstanceOf[js.Any])
    if (litecoin != null) __obj.updateDynamic("litecoin")(litecoin.asInstanceOf[js.Any])
    if (usdc != null) __obj.updateDynamic("usdc")(usdc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pricing]
  }
}

