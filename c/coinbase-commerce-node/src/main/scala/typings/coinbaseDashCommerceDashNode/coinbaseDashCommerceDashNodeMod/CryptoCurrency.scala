package typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Crypto currency.
  */
/* Rewritten from type alias, can be one of: 
  - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.BTC
  - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.ETH
  - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.BCH
  - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.LTC
  - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.USDC
*/
trait CryptoCurrency extends js.Object

object CryptoCurrency {
  @scala.inline
  def BCH: typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.BCH = this.cast("BCH")
  @scala.inline
  def BTC: typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.BTC = this.cast("BTC")
  @scala.inline
  def ETH: typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.ETH = this.cast("ETH")
  @scala.inline
  def LTC: typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.LTC = this.cast("LTC")
  @scala.inline
  def USDC: typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.USDC = this.cast("USDC")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

