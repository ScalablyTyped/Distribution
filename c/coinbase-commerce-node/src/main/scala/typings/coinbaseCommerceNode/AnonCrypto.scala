package typings.coinbaseCommerceNode

import typings.coinbaseCommerceNode.mod.CryptoCurrency
import typings.coinbaseCommerceNode.mod.FiatCurrency
import typings.coinbaseCommerceNode.mod.Price
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCrypto extends js.Object {
  var crypto: Price[CryptoCurrency]
  var local: Price[FiatCurrency]
}

object AnonCrypto {
  @scala.inline
  def apply(crypto: Price[CryptoCurrency], local: Price[FiatCurrency]): AnonCrypto = {
    val __obj = js.Dynamic.literal(crypto = crypto.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCrypto]
  }
}

