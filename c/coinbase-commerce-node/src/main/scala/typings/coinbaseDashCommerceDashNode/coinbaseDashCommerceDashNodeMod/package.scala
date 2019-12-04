package typings.coinbaseDashCommerceDashNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coinbaseDashCommerceDashNodeMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.pricing_type
  import typings.std.Exclude
  import typings.std.Pick

  /**
    * Node callback
    */
  type Callback[T] = js.Function2[/* error */ js.Any, /* response */ T, Unit]
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
  type CryptoPricing = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in coinbase-commerce-node.coinbase-commerce-node.CryptoName ]:? coinbase-commerce-node.coinbase-commerce-node.Price<coinbase-commerce-node.coinbase-commerce-node.CryptoCurrency>}
    */ typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.CryptoPricing with js.Any
  /**
    * Fiat currency.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.USD
    - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.GBP
    - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.EUR
    - java.lang.String
  */
  type FiatCurrency = _FiatCurrency | String
  /**
    * Key-value object.
    */
  type KeyVal = StringDictionary[js.Any]
  /**
    * Omit a property from the given type.
    */
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  /**
    * Pagination callback.
    */
  type PaginationCallback[T] = js.Function3[/* error */ js.Any, /* response */ js.Array[T], /* pagination */ Pagination, Unit]
  /**
    * Timestamp string.
    * ISO 8601
    */
  type Timestamp = String
  /**
    * Update a checkout resource.
    *
    * @link https://commerce.coinbase.com/docs/api/#update-a-checkout
    */
  type UpdateCheckout = Omit[CreateCheckout, pricing_type]
}
