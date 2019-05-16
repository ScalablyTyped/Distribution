package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmountOptions extends js.Object {
  var amount: java.lang.String
  var options: Anon_SubmitForSettlement
}

object Anon_AmountOptions {
  @scala.inline
  def apply(amount: java.lang.String, options: Anon_SubmitForSettlement): Anon_AmountOptions = {
    val __obj = js.Dynamic.literal(amount = amount, options = options)
  
    __obj.asInstanceOf[Anon_AmountOptions]
  }
}

