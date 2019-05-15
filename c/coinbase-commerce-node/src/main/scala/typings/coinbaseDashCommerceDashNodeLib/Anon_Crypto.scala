package typings
package coinbaseDashCommerceDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Crypto extends js.Object {
  var crypto: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Price[coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.CryptoCurrency]
  var local: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Price[coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.FiatCurrency]
}

object Anon_Crypto {
  @scala.inline
  def apply(
    crypto: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Price[coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.CryptoCurrency],
    local: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Price[coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.FiatCurrency]
  ): Anon_Crypto = {
    val __obj = js.Dynamic.literal(crypto = crypto, local = local)
  
    __obj.asInstanceOf[Anon_Crypto]
  }
}

