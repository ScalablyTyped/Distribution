package typings.coinbaseCommerceNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pricing object.
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ key in coinbase-commerce-node.coinbase-commerce-node.CryptoName ]:? coinbase-commerce-node.coinbase-commerce-node.Price<coinbase-commerce-node.coinbase-commerce-node.CryptoCurrency>} */ trait Pricing extends js.Object {
  var local: Price[FiatCurrency]
}

object Pricing {
  @scala.inline
  def apply(local: Price[FiatCurrency]): Pricing = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Pricing]
  }
}

