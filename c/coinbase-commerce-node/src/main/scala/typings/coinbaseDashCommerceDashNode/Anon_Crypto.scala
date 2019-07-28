package typings.coinbaseDashCommerceDashNode

import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod.CryptoCurrency
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod.FiatCurrency
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod.Price
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Crypto extends js.Object {
  var crypto: Price[CryptoCurrency]
  var local: Price[FiatCurrency]
}

object Anon_Crypto {
  @scala.inline
  def apply(crypto: Price[CryptoCurrency], local: Price[FiatCurrency]): Anon_Crypto = {
    val __obj = js.Dynamic.literal(crypto = crypto, local = local)
  
    __obj.asInstanceOf[Anon_Crypto]
  }
}

