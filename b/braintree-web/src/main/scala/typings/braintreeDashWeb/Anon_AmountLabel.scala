package typings.braintreeDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmountLabel extends js.Object {
  var amount: String
  var label: String
}

object Anon_AmountLabel {
  @scala.inline
  def apply(amount: String, label: String): Anon_AmountLabel = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AmountLabel]
  }
}

