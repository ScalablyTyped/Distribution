package typings.coinbaseCommerceNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Crypto currency.
  */
/* Rewritten from type alias, can be one of: 
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.BTC
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.ETH
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.BCH
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.LTC
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.USDC
*/
trait CryptoCurrency extends js.Object

object CryptoCurrency {
  @scala.inline
  def BCH: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.BCH = this.cast("BCH")
  @scala.inline
  def BTC: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.BTC = this.cast("BTC")
  @scala.inline
  def ETH: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.ETH = this.cast("ETH")
  @scala.inline
  def LTC: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.LTC = this.cast("LTC")
  @scala.inline
  def USDC: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.USDC = this.cast("USDC")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

