package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var amount: String
  var options: SubmitForSettlement
}

object Options {
  @scala.inline
  def apply(amount: String, options: SubmitForSettlement): Options = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

