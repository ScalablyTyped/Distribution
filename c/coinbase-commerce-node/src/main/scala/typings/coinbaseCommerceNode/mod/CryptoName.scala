package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.usdc_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Full crypto currency name.
  */
/* Rewritten from type alias, can be one of: 
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.bitcoin
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.ethereum
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.bitcoincash
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.litecoin
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.usdc_
*/
trait CryptoName extends js.Object

object CryptoName {
  @scala.inline
  def bitcoin: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.bitcoin = this.cast("bitcoin")
  @scala.inline
  def bitcoincash: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.bitcoincash = this.cast("bitcoincash")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ethereum: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.ethereum = this.cast("ethereum")
  @scala.inline
  def litecoin: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.litecoin = this.cast("litecoin")
  @scala.inline
  def usdc: usdc_ = this.cast("usdc")
}

