package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmountOptions extends js.Object {
  var amount: String
  var options: Anon_SubmitForSettlement
}

object Anon_AmountOptions {
  @scala.inline
  def apply(amount: String, options: Anon_SubmitForSettlement): Anon_AmountOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AmountOptions]
  }
}

