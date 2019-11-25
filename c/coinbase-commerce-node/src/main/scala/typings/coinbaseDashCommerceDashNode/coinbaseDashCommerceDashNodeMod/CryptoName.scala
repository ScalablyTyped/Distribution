package typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod

import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.usdc_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Full crypto currency name.
  */
/* Rewritten from type alias, can be one of: 
  - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.bitcoin
  - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.ethereum
  - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.bitcoincash
  - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.litecoin
  - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.usdc_
*/
trait CryptoName extends js.Object

object CryptoName {
  @scala.inline
  def bitcoin: typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.bitcoin = this.cast("bitcoin")
  @scala.inline
  def bitcoincash: typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.bitcoincash = this.cast("bitcoincash")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ethereum: typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.ethereum = this.cast("ethereum")
  @scala.inline
  def litecoin: typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.litecoin = this.cast("litecoin")
  @scala.inline
  def usdc: usdc_ = this.cast("usdc")
}

