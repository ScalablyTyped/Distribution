package typings.creditkeyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("creditkey-js", "CartItem")
@js.native
class CartItem protected () extends js.Object {
  def this(merchantProductId: String, name: String, price: Double, sku: String, quantity: Double) = this()
  def this(merchantProductId: String, name: String, price: Double, sku: Null, quantity: Double) = this()
  def this(
    merchantProductId: String,
    name: String,
    price: Double,
    sku: String,
    quantity: Double,
    size: String
  ) = this()
  def this(merchantProductId: String, name: String, price: Double, sku: Null, quantity: Double, size: String) = this()
  def this(
    merchantProductId: String,
    name: String,
    price: Double,
    sku: String,
    quantity: Double,
    size: String,
    color: String
  ) = this()
  def this(
    merchantProductId: String,
    name: String,
    price: Double,
    sku: String,
    quantity: Double,
    size: Null,
    color: String
  ) = this()
  def this(
    merchantProductId: String,
    name: String,
    price: Double,
    sku: Null,
    quantity: Double,
    size: String,
    color: String
  ) = this()
  def this(
    merchantProductId: String,
    name: String,
    price: Double,
    sku: Null,
    quantity: Double,
    size: Null,
    color: String
  ) = this()
  
  def is_valid_item(): Boolean = js.native
}
