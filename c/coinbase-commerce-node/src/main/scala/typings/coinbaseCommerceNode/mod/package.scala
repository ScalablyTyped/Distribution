package typings.coinbaseCommerceNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Node callback
    */
  type Callback[T] = js.Function2[/* error */ js.Any, /* response */ T, scala.Unit]
  /**
    * Create a charge.
    *
    * @link https://commerce.coinbase.com/docs/api/#charge-resource
    */
  type CreateCharge = typings.coinbaseCommerceNode.mod.BaseCharge with (typings.coinbaseCommerceNode.mod.FixedPrice | typings.coinbaseCommerceNode.mod.NoPrice)
  /**
    * Create a checkout.
    *
    * @link https://commerce.coinbase.com/docs/api/#create-a-checkout
    */
  type CreateCheckout = typings.coinbaseCommerceNode.mod.BaseCheckout with (typings.coinbaseCommerceNode.mod.FixedPrice | typings.coinbaseCommerceNode.mod.NoPrice)
  /**
    * Crypto pricing object.
    */
  type CryptoPricing = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in coinbase-commerce-node.coinbase-commerce-node.CryptoName ]:? coinbase-commerce-node.coinbase-commerce-node.Price<coinbase-commerce-node.coinbase-commerce-node.CryptoCurrency>}
    */ typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.CryptoPricing with js.Any
  /**
    * Fiat currency.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.USD
    - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.GBP
    - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.EUR
    - java.lang.String
  */
  type FiatCurrency = typings.coinbaseCommerceNode.mod._FiatCurrency | java.lang.String
  /**
    * Key-value object.
    */
  type KeyVal = org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * Omit a property from the given type.
    */
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  /**
    * Pagination callback.
    */
  type PaginationCallback[T] = js.Function3[
    /* error */ js.Any, 
    /* response */ js.Array[T], 
    /* pagination */ typings.coinbaseCommerceNode.mod.Pagination, 
    scala.Unit
  ]
  /**
    * Timestamp string.
    * ISO 8601
    */
  type Timestamp = java.lang.String
  /**
    * Update a checkout resource.
    *
    * @link https://commerce.coinbase.com/docs/api/#update-a-checkout
    */
  type UpdateCheckout = typings.coinbaseCommerceNode.mod.Omit[
    typings.coinbaseCommerceNode.mod.CreateCheckout, 
    typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.pricing_type
  ]
}
