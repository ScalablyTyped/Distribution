package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChargeback extends js.Object {
  var Chargeback: String
}

object AnonChargeback {
  @scala.inline
  def apply(Chargeback: String): AnonChargeback = {
    val __obj = js.Dynamic.literal(Chargeback = Chargeback.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChargeback]
  }
}

