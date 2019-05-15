package typings
package coinbaseDashCommerceDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coinbaseDashCommerceDashNodeMod {
  /**
    * Node callback
    */
  type Callback[T] = js.Function2[/* error */ js.Any, /* response */ T, scala.Unit]
  /**
    * Create a charge.
    *
    * @link https://commerce.coinbase.com/docs/api/#charge-resource
    */
  type CreateCharge = BaseCharge with (FixedPrice | NoPrice)
  /**
    * Create a checkout.
    *
    * @link https://commerce.coinbase.com/docs/api/#create-a-checkout
    */
  type CreateCheckout = BaseCheckout with (FixedPrice | NoPrice)
  /**
    * Crypto pricing object.
    */
  type CryptoPricing = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in coinbase-commerce-node.coinbase-commerce-node.CryptoName ]:? coinbase-commerce-node.coinbase-commerce-node.Price<coinbase-commerce-node.coinbase-commerce-node.CryptoCurrency>}
    */ coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.CryptoPricing with js.Any
  /**
    * Fiat currency.
    */
  /* Rewritten from type alias, can be one of: 
    - coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.USD
    - coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.GBP
    - coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.EUR
    - java.lang.String
  */
  type FiatCurrency = _FiatCurrency | java.lang.String
  /**
    * Key-value object.
    */
  type KeyVal = org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * Pagination callback.
    */
  type PaginationCallback[T] = js.Function3[
    /* error */ js.Any, 
    /* response */ js.Array[T], 
    /* pagination */ Pagination, 
    scala.Unit
  ]
  /**
    * Update a checkout resource.
    *
    * @link https://commerce.coinbase.com/docs/api/#update-a-checkout
    */
  type UpdateCheckout = coinbaseDashCommerceDashNodeLib.Omit[
    CreateCheckout, 
    coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.pricing_type
  ]
}
