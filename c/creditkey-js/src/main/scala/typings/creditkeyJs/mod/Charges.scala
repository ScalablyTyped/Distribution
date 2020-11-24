package typings.creditkeyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("creditkey-js", "Charges")
@js.native
class Charges protected () extends js.Object {
  def this(total: Double, shipping: Double, tax: Double, discount_amount: Double, grand_total: Double) = this()
  
  def is_valid_money_value(value: Double): Boolean = js.native
  
  def validate_charges(): Boolean = js.native
}
